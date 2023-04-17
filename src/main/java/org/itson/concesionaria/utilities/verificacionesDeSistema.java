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
import static org.itson.concesionaria.utilities.tipoBusqueda.BUSQUEDA_POR_APELLIDO_MATERNO;
import static org.itson.concesionaria.utilities.tipoBusqueda.BUSQUEDA_POR_APELLIDO_PATERNO;
import static org.itson.concesionaria.utilities.tipoBusqueda.BUSQUEDA_POR_NOMBRE;
import static org.itson.concesionaria.utilities.tipoBusqueda.BUSQUEDA_POR_RFC;

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

    public void desactivarOtrasPlacas(Auto auto) {
        List<Placas> placasAnteriores = auto.getPlacas();
        for (Placas placaAnterior : placasAnteriores) {
            placaAnterior.setEstadosPlaca(estadosPlaca.DESACTIVA);
            em.getEntityManager().merge(placaAnterior);
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

    public List<Persona> consultarPersonasMedianteInformacion(String valorBusqueda, tipoBusqueda tipoBusqueda) {
        try {
            String jpql = "SELECT p FROM Persona p WHERE ";

            switch (tipoBusqueda) {
                case BUSQUEDA_POR_NOMBRE:
                    jpql += "p.nombres LIKE :valorBusqueda";
                    break;
                case BUSQUEDA_POR_APELLIDO_PATERNO:
                    jpql += "p.apellidoPaterno LIKE :valorBusqueda OR p.apellidoPaterno IS NULL";
                    break;
                case BUSQUEDA_POR_APELLIDO_MATERNO:
                    jpql += "p.apellidoMaterno LIKE :valorBusqueda OR p.apellidoMaterno IS NULL";
                    break;
                case BUSQUEDA_POR_RFC:
                    jpql += "p.rfc LIKE :valorBusqueda OR p.rfc IS NULL";
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de búsqueda no válido");
            }

            TypedQuery<Persona> consulta = em.getEntityManager().createQuery(jpql, Persona.class);
            consulta.setParameter("valorBusqueda", "%" + valorBusqueda + "%");
            for (int i = 0; i < consulta.getResultList().size(); i++) {
                System.out.println("test");
                System.out.println(consulta.getResultList().get(i));
            }
            return consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

 public Persona obtenerPersonaPorRFC(String rfc) {
    try {
        String jpql = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
        TypedQuery<Persona> consulta = em.getEntityManager().createQuery(jpql, Persona.class);
        consulta.setParameter("rfc", rfc);
        Persona persona = consulta.getSingleResult();
        return persona;
    } catch (NoResultException ex) {
        // Si no se encuentra una persona con el RFC especificado, se devuelve null
        return null;
    }
}


// public List<Persona> consultarPersonasMedianteInformacion(String nombres, String apellidoPaterno, String apellidoMaterno, String rfc) {
//        try {
//            String jpql = "SELECT p FROM Persona p WHERE p.nombres LIKE :nombres AND (p.apellidoPaterno LIKE :apellidoPaterno OR p.apellidoPaterno IS NULL) AND (p.apellidoMaterno LIKE :apellidoMaterno OR p.apellidoMaterno IS NULL)"
//                    + "AND (p.rfc LIKE :rfc OR p.rfc IS NULL)";
//            TypedQuery<Persona> consulta = em.getEntityManager().createQuery(jpql, Persona.class);
//            consulta.setParameter("nombres", "%" + nombres + "%");
//            consulta.setParameter("apellidoPaterno", "%" + apellidoPaterno + "%");
//            consulta.setParameter("apellidoMaterno", "%" + apellidoMaterno + "%");
//            consulta.setParameter("rfc", rfc);
//            for (int i = 0; i <  consulta.getResultList().size(); i++) {
//                System.out.println("test");
//                System.out.println( consulta.getResultList().get(i));
//            }
//            return consulta.getResultList();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            em.getEntityManager().getTransaction().rollback();
//            return null;
//        }
//
//    }
    public int verificarAutoNuevo(Auto auto) {
        if (auto.getPlacas().size() >= 1) {
            return costoPlaca.getPLACAS_AUTO_USADO();
        } else {

            return costoPlaca.getPLACAS_AUTO_NUEVO();
        }
    }
}
