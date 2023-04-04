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
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tipoDePago;

public class LicenciasDAO implements ILicencias {

    entityManager eM = new entityManager();
    TramitesDAO tramitesDAO = new TramitesDAO();
    PagosDAO pagoDAO = new PagosDAO();
    
    //persona, fecha,discapacidad, costo, tramite
    @Override
    public Licencia registrarLicencia(Persona persona, Calendar fechaVencimiento, discapacidadPersona discapacidad, int costo, Tramite tramite) {
        eM.getEntityManager().getTransaction().begin();
        JOptionPane.showMessageDialog(null, "Persona: " + persona + " fechaVencimiento" + fechaVencimiento + " discapacidad: " + discapacidad + " costo" + costo + " trmaite" + tramite);
        Licencia licencia = new Licencia();
        licencia.setFechaVigencia(fechaVencimiento);
        licencia.setIdPersona(persona);
        licencia.setDiscapacidad(discapacidad);
        licencia.setTramite(tramite);
        eM.getEntityManager().persist(licencia);

        tramitesDAO.finalizarTramite(estadosTramite.Finalizado, fechaVencimiento, costo, tramite);
        
        Calendar fechaRealizacion = new GregorianCalendar();

        eM.getEntityManager().find(Tramite.class, tramite.getId()).setFechaRealizacion(fechaRealizacion);
        eM.getEntityManager().find(Persona.class, persona.getId()).setLicencia(licencia);
        
         pagoDAO.registrarPagoLicencia(licencia, tipoDePago.Pago_Licencia);
        
        eM.getEntityManager().getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Exitosamente");
        return licencia;
    }
    
    public List<Tramite> test(){
        Persona persona = eM.getEntityManager().find(Persona.class, 10L);
        
        List<Tramite> tramites = eM.getEntityManager().createQuery(
    "SELECT t FROM Tramite t WHERE t.idPersona = :persona",
    Tramite.class
).setParameter("persona", persona).getResultList();
    return tramites;
    }

}
