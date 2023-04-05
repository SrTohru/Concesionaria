package org.itson.concesionaria.dao;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.IAutos;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosPlaca;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class AutosDAO implements IAutos {

    PlacasDAO placasDAO = new PlacasDAO();
    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();
    entityManager em = new entityManager();
    TramitesDAO tramiteDAO = new TramitesDAO();

    @Override
    public Auto registrarAuto(Persona persona, String codigoPlacas, Tramite tramite, int costo) {
        /*
                eM.getEntityManager().getTransaction().begin();
        JOptionPane.showMessageDialog(null, "Persona: " + persona + " fechaVencimiento" + fechaVencimiento + " discapacidad: " + discapacidad + " costo" + costo + " trmaite" + tramite);
        Licencia licencia = new Licencia();
        licencia.setFechaVigencia(fechaVencimiento);
        licencia.setCosto(costo);
        licencia.setIdPersona(persona);
        licencia.setDiscapacidad(discapacidad);
        licencia.setTramite(tramite);
        eM.getEntityManager().persist(licencia);

        tramitesDAO.finalizarTramite(estadosTramite.Finalizado, fechaVencimiento, costo, tramite);

        Calendar fechaRealizacion = new GregorianCalendar();

        eM.getEntityManager().find(Tramite.class, tramite.getId()).setFechaRealizacion(fechaRealizacion);
        eM.getEntityManager().find(Persona.class, persona.getId()).setLicencia(licencia);

        eM.getEntityManager().getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Exitosamente");
        return licencia;
        
         */
        Auto auto = new Auto(persona.getLicencia(), persona);

        Placas placas = placasDAO.registroPlacas(codigoPlacas, estadosPlaca.ACTIVA, tramite, 999, persona, auto);
        em.getEntityManager().getTransaction().begin();

        em.getEntityManager().persist(auto);

        JOptionPane.showConfirmDialog(null, "Se registro el auto");
        em.getEntityManager().getTransaction().commit();
        tramiteDAO.finalizarTramite(estadosTramite.Finalizado, new GregorianCalendar(), costo, tramite);
        return auto;

    }

}
