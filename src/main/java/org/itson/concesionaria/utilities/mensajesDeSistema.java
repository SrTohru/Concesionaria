package org.itson.concesionaria.utilities;

import javax.swing.JOptionPane;

public class mensajesDeSistema {

    public void mensajeDeFaltaInformacion() {
        JOptionPane.showMessageDialog(null, "Ingrese toda la informacion requerida correctamente antes de realizar esta accion.", "¡ADVERTENCIA!", JOptionPane.ERROR_MESSAGE);
    }

    public void mensajeDeExistenciaDePersona() {
        JOptionPane.showMessageDialog(null, "Ese RFC ya se encuentra registrado, intente denuevo con un RFC diferente", "Error al ingresar a la persona", JOptionPane.ERROR_MESSAGE);
    }

    public boolean preguntaCerrar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea cerrar el programa?", "Cerrar programa", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }

    public boolean preguntaConfirmar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea registrar esta licencia?", "Confirmacion de pago", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }

    public boolean preguntaCancelarTramite() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea cancelar este tramite?", "Confirmacion de cancelacion", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }

    public boolean preguntarCrearNuevaLicencia() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea crear una nueva licencia teniendo una activa?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        return respuestaCliente == 0;
    }
}
