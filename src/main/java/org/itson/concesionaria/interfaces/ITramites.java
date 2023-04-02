package org.itson.concesionaria.interfaces;

import java.util.Calendar;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tiposTramite;

public interface ITramites {
    
    Tramite crearTramite(Persona persona, estadosTramite estadoTramite, tiposTramite tipoTramite, Calendar fechaTramite);

    Tramite cancelarTramite(Persona persona, Calendar fechaVencimiento, Tramite tramite);

    Tramite finalizarTramite(Persona persona, estadosTramite estadoTramite,
            Calendar fechaVencimiento, Calendar fechaRealizacionTramite, double costo, Tramite tramite);

}
