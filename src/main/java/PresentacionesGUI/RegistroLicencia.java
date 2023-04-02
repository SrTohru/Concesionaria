/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentacionesGUI;

import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.dao.LicenciasDAO;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.costoLicencias;
import org.itson.concesionaria.utilities.entityManager;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class RegistroLicencia extends javax.swing.JFrame {

    private LicenciasDAO licenciasDAO = new LicenciasDAO();
    private verificacionesDeSistema verificador = new verificacionesDeSistema();
    private costoLicencias costoLicencia = new costoLicencias();

    public RegistroLicencia() {
        initComponents();
    }

    public int obtenerVigencia() {
        switch (añosVigencia.getSelectedIndex()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                break;
        }
        return -1;
    }

    public int calcularCostoLicencia() {
        if (checkBoxDiscapacitado.isSelected()) {
            switch (obtenerVigencia()) {
                case 1:
                    return costoLicencia.getANO_COSTO_DISCAPACITADOS();
                case 2:
                    return costoLicencia.getDOS_ANOS_COSTO_DISCAPACITADOS();
                case 3:
                    return costoLicencia.getTRES_ANOS_COSTO_DISCAPACITADOS();
                default:
                    break;
            }
        } else {
            switch (obtenerVigencia()) {
                case 1:
                    return costoLicencia.getANO_COSTO_NORMAL();
                case 2:
                    return costoLicencia.getDOS_ANOS_COSTO_NORMAL();
                case 3:
                    return costoLicencia.getTRES_ANOS_COSTO_NORMAL();
                default:
                    break;
            }
        }
        return -1;
    }

    public boolean discapacidad() {
        return checkBoxDiscapacitado.isSelected();
    }

    public boolean allInformationRequiered() {
        if (txtRFC.getText().isEmpty()) {
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiscapacitado = new javax.swing.JLabel();
        lblVigencia = new javax.swing.JLabel();
        Solicitar = new javax.swing.JButton();
        btnSalir = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        añosVigencia = new javax.swing.JComboBox<>();
        checkBoxDiscapacitado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDiscapacitado.setText("¿Eres discapacitado?");

        lblVigencia.setText("Vigencia");

        Solicitar.setText("Solicitar");
        Solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("RFC");

        jLabel2.setText("Porfavor ingresa los datos que se te solicitan a continuación");

        lblSolicitud.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSolicitud.setText("Solicitud de Licencia");

        añosVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Año", "2 Años", "3 Años" }));
        añosVigencia.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                añosVigenciaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        checkBoxDiscapacitado.setText("Si");
        checkBoxDiscapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiscapacitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblVigencia)
                                    .addGap(18, 18, 18)
                                    .addComponent(añosVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(Solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(checkBoxDiscapacitado)))
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDiscapacitado)
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblSolicitud)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblVigencia))
                    .addComponent(añosVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDiscapacitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxDiscapacitado)
                .addGap(12, 12, 12)
                .addComponent(Solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarActionPerformed
        if (allInformationRequiered()) {
            Persona persona = verificador.verificarPersona(txtRFC.getText());
            int vigenciaAños = obtenerVigencia();
            if (persona != null) {
                GregorianCalendar fecha = new GregorianCalendar();
                fecha.add(GregorianCalendar.YEAR, vigenciaAños);
                System.out.println(YEAR);
              //  licenciasDAO.registrarLicencia(persona, fecha, calcularCostoLicencia());
            }else{
                JOptionPane.showMessageDialog(null, "Disculpe, ese 'RFC' no existe en nuestra base de datos, intentelo denuvo,", "Error al encontrar 'RFC", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SolicitarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (verificador.preguntaCerrar() == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void añosVigenciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_añosVigenciaAncestorAdded

    }//GEN-LAST:event_añosVigenciaAncestorAdded

    private void checkBoxDiscapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDiscapacitadoActionPerformed

    }//GEN-LAST:event_checkBoxDiscapacitadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Solicitar;
    private javax.swing.JComboBox<String> añosVigencia;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JCheckBox checkBoxDiscapacitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDiscapacitado;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JLabel lblVigencia;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
