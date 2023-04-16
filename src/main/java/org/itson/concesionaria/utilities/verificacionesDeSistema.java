package org.itson.concesionaria.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Vehiculo;

public class verificacionesDeSistema {

    private final eManager em = new eManager();
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
        TypedQuery<Placas> query = em.getEntityManager().createQuery(
                "SELECT l FROM Placas l WHERE l.idAuto = :auto AND l.estadosPlaca = :estadosPlaca",
                Placas.class);
        query.setParameter("auto", auto.getId());
        query.setParameter("estadosPlaca", estadosPlaca.ACTIVA);

        List<Placas> placasActivas = query.getResultList();

        if (!placasActivas.isEmpty()) {
            em.getEntityManager().getTransaction().begin();
            for (Placas placa : placasActivas) {

                placa.setEstadosPlaca(estadosPlaca.DESACTIVA);
                em.getEntityManager().merge(placa);

            }
            em.getEntityManager().getTransaction().commit();
        }
    }

    public boolean tieneLicenciasRegistradas(Persona persona) {

        boolean tieneLicencias = false;

        Query q = em.getEntityManager().createQuery("SELECT l FROM Licencia l WHERE l.persona.id = :personaId");
        q.setParameter("personaId", persona.getId());
        List<Licencia> licencias = q.getResultList();
        try {
            if (!licencias.isEmpty()) {
                return true;

            }
        } catch (NoResultException e) {

        }
        return false;
    }

    public boolean cuentaConLicenciaActiva(Persona persona) {
        TypedQuery<Licencia> query = em.getEntityManager().createQuery(
                "SELECT l FROM Licencia l WHERE l.persona = :persona AND l.estadoLicencia = :estadoLicencia",
                Licencia.class);
        query.setParameter("persona", persona);
        query.setParameter("estadoLicencia", estadosLicencia.ACTIVA);

        try {
            Licencia lic = query.getSingleResult();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }

    public void desactivarOtrasLicencias(Persona Persona) {

        TypedQuery<Licencia> query = em.getEntityManager().createQuery(
                "SELECT l FROM Licencia l WHERE l.persona = :persona AND l.estadoLicencia = :estadoLicencia",
                Licencia.class);
        query.setParameter("persona", Persona);
        query.setParameter("estadoLicencia", estadosLicencia.ACTIVA);

        List<Licencia> licenciasActivas = query.getResultList();

        if (!licenciasActivas.isEmpty()) {
            em.getEntityManager().getTransaction().begin();
            for (Licencia lic : licenciasActivas) {

                lic.setEstadoLicencia(estadosLicencia.DESACTIVA);
                em.getEntityManager().merge(lic);

            }
            em.getEntityManager().getTransaction().commit();
        }
    }

    public Auto consultarExistenciaVehiculoPorSerie(String serie) {
        try {
            TypedQuery<Auto> query = em.getEntityManager().createQuery(
                    "SELECT v FROM Auto v WHERE v.serie = :serie", Auto.class);
            query.setParameter("serie", serie);
            Auto auto = query.getSingleResult();

            if (auto != null) {
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

    public Auto verificarExistenciaAutoPorSerie(String serie) {

        Auto autoEncontrado = em.getEntityManager().find(Auto.class, serie);

        if (autoEncontrado == null) {
            System.out.println("No se encontró un auto con la serie " + serie);
        } else {
            System.out.println("Se encontró un auto con la serie " + serie + ": " + autoEncontrado);
        }
        return null;
    }

    public List<Persona> consultarPersonasMedianteInformacion(String nombres, String apellidoPaterno, String apellidoMaterno) {
        try {
            String jpql = "SELECT p FROM Persona p WHERE p.nombres LIKE :nombres AND (p.apellidoPaterno LIKE :apellidoPaterno OR p.apellidoPaterno IS NULL) AND (p.apellidoMaterno LIKE :apellidoMaterno OR p.apellidoMaterno IS NULL)";
            TypedQuery<Persona> consulta = em.getEntityManager().createQuery(jpql, Persona.class);
            consulta.setParameter("nombres", "%" + encriptador.encriptar(nombres) + "%");
            consulta.setParameter("apellidoPaterno", "%" + encriptador.encriptar(apellidoPaterno) + "%");
            consulta.setParameter("apellidoMaterno", "%" + encriptador.encriptar(apellidoMaterno) + "%");

            return consulta.getResultList();
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }

    }

    public int verificarAutoNuevo(Auto auto) {
        if (auto.getPlacas().size() >= 1) {
            return costoPlaca.getPLACAS_AUTO_USADO();
        } else {

            return costoPlaca.getPLACAS_AUTO_NUEVO();
        }
    }
}
