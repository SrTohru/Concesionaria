package org.itson.concesionaria;

import PresentacionesGUI.PagoLicencia;
import PresentacionesGUI.PantallaPrincipal;
import java.util.GregorianCalendar;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import org.itson.concesionaria.entitys.Licencia;
import org.itson.concesionaria.entitys.Persona;

public class Concesionaria {

    public static void main(String[] args) {   
        PagoLicencia pP = new PagoLicencia();
        pP.setVisible(true);
        
        

    }
}
