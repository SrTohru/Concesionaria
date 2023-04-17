/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import javax.swing.JOptionPane;
import org.itson.concesionaria.dao.AutosDAO;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.entitys.Vehiculo;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class RegistroPlaca extends javax.swing.JFrame {

    verificacionesDeSistema verificacionesSitema = new verificacionesDeSistema();
    AutosDAO autoDAO = new AutosDAO();
    Persona persona = new Persona();
    Tramite tramite = new Tramite();
    Auto auto = new Auto();
    String codigoPlacas = verificacionesSitema.generarPlacas();
    boolean actualizacionPlacas;

    public RegistroPlaca(Auto auto, Persona persona, Tramite tramite, boolean actualizacionPlacas) {
        initComponents();
        this.actualizacionPlacas = actualizacionPlacas;
        lblInfoRFC.setText(persona.getRfc());
        lblInfoPlacas.setText(codigoPlacas);
        this.tramite = tramite;
        this.auto = auto;
        this.persona = persona;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblRFC = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        lblInfoRFC = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPlacas = new javax.swing.JLabel();
        lblInfoPlacas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 16, -1, -1));

        lblRFC.setText("RFC: ");
        getContentPane().add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(102, 204, 0));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton1.setText("Solicitar");
        jToggleButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 100, -1));

        lblInfoRFC.setText("null data");
        getContentPane().add(lblInfoRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Generar otras placas");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, -1));

        lblPlacas.setText("Placas:");
        getContentPane().add(lblPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lblInfoPlacas.setText("null data");
        getContentPane().add(lblInfoPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solicitud de Placas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 230, 32);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(30, 70, 250, 10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 420, 90));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 70, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        JOptionPane.showMessageDialog(null, actualizacionPlacas);
        if (actualizacionPlacas == true) {
            new PagoPlaca(tramite, auto, persona, verificacionesSitema.verificarAutoNuevo(auto), codigoPlacas, actualizacionPlacas).setVisible(true);
            dispose();
        } else {
            new PagoPlaca(tramite, auto, persona, verificacionesSitema.verificarAutoNuevo(auto), codigoPlacas, actualizacionPlacas).setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        codigoPlacas = verificacionesSitema.generarPlacas();
        lblInfoPlacas.setText(codigoPlacas);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblInfoPlacas;
    private javax.swing.JLabel lblInfoRFC;
    private javax.swing.JLabel lblPlacas;
    private javax.swing.JLabel lblRFC;
    // End of variables declaration//GEN-END:variables
}
