
package org.itson.concesionaria.interfaces;

import java.util.Calendar;
import org.itson.concesionaria.entitys.Persona;

public interface IPersona {
    
    
    public Persona registrarPersona(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroTelefono, String rfc, Calendar fechaNacimiento);
}
