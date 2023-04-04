
package org.itson.concesionaria.dao;

import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Pago;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.interfaces.IPagos;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.tipoDePago;

public class PagosDAO implements IPagos{

    entityManager em = new entityManager();
    
    @Override
    public Pago registrarPagoLicencia(Licencia licencia, tipoDePago tipoPago) {
    em.getEntityManager().getTransaction().begin();
    
    Pago pago = new Pago();
    
    pago.setIdLicencia(licencia);
    pago.setTipoDePago(tipoPago);
    
    em.getEntityManager().persist(pago);
    em.getEntityManager().getTransaction().commit();
    
    return pago;
    }

    @Override
    public Pago registrarPagoPlacas(Placas Placas, tipoDePago tipoPago) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
