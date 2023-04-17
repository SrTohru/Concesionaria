package org.itson.concesionaria.interfaces;


import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;



public interface IAutos {
//idLicencia, idpersona, idplacas
    Auto registrarAuto(Persona persona,Auto auto,String codigoPlacas, Tramite tramite, int costo);
}
