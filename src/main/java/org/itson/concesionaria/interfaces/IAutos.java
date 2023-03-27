package org.itson.concesionaria.interfaces;


import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Placas;


public interface IAutos {
    
    Auto insertarAuto(Auto auto, Licencia licencia, Placas placas);
}
