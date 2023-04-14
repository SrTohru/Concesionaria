/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.List;
import javax.swing.JOptionPane;
import org.itson.concesionaria.dao.LicenciasDAO;
import org.itson.concesionaria.dao.TramitesDAO;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.registroMasivoPersonas;

public class PantallaPrincipal extends javax.swing.JFrame {

    LicenciasDAO tramiteDAO = new LicenciasDAO();
    
    //Declaracion de variables
    public PantallaPrincipal() {
        initComponents();
    }

    public void preguntaCerrar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea cerrar el programa?", "Cerrar programa", JOptionPane.YES_NO_OPTION);
        if (respuestaCliente == 0) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSolicitarLicencia1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarCarro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSolicitarLicencia = new javax.swing.JButton();
        btnSolicitarPlacas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JToggleButton();
        btnGenerarPersonas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnVerHistoria = new javax.swing.JToggleButton();
        btnConsultarPersona = new javax.swing.JButton();
        lblConsultarPersona = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        btnSolicitarLicencia1.setText("Solicitar ");
        btnSolicitarLicencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarLicencia1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        jLabel1.setText("Bienvenido a Concesionaria");

        jLabel2.setText("Registro de carro");

        btnRegistrarCarro.setText("Registrar");
        btnRegistrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCarroActionPerformed(evt);
            }
        });

        jLabel3.setText("Solicitar Licencia");

        btnSolicitarLicencia.setText("Solicitar ");
        btnSolicitarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarLicenciaActionPerformed(evt);
            }
        });

        btnSolicitarPlacas.setText("Solicitar");
        btnSolicitarPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPlacasActionPerformed(evt);
            }
        });

        jLabel4.setText("Solicitar Placas");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGenerarPersonas.setText("Generar Personas");
        btnGenerarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPersonasActionPerformed(evt);
            }
        });

        jLabel5.setText("Revisar Historial");

        btnVerHistoria.setText("Revisar");

        btnConsultarPersona.setText("Solicitar ");
        btnConsultarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPersonaActionPerformed(evt);
            }
        });

        lblConsultarPersona.setText("Consultar persona");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSolicitarLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConsultarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerarPersonas)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSolicitarPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVerHistoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblConsultarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitarLicencia)
                    .addComponent(btnConsultarPersona)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarCarro)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnSolicitarPlacas)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnVerHistoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGenerarPersonas))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarLicenciaActionPerformed
        RegistroLicencia registroLicencia = new RegistroLicencia();

        registroLicencia.setVisible(true);
    }//GEN-LAST:event_btnSolicitarLicenciaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        preguntaCerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPersonasActionPerformed
        JOptionPane.showMessageDialog(null, "Este proceso puede tardar un poco, sea paciente.", "ADVERTENCIA!", JOptionPane.INFORMATION_MESSAGE);

        registroMasivoPersonas rM = new registroMasivoPersonas();

        rM.registroMasivoPersonas();
    }//GEN-LAST:event_btnGenerarPersonasActionPerformed

    private void btnRegistrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCarroActionPerformed
      RegistroAutomovil registroAuto = new RegistroAutomovil();
      registroAuto.setVisible(true);
    }//GEN-LAST:event_btnRegistrarCarroActionPerformed

    private void btnSolicitarPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarPlacasActionPerformed

    private void btnSolicitarLicencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarLicencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarLicencia1ActionPerformed

    private void btnConsultarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPersonaActionPerformed
      new ConsultaPersona().setVisible(true);
    }//GEN-LAST:event_btnConsultarPersonaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new ConsultaPersona().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarPersona;
    private javax.swing.JButton btnGenerarPersonas;
    private javax.swing.JButton btnRegistrarCarro;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JButton btnSolicitarLicencia;
    private javax.swing.JButton btnSolicitarLicencia1;
    private javax.swing.JButton btnSolicitarPlacas;
    private javax.swing.JToggleButton btnVerHistoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConsultarPersona;
    // End of variables declaration//GEN-END:variables
}
