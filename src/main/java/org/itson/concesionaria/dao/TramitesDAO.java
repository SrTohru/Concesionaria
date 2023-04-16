package org.itson.concesionaria.dao;

import java.util.Calendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.ITramites;
import org.itson.concesionaria.utilities.eManager;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.tiposTramite;

public class TramitesDAO implements ITramites {

    private eManager em = new eManager();

    @Override
    public Tramite crearTramite(Persona persona, estadosTramite estadoTramite, tiposTramite tipoTramite, Calendar fechaTramite) {

        try {
            Tramite tramite = new Tramite(persona, estadoTramite, tipoTramite, fechaTramite);

            em.getEntityManager().getTransaction().begin();
            em.getEntityManager().persist(tramite);
            em.getEntityManager().find(Persona.class, persona.getId()).addTramite(tramite);
            em.getEntityManager().getTransaction().commit();

            return tramite;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

    @Override
    public Tramite cancelarTramite(Tramite tramite, estadosTramite estadoTramite) {

        try {
            tramite.setEstadoTramite(estadoTramite);
            em.getEntityManager().getTransaction().begin();
            em.getEntityManager().merge(tramite);
            em.getEntityManager().getTransaction().commit();
            return tramite;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

    @Override
    public void finalizarTramite(estadosTramite estadoTramite, Calendar fechaRealizacionTramite, int costo, Tramite tramite) {
        try {
            tramite.setEstadoTramite(estadoTramite);
            tramite.setCosto(costo);

            em.getEntityManager().getTransaction().begin();
            em.getEntityManager().merge(tramite);
            em.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
        }

    }

}
