package org.itson.concesionaria.interfaces;


import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Placas;
import org.itson.concesionaria.utilities.estadosPlaca;


public interface IAutos {

    Auto registrarAuto( estadosPlaca estadoplaca, Persona persona, Placas placas);
}
