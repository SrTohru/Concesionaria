package org.itson.concesionaria.interfaces;

import java.util.Calendar;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.tiposTramite;

public interface ITramites {
    
    Tramite crearTramite(Persona persona, estadosTramite estadoTramite, tiposTramite tipoTramite, Calendar fechaTramite);

    Tramite cancelarTramite(Tramite tramite, estadosTramite estadoTramite);

    void finalizarTramite( estadosTramite estadoTramite,Calendar fechaRealizacionTramite, int costo, Tramite tramite);

}
