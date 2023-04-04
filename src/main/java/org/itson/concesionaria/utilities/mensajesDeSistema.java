package org.itson.concesionaria.utilities;

import javax.swing.JOptionPane;

public class mensajesDeSistema {

    public void mensajeDeFaltaInformacion(){
        JOptionPane.showMessageDialog(null, "Ingrese toda la informacion requerida antes de realizar esta accion.", "¡ADVERTENCIA!", JOptionPane.ERROR_MESSAGE);
    }
    
}
