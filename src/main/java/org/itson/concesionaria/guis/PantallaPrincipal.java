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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JToggleButton();
        btnGenerarPersonas = new javax.swing.JButton();
        btnSolicitarLicencia = new javax.swing.JButton();
        btnRegistrarCarro = new javax.swing.JButton();
        btnVerHistoria = new javax.swing.JToggleButton();
        lblRevisarHistorial = new javax.swing.JLabel();
        lblRegistroCarro = new javax.swing.JLabel();
        lblSolicitarLicencia = new javax.swing.JLabel();
        btnConsultarPersona = new javax.swing.JButton();
        btnSolicitarPlacas = new javax.swing.JButton();
        lblSolicitarPlacas = new javax.swing.JLabel();
        lblConsultarPersona = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(470, 280, 65, 22);

        btnGenerarPersonas.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerarPersonas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerarPersonas.setText("Generar Personas");
        btnGenerarPersonas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarPersonas);
        btnGenerarPersonas.setBounds(10, 280, 130, 20);

        btnSolicitarLicencia.setBackground(new java.awt.Color(153, 204, 255));
        btnSolicitarLicencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSolicitarLicencia.setText("Solicitar ");
        btnSolicitarLicencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSolicitarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarLicenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarLicencia);
        btnSolicitarLicencia.setBounds(40, 60, 220, 18);

        btnRegistrarCarro.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarCarro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarCarro.setText("Registrar");
        btnRegistrarCarro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCarroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCarro);
        btnRegistrarCarro.setBounds(40, 130, 220, 18);

        btnVerHistoria.setBackground(new java.awt.Color(153, 204, 255));
        btnVerHistoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerHistoria.setText("Revisar");
        btnVerHistoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVerHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerHistoria);
        btnVerHistoria.setBounds(40, 210, 220, 18);

        lblRevisarHistorial.setText("Revisar Historial");
        jPanel1.add(lblRevisarHistorial);
        lblRevisarHistorial.setBounds(40, 180, 105, 16);

        lblRegistroCarro.setText("Registro de carro");
        jPanel1.add(lblRegistroCarro);
        lblRegistroCarro.setBounds(40, 100, 106, 16);

        lblSolicitarLicencia.setText("Solicitar Licencia");
        jPanel1.add(lblSolicitarLicencia);
        lblSolicitarLicencia.setBounds(40, 30, 118, 16);

        btnConsultarPersona.setBackground(new java.awt.Color(153, 204, 255));
        btnConsultarPersona.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarPersona.setText("Solicitar ");
        btnConsultarPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarPersona);
        btnConsultarPersona.setBounds(290, 60, 220, 18);

        btnSolicitarPlacas.setBackground(new java.awt.Color(153, 204, 255));
        btnSolicitarPlacas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSolicitarPlacas.setText("Solicitar");
        btnSolicitarPlacas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSolicitarPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPlacasActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarPlacas);
        btnSolicitarPlacas.setBounds(290, 130, 220, 18);

        lblSolicitarPlacas.setText("Solicitar Placas");
        jPanel1.add(lblSolicitarPlacas);
        lblSolicitarPlacas.setBounds(290, 100, 110, 16);

        lblConsultarPersona.setText("Consultar persona");
        jPanel1.add(lblConsultarPersona);
        lblConsultarPersona.setBounds(290, 30, 118, 16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 540, 320));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("Bienvenido a Concesionaria");

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\naely\\Downloads\\Itson\\6to Semestre\\BDAvanzadas\\UC2\\Proyecto Unidad 2\\p2 Licencias\\Concesionaria\\src\\main\\java\\org\\itson\\concesionaria\\multimedia\\SERVICIOS .png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(41, 41, 41)
                .addComponent(lblImagen)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBienvenida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 80));

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

    private void btnConsultarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPersonaActionPerformed
      new ConsultaPersona().setVisible(true);
    }//GEN-LAST:event_btnConsultarPersonaActionPerformed

    private void btnVerHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerHistoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarPersona;
    private javax.swing.JButton btnGenerarPersonas;
    private javax.swing.JButton btnRegistrarCarro;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JButton btnSolicitarLicencia;
    private javax.swing.JButton btnSolicitarPlacas;
    private javax.swing.JToggleButton btnVerHistoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblConsultarPersona;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblRegistroCarro;
    private javax.swing.JLabel lblRevisarHistorial;
    private javax.swing.JLabel lblSolicitarLicencia;
    private javax.swing.JLabel lblSolicitarPlacas;
    // End of variables declaration//GEN-END:variables
}
