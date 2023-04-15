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
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosLicencia;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class LicenciasDAO implements ILicencias {

    entityManager eM = new entityManager();
    TramitesDAO tramitesDAO = new TramitesDAO();
    PagosDAO pagoDAO = new PagosDAO();
    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();
    
    @Override
    public Licencia registrarLicencia(Persona persona, Calendar fechaVencimiento, discapacidadPersona discapacidad, int costo, Tramite tramite) {
        
       if(verificacionesSistema.tieneLicenciasRegistradas(persona)){
           verificacionesSistema.desactivarOtrasLicencias(persona);
       }
        
        
        eM.getEntityManager().getTransaction().begin();
       
        Licencia licencia = new Licencia(fechaVencimiento, persona, discapacidad, estadosLicencia.ACTIVA, tramite);

        eM.getEntityManager().persist(licencia);

        tramitesDAO.finalizarTramite(estadosTramite.Finalizado, fechaVencimiento, costo, tramite);
        licencia.setPersona(persona);
        eM.getEntityManager().find(Persona.class, persona.getId()).setLicencia(licencia);

        eM.getEntityManager().getTransaction().commit();
  
        pagoDAO.registrarPagoLicencia(licencia, tramite, tipoDePago.Pago_Licencia);

        return licencia;
    }

    public List<Tramite> test() {
        Persona persona = eM.getEntityManager().find(Persona.class,15L);

        List<Tramite> tramites = eM.getEntityManager().createQuery(
                "SELECT t FROM Tramite t WHERE t.idPersona = :persona",
                Tramite.class
        ).setParameter("persona", persona).getResultList();
        return tramites;
    }

}
