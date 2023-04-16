package org.itson.concesionaria.dao;

import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Pago;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.IPagos;
import org.itson.concesionaria.utilities.eManager;
import org.itson.concesionaria.utilities.tipoDePago;

public class PagosDAO implements IPagos {

    eManager em = new eManager();
    
    @Override
    public Pago registrarPagoLicencia(Licencia licencia, Tramite tramite, tipoDePago tipoPago) {
        try {
            Pago pago = new Pago(tramite, tipoPago, licencia);

            em.getEntityManager().getTransaction().begin();

            em.getEntityManager().persist(pago);
            tramite.setIdPago(pago);
            em.getEntityManager().merge(tramite);
            em.getEntityManager().getTransaction().commit();
            
            
            return pago;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

    @Override
    public Pago registrarPagoPlacas(Placas Placas, tipoDePago tipoPago, Tramite tramite) {

        try {
            Pago pago = new Pago(tramite, tipoPago, Placas);

            em.getEntityManager().getTransaction().begin();

            tramite.setIdPago(pago);

            em.getEntityManager().merge(tramite);

            em.getEntityManager().persist(pago);
            em.getEntityManager().getTransaction().commit();

            return pago;
        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

}
