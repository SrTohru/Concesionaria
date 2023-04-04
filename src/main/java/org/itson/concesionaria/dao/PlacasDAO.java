
package org.itson.concesionaria.dao;

import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.IPlacas;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.estadosPlaca;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class PlacasDAO implements IPlacas{
    
    entityManager em = new entityManager();
    verificacionesDeSistema verificacionSistema = new verificacionesDeSistema();
    @Override
    public Placas registroPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto) {
       Placas placa = new Placas(estadoPlaca, codigoPlacas, tramite, costo, persona, auto);
       
       em.getEntityManager().getTransaction().begin();
       
       em.getEntityManager().persist(placa);
       auto.addPlacas(placa);
       em.getEntityManager().getTransaction().commit();
       
       verificacionSistema.desactivarOtrasPlacas(auto, placa);
       
       return placa;
    }

    @Override
    public Placas actualizarPlacas(estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona personja, Auto auto, Placas placas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
