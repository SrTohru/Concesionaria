package org.itson.concesionaria.interfaces;

import java.util.Calendar;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;

public interface ILicencias {
      Licencia registrarLicencia(Persona persona, Calendar fechaVencimiento, double costo);  
}
