package org.itson.concesionaria.utilities;

import java.util.GregorianCalendar;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.entityManager;

public class registroMasivoPersonas {

    entityManager eM = new entityManager();

//                 EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("org.itson_Concesionaria_jar_1.0PU");
//        EntityManager entityManager = managerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        
//        
//            entityManager.getTransaction().commit();
    public void registroMasivoPersonas() {
       
        try {
            eM.getEntityManager().getTransaction().begin();

            // Insertar las 20 personas
            for (int i = 1; i <= 20; i++) {
                Persona persona = new Persona();
                persona.setNombres("Nombre" + i);
                persona.setApellidoPaterno("ApellidoPaterno" + i);
                persona.setApellidoMaterno("ApellidoMaterno" + i);
                persona.setTelefono("555-555-555" + i);
                persona.setRfc("RFC" + i);

                // Convertir la fecha de nacimiento de String a Date
                
                persona.setFechaNacimiento(new GregorianCalendar(2003 + i, 01,01 + i));

                eM.getEntityManager().persist(persona);
            }

            eM.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            eM.getEntityManager().close();
            eM.getManagerFactory().close();
        }
    }

}
