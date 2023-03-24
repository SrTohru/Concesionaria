/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.concesionaria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.itson.concesionaria.entitys.Persona;

public class Concesionaria {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("org.itson_Concesionaria_jar_1.0PU");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        entityManager.getTransaction().commit();

    }
}
