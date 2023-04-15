package org.itson.concesionaria.dao;

import java.util.Calendar;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.interfaces.IPersona;
import org.itson.concesionaria.utilities.encriptador;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.mensajesDeSistema;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class PersonasDAO implements IPersona {

    entityManager em = new entityManager();
    verificacionesDeSistema vds = new verificacionesDeSistema();
    mensajesDeSistema mds = new mensajesDeSistema();
    encriptador enc = new encriptador(); 
    @Override
    public Persona registrarPersona(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroTelefono, String rfc, Calendar fechaNacimiento) {

        try {
            em.getEntityManager().getTransaction().begin();

            if (vds.verificarPersonaPorRFC(rfc) != null) {
                mds.mensajeDeExistenciaDePersona();
                return null;
            }

            Persona persona = new Persona(enc.encriptar(nombre), enc.encriptar(apellidoPaterno), enc.encriptar(apellidoMaterno), enc.encriptar(numeroTelefono), enc.encriptar(rfc), fechaNacimiento);

            em.getEntityManager().persist(persona);

            em.getEntityManager().getTransaction().commit();
            return persona;

        } catch (Exception e) {
            em.getEntityManager().getTransaction().rollback();
            return null;
        }
    }

}
