package org.itson.concesionaria.interfaces;


import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.entitys.Vehiculo;
import org.itson.concesionaria.utilities.estadosPlaca;


public interface IAutos {
//idLicencia, idpersona, idplacas
    Auto registrarAuto(Persona persona,Vehiculo vehiculo, String codigoPlacas, Tramite tramite, int costo);
}
