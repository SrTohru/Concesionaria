/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import org.itson.concesionaria.dao.LicenciasDAO;
import org.itson.concesionaria.dao.TramitesDAO;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.costoLicencias;
import org.itson.concesionaria.utilities.discapacidadPersona;
import org.itson.concesionaria.utilities.eManager;
import org.itson.concesionaria.utilities.encriptador;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.mensajesDeSistema;
import org.itson.concesionaria.utilities.tiposTramite;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class RegistroLicencia extends javax.swing.JFrame {

    private LicenciasDAO licenciasDAO = new LicenciasDAO();
    private verificacionesDeSistema verificador = new verificacionesDeSistema();
    private costoLicencias costoLicencia = new costoLicencias();
    private TramitesDAO tramitesDAO = new TramitesDAO();
    private mensajesDeSistema mensajesSistema = new mensajesDeSistema();

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
        if (discapacidad()) {
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
        return !txtRFC.getText().isEmpty();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSolicitudDatos = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblVigencia = new javax.swing.JLabel();
        añosVigencia = new javax.swing.JComboBox<>();
        lblDiscapacitado = new javax.swing.JLabel();
        checkBoxDiscapacitado = new javax.swing.JCheckBox();
        Solicitar = new javax.swing.JButton();
        btnSalir = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        lblSolicitud = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitud de Licencia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblSolicitudDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSolicitudDatos.setText("Porfavor ingresa los datos que se solicita a continuación");
        jPanel1.add(lblSolicitudDatos);
        lblSolicitudDatos.setBounds(20, 20, 452, 20);

        lblRFC.setText("RFC");
        jPanel1.add(lblRFC);
        lblRFC.setBounds(30, 60, 37, 20);

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });
        jPanel1.add(txtRFC);
        txtRFC.setBounds(60, 60, 267, 22);

        lblVigencia.setText("Vigencia");
        jPanel1.add(lblVigencia);
        lblVigencia.setBounds(30, 100, 60, 16);

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
        jPanel1.add(añosVigencia);
        añosVigencia.setBounds(90, 100, 72, 22);

        lblDiscapacitado.setText("¿Eres discapacitado?");
        jPanel1.add(lblDiscapacitado);
        lblDiscapacitado.setBounds(30, 140, 130, 16);

        checkBoxDiscapacitado.setText("Si");
        checkBoxDiscapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDiscapacitadoActionPerformed(evt);
            }
        });
        jPanel1.add(checkBoxDiscapacitado);
        checkBoxDiscapacitado.setBounds(30, 160, 140, 20);

        Solicitar.setBackground(new java.awt.Color(204, 204, 204));
        Solicitar.setText("Solicitar");
        Solicitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarActionPerformed(evt);
            }
        });
        jPanel1.add(Solicitar);
        Solicitar.setBounds(160, 190, 87, 35);

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
        btnSalir.setBounds(340, 240, 60, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 490, 270));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        lblSolicitud.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        lblSolicitud.setText("Solicitud de Licencia");
        jPanel2.add(lblSolicitud);
        lblSolicitud.setBounds(30, 50, 310, 32);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(30, 80, 260, 10);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(290, 30, 140, 70);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 510, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarActionPerformed
        if (allInformationRequiered()) {

            Persona persona = verificador.verificarPersonaPorRFC(txtRFC.getText());

            int vigenciaAños = obtenerVigencia();

            if (verificador.tieneLicenciasRegistradas(persona)) {
                if (mensajesSistema.preguntarCrearNuevaLicencia()) {
                    if (persona != null) {

                        GregorianCalendar fecha = new GregorianCalendar();

                        Tramite tramite = tramitesDAO.crearTramite(persona, estadosTramite.En_Proceso, tiposTramite.Expedicion_De_Licencia, fecha);

                        fecha.add(GregorianCalendar.YEAR, vigenciaAños);
                        if (discapacidad()) {
                            PagoLicencia pagoLicencia = new PagoLicencia(persona, tramite, calcularCostoLicencia(), fecha, discapacidadPersona.Discapacitada);
                            pagoLicencia.setVisible(true);
                        } else {
                            PagoLicencia pagoLicencia = new PagoLicencia(persona, tramite, calcularCostoLicencia(), fecha, discapacidadPersona.No_Discapacitada);
                            pagoLicencia.setVisible(true);
                        }
                        dispose();
                    } else {
                        mensajesSistema.mensajeDeFaltaInformacion();
                    }

                    dispose();
                }
            } else {
                if (persona != null) {

                    GregorianCalendar fecha = new GregorianCalendar();

                    Tramite tramite = tramitesDAO.crearTramite(persona, estadosTramite.En_Proceso, tiposTramite.Expedicion_De_Licencia, fecha);

                    fecha.add(GregorianCalendar.YEAR, vigenciaAños);
                    if (discapacidad()) {
                        PagoLicencia pagoLicencia = new PagoLicencia(persona, tramite, calcularCostoLicencia(), fecha, discapacidadPersona.Discapacitada);
                        pagoLicencia.setVisible(true);
                    } else {
                        PagoLicencia pagoLicencia = new PagoLicencia(persona, tramite, calcularCostoLicencia(), fecha, discapacidadPersona.No_Discapacitada);
                        pagoLicencia.setVisible(true);
                    }
                    dispose();
                } else {
                    mensajesSistema.mensajeDeFaltaInformacion();
                }

                dispose();
            }


    }//GEN-LAST:event_SolicitarActionPerformed
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (mensajesSistema.preguntaCerrar() == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void añosVigenciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_añosVigenciaAncestorAdded

    }//GEN-LAST:event_añosVigenciaAncestorAdded

    private void checkBoxDiscapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDiscapacitadoActionPerformed

    }//GEN-LAST:event_checkBoxDiscapacitadoActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Solicitar;
    private javax.swing.JComboBox<String> añosVigencia;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JCheckBox checkBoxDiscapacitado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDiscapacitado;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JLabel lblSolicitudDatos;
    private javax.swing.JLabel lblVigencia;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
