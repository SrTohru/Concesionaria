package org.itson.concesionaria;

import java.util.GregorianCalendar;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;

public class Concesionaria {

    public static void main(String[] args) {
             EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        
        entityManager.getTransaction().commit();
    }
}
