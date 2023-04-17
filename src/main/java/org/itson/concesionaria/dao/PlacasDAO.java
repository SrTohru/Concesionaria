package org.itson.concesionaria.dao;

import java.awt.HeadlessException;
import java.util.List;
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
            JOptionPane.showMessageDialog(null, "Registo de placas");
            em.getEntityManager().getTransaction().begin();

            Placas placa = new Placas(estadoPlaca, codigoPlacas, tramite, persona, auto);

            em.getEntityManager().persist(placa);
            auto.setIdPlacas(placa);
            auto.addPlacas(placa);
            auto.setTramite(tramite);

            verificacionSistema.desactivarOtrasPlacas(auto);
            pagosDAO.registrarPagoPlacas(placa, tipoDePago.Pago_Placas, tramite);
            return placa;
        } catch (HeadlessException e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

    @Override
    public Placas actualizarPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto) {
        try {
            em.getEntityManager().getTransaction().begin();

            // Obtener todas las placas anteriores del auto y establecer su estado como "expirado"
            verificacionSistema.desactivarOtrasPlacas(auto);

            // Crear la nueva placa y guardarla en la base de datos
            Placas nuevaPlaca = new Placas(estadoPlaca, codigoPlacas, tramite, persona, auto);
            em.getEntityManager().persist(nuevaPlaca);

            // Actualizar el auto con la nueva placa y guardar los cambios en la base de datos
            auto.setIdPlacas(nuevaPlaca);
            auto.addPlacas(nuevaPlaca);
            auto.setTramite(tramite);
            em.getEntityManager().merge(auto);
            em.getEntityManager().getTransaction().commit();
            pagosDAO.registrarPagoPlacas(nuevaPlaca, tipoDePago.Pago_Placas, tramite);

            return nuevaPlaca;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

}
