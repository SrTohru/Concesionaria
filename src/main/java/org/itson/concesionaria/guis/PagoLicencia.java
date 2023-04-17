/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import org.itson.concesionaria.dao.LicenciasDAO;
import org.itson.concesionaria.dao.TramitesDAO;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.discapacidadPersona;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.mensajesDeSistema;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

/**
 *
 * @author usuario
 */
public class PagoLicencia extends javax.swing.JFrame {

    LicenciasDAO licenciasDAO = new LicenciasDAO();
    TramitesDAO tramiteDAO = new TramitesDAO();
    Tramite tramite = new Tramite();
    Persona persona = new Persona();
    Calendar fecha = new GregorianCalendar();
    discapacidadPersona discapacidad;
    verificacionesDeSistema verificacionSistema = new verificacionesDeSistema();
    mensajesDeSistema mds = new mensajesDeSistema();
    int costo;

    public PagoLicencia(Persona persona, Tramite tramite, int costo, Calendar vigencia, discapacidadPersona discapacidad) {
        initComponents();
        this.tramite = tramite;
        this.persona = persona;
        this.fecha = vigencia;
        this.costo = costo;
        this.discapacidad = discapacidad;
        lblRFC.setText(persona.getRfc());
        lblCosto.setText("" + costo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInfoRFC = new javax.swing.JLabel();
        btnPagar = new javax.swing.JToggleButton();
        btnCancelarTramite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCobro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfoRFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInfoRFC.setText("RFC");
        getContentPane().add(lblInfoRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 30, -1));

        btnPagar.setBackground(new java.awt.Color(0, 204, 0));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, -1));

        btnCancelarTramite.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarTramite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarTramite.setText("Cancelar tramite");
        btnCancelarTramite.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTramiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 130, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Costo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 37, -1));

        lblCosto.setText("Null data");
        getContentPane().add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        lblRFC.setText("Null data");
        getContentPane().add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        lblCobro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCobro.setForeground(new java.awt.Color(255, 255, 255));
        lblCobro.setText("Pago Licencia");
        jPanel1.add(lblCobro);
        lblCobro.setBounds(20, 20, 180, 32);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 60, 179, 10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 380, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (mds.preguntaConfirmar()) {
            JOptionPane.showMessageDialog(null, "Confirmada");
            licenciasDAO.registrarLicencia(persona, fecha, discapacidad, costo, tramite);

            Calendar fechaRealizacion = new GregorianCalendar();

            tramiteDAO.finalizarTramite(estadosTramite.Finalizado, fechaRealizacion, costo, tramite);
            dispose();
          
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       if(tramite.getEstadoTramite() != estadosTramite.Finalizado){
           tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
       }
    }//GEN-LAST:event_formWindowClosed

    private void btnCancelarTramiteActionPerformed(java.awt.event.ActionEvent evt) {
        if (mds.preguntaCancelarTramite()) {
            tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
            dispose();
        }
    }

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {
        if (mds.preguntaCancelarTramite()) {
            tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
            dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarTramite;
    private javax.swing.JToggleButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCobro;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblInfoRFC;
    private javax.swing.JLabel lblRFC;
    // End of variables declaration//GEN-END:variables
}
