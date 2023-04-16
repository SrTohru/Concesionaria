package org.itson.concesionaria.dao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Licencia;

import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.ILicencias;
import org.itson.concesionaria.utilities.discapacidadPersona;
import org.itson.concesionaria.utilities.eManager;
import org.itson.concesionaria.utilities.estadosLicencia;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class LicenciasDAO implements ILicencias {

    eManager eM = new eManager();
    TramitesDAO tramitesDAO = new TramitesDAO();
    PagosDAO pagoDAO = new PagosDAO();
    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();

    @Override
    public Licencia registrarLicencia(Persona persona, Calendar fechaVencimiento, discapacidadPersona discapacidad, int costo, Tramite tramite) {

        try {
            verificacionesSistema.desactivarOtrasLicencias(persona);
            
            eM.getEntityManager().getTransaction().begin();

            
            
            Licencia licencia = new Licencia(fechaVencimiento, persona, discapacidad, estadosLicencia.ACTIVA, tramite);

            eM.getEntityManager().persist(licencia);

            tramitesDAO.finalizarTramite(estadosTramite.Finalizado, fechaVencimiento, costo, tramite);
            licencia.setPersona(persona);
            eM.getEntityManager().find(Persona.class, persona.getId()).setLicencia(licencia);
            persona.addLicencias(licencia);
            eM.getEntityManager().getTransaction().commit();

            pagoDAO.registrarPagoLicencia(licencia, tramite, tipoDePago.Pago_Licencia);
            
            JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente su licencia.");

            return licencia;
        } catch (Exception e) {
            eM.getEntityManager().getTransaction().rollback();
            return null;
        }

    }

    public List<Licencia> test2() {
        Persona personas = eM.getEntityManager().find(Persona.class, 18L);

        List<Licencia> Persona = eM.getEntityManager().createQuery(
                "SELECT t FROM Licencia t Where t.idPersona = :id",
                Licencia.class
        ).setParameter("id", personas).getResultList();
        return Persona;
    }

    public List<Tramite> test() {
        Persona persona = eM.getEntityManager().find(Persona.class, 18L);

        List<Tramite> tramites = eM.getEntityManager().createQuery(
                "SELECT t FROM Tramite t WHERE t.idPersona = :idPersona",
                Tramite.class
        ).setParameter("idPersona", persona).getResultList();
        return tramites;
    }

}
