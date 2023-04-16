package org.itson.concesionaria.dao;

import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.IPlacas;
import org.itson.concesionaria.utilities.eManager;
import org.itson.concesionaria.utilities.estadosPlaca;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class PlacasDAO implements IPlacas {

    eManager em = new eManager();
    verificacionesDeSistema verificacionSistema = new verificacionesDeSistema();
    PagosDAO pagosDAO = new PagosDAO();

    @Override
    public Placas registroPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto) {
        try {
            em.getEntityManager().getTransaction().begin();

            Placas placa = new Placas(estadoPlaca, codigoPlacas, tramite, persona, auto);

            em.getEntityManager().persist(placa);
            auto.setIdPlacas(placa);
            auto.addPlacas(placa);
            auto.setTramite(tramite);
            em.getEntityManager().merge(auto);
            em.getEntityManager().getTransaction().commit();
            verificacionSistema.desactivarOtrasPlacas(auto, placa);
            pagosDAO.registrarPagoPlacas(placa, tipoDePago.Pago_Placas, tramite);
            return placa;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

    @Override
    public Placas actualizarPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto) {
        try {
            em.getEntityManager().getTransaction().begin();

            Placas placa = new Placas(estadoPlaca, codigoPlacas, tramite, persona, auto);

            em.getEntityManager().persist(placa);
            auto.setIdPlacas(placa);
            auto.addPlacas(placa);
            em.getEntityManager().merge(auto);

            verificacionSistema.desactivarOtrasPlacas(auto, placa);
            pagosDAO.registrarPagoPlacas(placa, tipoDePago.Pago_Placas, tramite);
            return placa;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

}
