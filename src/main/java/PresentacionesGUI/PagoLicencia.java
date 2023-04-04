/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentacionesGUI;

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

        lblCobro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblInfoRFC = new javax.swing.JLabel();
        btnPagar = new javax.swing.JToggleButton();
        btSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCobro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCobro.setText("Pago Licencia");

        lblInfoRFC.setText("RFC");

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btSalir.setText("Cancelar tramite");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Costo");

        lblCosto.setText("Null data");

        lblRFC.setText("Null data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCosto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfoRFC)
                                .addGap(33, 33, 33)
                                .addComponent(lblRFC)))
                        .addContainerGap(201, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCobro)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCobro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfoRFC)
                    .addComponent(lblRFC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCosto))
                .addGap(18, 18, 18)
                .addComponent(btnPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btSalir)
                .addContainerGap())
        );

        pack();
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

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        if(verificacionSistema.preguntaCancelarTramite()){
            JOptionPane.showMessageDialog(null, "Confirmada");
            tramiteDAO.cancelarTramite(tramite, estadosTramite.Cancelado);
            dispose();
        }
    }//GEN-LAST:event_btSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir;
    private javax.swing.JToggleButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCobro;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblInfoRFC;
    private javax.swing.JLabel lblRFC;
    // End of variables declaration//GEN-END:variables
}
