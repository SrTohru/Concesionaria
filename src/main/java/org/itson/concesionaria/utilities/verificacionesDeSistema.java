package org.itson.concesionaria.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Vehiculo;

public class verificacionesDeSistema {

    private final entityManager em = new entityManager();
    private costoPlacas costoPlaca = new costoPlacas();

    public boolean verificarFormatoFecha(String fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String inputText = fecha;

        try {
            Date date = dateFormat.parse(inputText);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public boolean preguntaCerrar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea cerrar el programa?", "Cerrar programa", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }

    public boolean preguntaConfirmar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea registrar esta licencia?", "Confirmacion de pago", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }

    public boolean preguntaCancelarTramite() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea cancelar este tramite?", "Confirmacion de cancelacion", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }

    public Persona verificarPersonaPorRFC(String rfc) {
        try {
            String consulta = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = em.getEntityManager().createQuery(consulta, Persona.class);
            query.setParameter("rfc", rfc);
            return query.getSingleResult();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Disculpe, el 'RFC: " + rfc + "' no existe en nuestra base de datos, ingreselo nuevamente.", "Error al encontrar 'RFC'", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void desactivarOtrasPlacas(Auto auto, Placas placas) {
        for (int i = 0; i < auto.getPlacas().size(); i++) {
            if (auto.getPlacas().get(i) != placas) {
                auto.getPlacas().get(i).setEstadosPlaca(estadosPlaca.DESACTIVA);
            }
        }
    }

    public Auto consultarExistenciaVehiculoPorSerie(String serie) {
        try {
            TypedQuery<Auto> query = em.getEntityManager().createQuery(
                    "SELECT v FROM Auto v WHERE v.serie = :serie", Auto.class);
            query.setParameter("serie", serie);
            Auto auto = query.getSingleResult();

            if (auto != null) {
                JOptionPane.showMessageDialog(null, "Ese vehiculo si existe");
                return auto;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ese vehiculo no existe");
        }
        return null;
    }

    public String generarPlacas() {
        StringBuilder sb = new StringBuilder();
        do {
            Random rnd = new Random();

            char[] letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            int numeroAleatorio = rnd.nextInt(9) + 1;

            for (int i = 0; i < 3; i++) {
                char letraAleatoria = letras[rnd.nextInt(letras.length)];
                sb.append(letraAleatoria);
            }
            sb.append("-");

            sb.append(numeroAleatorio);
            sb.append(rnd.nextInt(9) + 1);
            sb.append(rnd.nextInt(9) + 1);

        } while (existePlaca(sb.toString()));
        return sb.toString();
    }

    public boolean existePlaca(String codigoPlaca) {
        try {

            Query query = em.getEntityManager().createQuery("SELECT COUNT(p) FROM Placas p WHERE p.codigoPlacas = :codigoPlaca");
            query.setParameter("codigoPlaca", codigoPlaca);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } catch (Exception ex) {
            return false;
        }
    }

    public Auto verificarExistenciaAutoPorSerie(String serie){
        
        Auto autoEncontrado = em.getEntityManager().find(Auto.class, serie);

        if (autoEncontrado == null) {
            System.out.println("No se encontró un auto con la serie " + serie);
        } else {
            System.out.println("Se encontró un auto con la serie " + serie + ": " + autoEncontrado);
        }
        return null;
    }
    
    
    public List<Persona> consultarPersonasMedianteInformacion(String nombres, String apellidoPaterno, String apellidoMaterno) {
        String jpql = "SELECT p FROM Persona p WHERE p.nombres LIKE :nombres AND (p.apellidoPaterno LIKE :apellidoPaterno OR p.apellidoPaterno IS NULL) AND (p.apellidoMaterno LIKE :apellidoMaterno OR p.apellidoMaterno IS NULL)";
        TypedQuery<Persona> consulta = em.getEntityManager().createQuery(jpql, Persona.class);
        consulta.setParameter("nombres", "%" + nombres + "%");
        consulta.setParameter("apellidoPaterno", "%" + apellidoPaterno + "%");
        consulta.setParameter("apellidoMaterno", "%" + apellidoMaterno + "%");
    
        return consulta.getResultList();

    }

    public int verificarAutoNuevo(Auto auto) {
        if (auto.getPlacas().size() >= 1) {
            return costoPlaca.getPLACAS_AUTO_USADO();
        } else {

            return costoPlaca.getPLACAS_AUTO_NUEVO();
        }
    }
}
