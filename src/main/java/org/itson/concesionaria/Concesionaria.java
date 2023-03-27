package org.itson.concesionaria;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

public class Concesionaria {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("org.itson_Concesionaria_jar_1.0PU");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        entityManager.getTransaction().commit();

    }
}
