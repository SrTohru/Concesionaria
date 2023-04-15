/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.dao.LicenciasDAO;
import org.itson.concesionaria.dao.TramitesDAO;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.discapacidadPersona;
import org.itson.concesionaria.utilities.estadosTramite;
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
    int costo;
    discapacidadPersona discapacidad;
    verificacionesDeSistema verificacionSistema = new verificacionesDeSistema();
    
    public PagoLicencia(Persona persona,Tramite tramite, int costo, Calendar vigencia, discapacidadPersona discapacidad) {
        initComponents();
        this.tramite = tramite;
        this.persona = persona;
        this.fecha = vigencia;
        this.costo = costo;
        this.discapacidad = discapacidad;
        lblRFC.setText(persona.getRfc());
        lblCosto.setText(""+ costo);
        
        
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblInfoRFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInfoRFC.setText("RFC");
        getContentPane().add(lblInfoRFC);
        lblInfoRFC.setBounds(30, 90, 30, 16);

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar);
        btnPagar.setBounds(40, 190, 90, 23);

        btnCancelarTramite.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarTramite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarTramite.setText("Cancelar tramite");
        btnCancelarTramite.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTramiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarTramite);
        btnCancelarTramite.setBounds(227, 240, 130, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Costo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 130, 37, 16);

        lblCosto.setText("Null data");
        getContentPane().add(lblCosto);
        lblCosto.setBounds(90, 130, 48, 16);

        lblRFC.setText("Null data");
        getContentPane().add(lblRFC);
        lblRFC.setBounds(90, 90, 48, 16);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        lblCobro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCobro.setForeground(new java.awt.Color(255, 255, 255));
        lblCobro.setText("Pago Licencia");
        jPanel1.add(lblCobro);
        lblCobro.setBounds(20, 20, 180, 32);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 60, 179, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 370, 80);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if(verificacionSistema.preguntaConfirmar()){
            JOptionPane.showMessageDialog(null, "Confirmada");
            licenciasDAO.registrarLicencia(persona, fecha,discapacidad, costo, tramite);
            
            Calendar fechaRealizacion = new GregorianCalendar();
            
            tramiteDAO.finalizarTramite(estadosTramite.Finalizado, fechaRealizacion, costo, tramite);
            dispose();
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTramiteActionPerformed
        if(verificacionSistema.preguntaCancelarTramite()){
            JOptionPane.showMessageDialog(null, "Confirmada");
            tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
            dispose();
        }
    }//GEN-LAST:event_btnCancelarTramiteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarTramite;
    private javax.swing.JToggleButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCobro;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblInfoRFC;
    private javax.swing.JLabel lblRFC;
    // End of variables declaration//GEN-END:variables
}
