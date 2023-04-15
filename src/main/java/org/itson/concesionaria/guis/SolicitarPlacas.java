/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import org.itson.concesionaria.utilities.verificacionesDeSistema;

/**
 *
 * @author PC
 */
public class SolicitarPlacas extends javax.swing.JFrame {

    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();
    
    public SolicitarPlacas() {
        initComponents();
    }

        public boolean verificacionDeInformacion() {
        return !(txtSerieAuto.getText().isEmpty())
                || !(txtRFC.getText().isEmpty());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSerieAuto = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblSolicitud = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jButton2.setText("Salir");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel1.setText("Serie del vehiculo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, -1));

        jLabel2.setText("RFC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));
        getContentPane().add(txtSerieAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, -1));
        getContentPane().add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        lblSolicitud.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        lblSolicitud.setText("Consultar auto");
        jPanel1.add(lblSolicitud);
        lblSolicitud.setBounds(10, 20, 204, 32);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 50, 171, 3);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\naely\\Downloads\\Itson\\6to Semestre\\BDAvanzadas\\UC2\\Proyecto Unidad 2\\p2 Licencias\\Concesionaria\\src\\main\\java\\org\\itson\\concesionaria\\multimedia\\CONSULTA.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 0, 130, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(verificacionDeInformacion()){
           verificacionesSistema.consultarExistenciaVehiculoPorSerie(txtSerieAuto.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSerieAuto;
    // End of variables declaration//GEN-END:variables
}