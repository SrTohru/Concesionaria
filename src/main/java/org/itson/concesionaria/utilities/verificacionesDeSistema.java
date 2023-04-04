package org.itson.concesionaria.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Persona;

public class verificacionesDeSistema {

    private final entityManager em = new entityManager();

    public boolean verificarFormatoFecha(String fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String inputText = fecha;

        try {
            Date date = dateFormat.parse(inputText);
            return true;
        } catch (ParseException e) {
            return false;
        }
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

    public Persona verificarPersonaPorRFC(String rfc) {
        try {
            String consulta = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = em.getEntityManager().createQuery(consulta, Persona.class);
            query.setParameter("rfc", rfc);
            return query.getSingleResult();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Disculpe, el 'RFC: " + rfc + "' no existe en nuestra base de datos, ingreselo nuevamente.", "Error al encontrar 'RFC'", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
