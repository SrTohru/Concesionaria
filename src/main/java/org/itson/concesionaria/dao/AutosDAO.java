package org.itson.concesionaria.dao;

import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.interfaces.IAutos;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosPlaca;

public class AutosDAO implements IAutos{
    
    //Auto auto, estadosPlaca estadoplaca, Persona persona, Placas placas
      //EstadoPlaca, codigoPlacas, fechaTramite, costo, idPersona, idAuto      
    entityManager em = new entityManager();
    
    @Override
    public Auto registrarAuto(estadosPlaca estadoPlaca, Persona persona, Placas placas) {
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
        Auto auto = new Auto();
    em.getEntityManager().getTransaction().begin();
    
    
    
    
        return null;
    
    }
    
}
