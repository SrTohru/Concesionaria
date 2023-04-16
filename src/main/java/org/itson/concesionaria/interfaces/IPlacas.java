package org.itson.concesionaria.interfaces;

import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.estadosPlaca;

public interface IPlacas {

    Placas registroPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto);
    
    Placas actualizarPlacas(String codigoPlacas, estadosPlaca estadoPlaca, Tramite tramite, int costo, Persona persona, Auto auto);
}
