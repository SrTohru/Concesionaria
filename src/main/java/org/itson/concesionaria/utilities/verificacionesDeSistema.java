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

    private entityManager em = new entityManager();
    
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

    public Persona verificarPersona(String rfc) {
        String consulta = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
        TypedQuery<Persona> query = em.getEntityManager().createQuery(consulta, Persona.class);
        query.setParameter("rfc", rfc);
        return query.getSingleResult();
    }
}
