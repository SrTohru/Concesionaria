/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.dao.AutosDAO;
import org.itson.concesionaria.dao.LicenciasDAO;
import org.itson.concesionaria.dao.PlacasDAO;
import org.itson.concesionaria.dao.TramitesDAO;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.discapacidadPersona;
import org.itson.concesionaria.utilities.estadosPlaca;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.mensajesDeSistema;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

/**
 *
 * @author naely
 */
public class PagoPlaca extends javax.swing.JFrame {

    private LicenciasDAO licenciasDAO = new LicenciasDAO();

    AutosDAO autoDAO = new AutosDAO();
    PlacasDAO placasDAO = new PlacasDAO();
    TramitesDAO tramiteDAO = new TramitesDAO();
    Tramite tramite = new Tramite();
    Persona persona = new Persona();
    verificacionesDeSistema verificacionSistema = new verificacionesDeSistema();
    mensajesDeSistema mds = new mensajesDeSistema();
    int costo;
    String codigoPlacas;
    Auto auto;
    boolean actualizacionPlacas;

    public PagoPlaca(Tramite tramite, Auto auto, Persona persona, int costo, String codigoPlacas, boolean actualizacionPlacas) {
        initComponents();
        this.actualizacionPlacas = actualizacionPlacas;
         JOptionPane.showMessageDialog(null, actualizacionPlacas);
        this.auto = auto;
        this.tramite = tramite;
        this.persona = persona;
        this.costo = costo;
        this.codigoPlacas = codigoPlacas;

        lblRFCInfo.setText(persona.getRfc());
        lblCostoInfo.setText("" + costo);
        lblCostoInfo1.setText(codigoPlacas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCostoInfo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRFCInfo = new javax.swing.JLabel();
        lblCostoInfo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Solicitud de Placas");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 40, 230, 32);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagar.setBackground(new java.awt.Color(51, 204, 0));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 220, 90, -1));
        getContentPane().add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 96, 37, -1));
        getContentPane().add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 114, 37, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pago Placas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 40, 230, 32);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 436, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Placas:");

        lblCostoInfo1.setText("Null data");

        jLabel2.setText("RFC:");

        jLabel3.setText("Costo:");

        lblRFCInfo.setText("Null data");

        lblCostoInfo.setText("Null data");

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar tramite");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblRFCInfo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCostoInfo1)
                            .addComponent(lblCostoInfo))))
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblRFCInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblCostoInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblCostoInfo1))
                .addGap(34, 34, 34)
                .addComponent(btnCancelar)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (mds.preguntaConfirmar()) {
            JOptionPane.showMessageDialog(null, actualizacionPlacas);
            if (actualizacionPlacas == true) {
               
                placasDAO.actualizarPlacas(codigoPlacas, estadosPlaca.ACTIVA, tramite, costo, persona, auto);
                Calendar fechaRealizacion = new GregorianCalendar();

                tramiteDAO.finalizarTramite(estadosTramite.Finalizado, fechaRealizacion, costo, tramite);
                
                JOptionPane.showMessageDialog(null, "Se ha realizado el pago correctamente :)");
                
                dispose();
            } else {
                autoDAO.registrarAuto(persona, auto, codigoPlacas, tramite, costo);

                Calendar fechaRealizacion = new GregorianCalendar();

                tramiteDAO.finalizarTramite(estadosTramite.Finalizado, fechaRealizacion, costo, tramite);
                
                JOptionPane.showMessageDialog(null, "Se ha realizado el pago correctamente :)");
                
                dispose();
            }

        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (mds.preguntaCancelarTramite()) {
            tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (tramite.getEstadoTramite() != estadosTramite.Finalizado) {
            tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
        }
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblCostoInfo;
    private javax.swing.JLabel lblCostoInfo1;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblRFCInfo;
    // End of variables declaration//GEN-END:variables
}
