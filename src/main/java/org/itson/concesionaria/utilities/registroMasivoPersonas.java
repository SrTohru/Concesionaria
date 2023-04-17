package org.itson.concesionaria.utilities;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import org.itson.concesionaria.entitys.Persona;

public class registroMasivoPersonas {

    eManager eM = new eManager();
    boolean registroHecho = false;
    private static final List<String> nombres = Arrays.asList(
            "Jose", "Naely", "Pedro", "Ana", "Luis", "Carmen", "Jorge", "Lorena", "Miguel", "Sofía",
            "Pablo", "Claudia", "Fernando", "Isabel", "Mario", "Lucía", "Ricardo", "Laura", "Diego", "Carla"
    );

    private static final List<String> apellidosPaternos = Arrays.asList(
            "Hinojosa", "Rubio", "Rodríguez", "Hernández", "López", "Martínez", "García", "Sánchez", "Romero", "Fernández",
            "Vázquez", "Torres", "Jiménez", "Díaz", "Álvarez", "Mendoza", "Ramírez", "Castro", "Ruiz", "Gómez"
    );

    private static final List<String> apellidosMaternos = Arrays.asList(
            "Romero", "Morillon", "Martínez", "Sánchez", "Ramírez", "Pérez", "Flores", "González", "Jiménez", "Rojas",
            "López", "Chávez", "Núñez", "Herrera", "Silva", "Morales", "Ortiz", "Gómez", "Vargas", "Medina"
    );

    public void registroMasivoPersonas() {
        if (registroHecho) {
            JOptionPane.showMessageDialog(null, "No se pueden registrar dos veces a 20 personas.");
        } else {
            try {
                eM.getEntityManager().getTransaction().begin();

                for (int i = 1; i <= 20; i++) {
                    Persona persona = new Persona();

                    Random rand = new Random();
                    String nombre = nombres.get(rand.nextInt(nombres.size()));
                    String apellidoPaterno = apellidosPaternos.get(rand.nextInt(apellidosPaternos.size()));
                    String apellidoMaterno = apellidosMaternos.get(rand.nextInt(apellidosMaternos.size()));

                    persona.setNombres(encriptador.encriptar(nombre));
                    persona.setApellidoPaterno(encriptador.encriptar(apellidoPaterno));
                    persona.setApellidoMaterno(encriptador.encriptar(apellidoMaterno));

                    int num1 = rand.nextInt(9);
                    int num2 = rand.nextInt(9);
                    int num3 = rand.nextInt(9);
                    int num4 = rand.nextInt(9);
                    String telefono = "644230" + num1 + num2 + num3 + num4;
                    persona.setTelefono(telefono);
                    persona.setRfc("ITSONRFC" + i);

                    int año = rand.nextInt(41) + 1970;
                    int mes = rand.nextInt(12);
                    int dia = rand.nextInt(30);

                    persona.setFechaNacimiento(new GregorianCalendar(año, mes, dia));

                    eM.getEntityManager().persist(persona);
                }

                eM.getEntityManager().getTransaction().commit();
                
                registroHecho = true;
                
                showMessageDialog(null, "Se han registrado a 20 personas aleatoreas exitosamente.");
            } catch (Exception e) {
                showMessageDialog(null, "No se pudieron registrar a las personas, tal vez ya esten registrados.");
                eM.getEntityManager().getTransaction().rollback();
            } finally {
                eM.getEntityManager().close();
                eM.getManagerFactory().close();
            }
        }
    }

}
