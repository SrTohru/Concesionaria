package org.itson.concesionaria;

import java.util.GregorianCalendar;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;

public class Concesionaria {

    public static void main(String[] args) {
             EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("org.itson_Concesionaria_jar_1.0PU");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();

            Persona p = new Persona("6442304259", "sdasdasd", "Jose Eduardo", "Hinojosa", "Romero", null, null, new GregorianCalendar(2003, 12, 02));
            entityManager.persist(p);
            entityManager.getTransaction().commit();
    }
}
