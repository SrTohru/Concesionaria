package org.itson.concesionaria.dao;

import java.util.Calendar;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.ITramites;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tiposTramite;

public class TramitesDAO implements ITramites {

    private entityManager em = new entityManager();

    @Override
    public Tramite crearTramite(Persona persona, estadosTramite estadoTramite,tiposTramite tipoTramite, Calendar fechaTramite) {
        Tramite nuevoTramite = new Tramite();
        nuevoTramite.setIdPersona(persona);
        nuevoTramite.setEstadoTramite(estadoTramite.En_Proceso);
        nuevoTramite.setFechaTramite(fechaTramite);
        nuevoTramite.setTipoTramite(tipoTramite);
        em.getEntityManager().getTransaction().begin();
        em.getEntityManager().persist(nuevoTramite);
        em.getEntityManager().getTransaction().commit();
        
        return nuevoTramite;
    }

    @Override
    public Tramite cancelarTramite(Persona persona, Calendar fechaVencimiento, Tramite tramite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tramite finalizarTramite(Persona persona, estadosTramite estadoTramite, Calendar fechaVencimiento, Calendar fechaRealizacionTramite, double costo, Tramite tramite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
