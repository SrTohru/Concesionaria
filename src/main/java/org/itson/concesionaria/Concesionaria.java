package org.itson.concesionaria;

import java.util.GregorianCalendar;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import org.itson.concesionaria.entitys.Persona;

public class Concesionaria {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("org.itson_Concesionaria_jar_1.0PU");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        Persona persona = new Persona("Jose Hinojosa", "Hinojosa", "Romero", "6442304259", "ASD", new GregorianCalendar(2003, 12, 07));
        
        entityManager.persist(persona);
        entityManager.getTransaction().commit();

    }
}
