package org.itson.concesionaria.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityManager {

    private EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("org.itson_Concesionaria_jar_1.0PU");
    
    private EntityManager entityManager = managerFactory.createEntityManager();

    public EntityManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public void setManagerFactory(EntityManagerFactory managerFactory) {
        this.managerFactory = managerFactory;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
