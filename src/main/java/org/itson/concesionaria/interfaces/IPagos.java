package org.itson.concesionaria.interfaces;

import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Pago;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.tipoDePago;

public interface IPagos {
    
    Pago registrarPagoLicencia(Licencia licencia,Tramite tramite, tipoDePago tipoPago);
    Pago registrarPagoPlacas(Placas Placas, tipoDePago tipoPago);
}
