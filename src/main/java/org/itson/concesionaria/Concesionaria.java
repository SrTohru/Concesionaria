package org.itson.concesionaria;

import org.itson.concesionaria.guis.PagoLicencia;
import org.itson.concesionaria.guis.PantallaPrincipal;
import java.util.GregorianCalendar;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.entityManager;

public class Concesionaria {

    public static void main(String[] args) {   
        entityManager eManager = new entityManager();
        
        eManager.getEntityManager();
      
      
        PantallaPrincipal p = new PantallaPrincipal();
        p.setVisible(true);
}
}
