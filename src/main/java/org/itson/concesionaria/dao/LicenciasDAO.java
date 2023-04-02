package org.itson.concesionaria.dao;

import java.util.Calendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Licencia;

import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.interfaces.ILicencias;
import org.itson.concesionaria.utilities.entityManager;

public class LicenciasDAO implements ILicencias {

    entityManager eM = new entityManager();

    @Override
    public Licencia registrarLicencia(Persona persona, Calendar fechaVencimiento, double costo, Tramite tramite) {
        eM.getEntityManager().getTransaction().begin();

        Licencia licencia = new Licencia();
        licencia.setFechaVigencia(fechaVencimiento);
        licencia.setCosto(costo);
        licencia.setIdPersona(persona);

        eM.getEntityManager().persist(licencia);
        
        eM.getEntityManager().find(Persona.class, persona.getId()).setLicencia(licencia);

        eM.getEntityManager().getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Exitosamente");
        return licencia;
    }

}
