package org.itson.concesionaria.dao;

import java.awt.HeadlessException;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.entitys.Vehiculo;
import org.itson.concesionaria.interfaces.IAutos;
import org.itson.concesionaria.utilities.eManager;
import org.itson.concesionaria.utilities.estadosPlaca;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.tipoVehiculo;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class AutosDAO implements IAutos {

    PlacasDAO placasDAO = new PlacasDAO();
    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();
    eManager em = new eManager();
    TramitesDAO tramiteDAO = new TramitesDAO();
    PagosDAO pagosDAO = new PagosDAO();

    @Override
    public Auto registrarAuto(Persona persona, Auto auto, String codigoPlacas, Tramite tramite, int costo) {
        try {
            em.getEntityManager().getTransaction().begin();

            Placas placa = placasDAO.registroPlacas(codigoPlacas, estadosPlaca.ACTIVA, tramite, costo, persona, auto);
            auto.setTramite(tramite);
            em.getEntityManager().persist(auto);
            
            em.getEntityManager().getTransaction().commit();
            tramiteDAO.finalizarTramite(estadosTramite.Finalizado, new GregorianCalendar(), costo, tramite);

            pagosDAO.registrarPagoPlacas(placa, tipoDePago.Pago_Placas, tramite);
            
            JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente su automovil y sus placas.");
            return auto;

        } catch (HeadlessException e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }

    }

}
