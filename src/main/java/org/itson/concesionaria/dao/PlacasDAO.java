package org.itson.concesionaria.dao;

import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.IPlacas;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosPlaca;
import org.itson.concesionaria.utilities.tipoDePago;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class PlacasDAO implements IPlacas {

    entityManager em = new entityManager();
    verificacionesDeSistema verificacionSistema = new verificacionesDeSistema();
    PagosDAO pagosDAO = new PagosDAO();
    @Override
    public Placas registroPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto) {

        em.getEntityManager().getTransaction().begin();
        
        Placas placa = new Placas(estadoPlaca, codigoPlacas, tramite, persona, auto);
              
        em.getEntityManager().persist(placa);
        auto.setIdPlacas(placa);
        auto.addPlacas(placa);
        auto.setTramite(tramite);
        em.getEntityManager().merge(auto);
        
        
       // pagosDAO.registrarPagoPlacas(placa, tipoDePago.Pago_Placas, tramite);
        verificacionSistema.desactivarOtrasPlacas(auto, placa);

        
        return placa;
    }

    @Override
    public Placas actualizarPlacas(estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona personja, Auto auto, Placas placas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
