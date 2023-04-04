package org.itson.concesionaria.dao;

import java.util.Calendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.ITramites;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.tiposTramite;

public class TramitesDAO implements ITramites {

    private entityManager em = new entityManager();

    @Override
    public Tramite crearTramite(Persona persona, estadosTramite estadoTramite, tiposTramite tipoTramite, Calendar fechaTramite) {
        Tramite tramite = new Tramite(persona, estadoTramite, tipoTramite, fechaTramite);

        em.getEntityManager().getTransaction().begin();
        em.getEntityManager().persist(tramite);
        em.getEntityManager().find(Persona.class, persona.getId()).addTramite(tramite);
        em.getEntityManager().getTransaction().commit();

        return tramite;
    }

    @Override
    public Tramite cancelarTramite(Tramite tramite, estadosTramite estadoTramite) {
        tramite.setEstadoTramite(estadoTramite);
        em.getEntityManager().getTransaction().begin();
        em.getEntityManager().merge(tramite);
        em.getEntityManager().getTransaction().commit();
        return tramite;
    }

    @Override
    public void finalizarTramite(estadosTramite estadoTramite, Calendar fechaRealizacionTramite, int costo, Tramite tramite) {

        tramite.setEstadoTramite(estadoTramite);
        tramite.setFechaRealizacion(fechaRealizacionTramite);
        tramite.setCosto(costo);
        
        em.getEntityManager().getTransaction().begin();
        em.getEntityManager().merge(tramite);
        em.getEntityManager().getTransaction().commit();

    }

}
