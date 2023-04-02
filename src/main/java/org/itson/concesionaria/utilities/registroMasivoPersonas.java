package org.itson.concesionaria.utilities;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Persona;

public class registroMasivoPersonas {

    entityManager eM = new entityManager();

    private static final List<String> nombres = Arrays.asList(
            "Juan", "María", "Pedro", "Ana", "Luis", "Carmen", "Jorge", "Lorena", "Miguel", "Sofía",
            "Pablo", "Claudia", "Fernando", "Isabel", "Mario", "Lucía", "Ricardo", "Laura", "Diego", "Carla"
    );

    private static final List<String> apellidosPaternos = Arrays.asList(
            "González", "Pérez", "Rodríguez", "Hernández", "López", "Martínez", "García", "Sánchez", "Romero", "Fernández",
            "Vázquez", "Torres", "Jiménez", "Díaz", "Álvarez", "Mendoza", "Ramírez", "Castro", "Ruiz", "Gómez"
    );

    private static final List<String> apellidosMaternos = Arrays.asList(
            "García", "Hernández", "Martínez", "Sánchez", "Ramírez", "Pérez", "Flores", "González", "Jiménez", "Rojas",
            "López", "Chávez", "Núñez", "Herrera", "Silva", "Morales", "Ortiz", "Gómez", "Vargas", "Medina"
    );

    public void registroMasivoPersonas() {

        try {
            eM.getEntityManager().getTransaction().begin();

            for (int i = 1; i <= 20; i++) {
                Persona persona = new Persona();
                Random rand = new Random();
                String nombre = nombres.get(rand.nextInt(nombres.size()));
                String apellidoPaterno = apellidosPaternos.get(rand.nextInt(apellidosPaternos.size()));
                String apellidoMaterno = apellidosMaternos.get(rand.nextInt(apellidosMaternos.size()));

                persona.setNombres(nombre);
                persona.setApellidoPaterno(apellidoPaterno);
                persona.setApellidoMaterno(apellidoMaterno);
                
                int num1 = rand.nextInt(9);
                int num2 = rand.nextInt(9);
                int num3 = rand.nextInt(9);
                int num4 = rand.nextInt(9);
                String telefono = "644230" + num1 + num2 + num3 + num4;
                persona.setTelefono(telefono);
                persona.setRfc("ITSONRFC" + i);

                persona.setFechaNacimiento(new GregorianCalendar(2003, 01, 01));

                eM.getEntityManager().persist(persona);
            }

            eM.getEntityManager().getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se han registrado a 20 personas aleatoreas exitosamente.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Debugg: Ocurrió un error al intentar insertar los datos:", "Quitar este mensaje al finalizar desarrollo", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage());
            eM.getEntityManager().getTransaction().rollback();
        } finally {
            eM.getEntityManager().close();
            eM.getManagerFactory().close();
        }
    }

}
