/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.entitys.Vehiculo;
import org.itson.concesionaria.utilities.costoLicencias;
import org.itson.concesionaria.utilities.costoPlacas;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.mensajesDeSistema;
import org.itson.concesionaria.utilities.tipoVehiculo;
import org.itson.concesionaria.utilities.tiposTramite;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

public class RegistroAutomovil extends javax.swing.JFrame {

    costoPlacas cp = new costoPlacas();
    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();
    mensajesDeSistema mensajesSistema = new mensajesDeSistema();

    public RegistroAutomovil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblIngresarDatos = new javax.swing.JLabel();
        lblDatos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblIngresaDatos = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        txtSerie = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        lblIngresarDatos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIngresarDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresarDatos.setText("Ingresa los datos del automóvil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblIngresarDatos))
                    .addComponent(lblDatos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 580, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblIngresaDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIngresaDatos.setText("Porfavor ingresa los datos que se solicita a continuación");
        jPanel1.add(lblIngresaDatos);
        lblIngresaDatos.setBounds(50, 50, 423, 16);

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(230, 380, 100, 40);

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
        btnSalir.setBounds(520, 430, 60, 23);

        lblRFC.setText("RFC");
        jPanel1.add(lblRFC);
        lblRFC.setBounds(50, 90, 30, 16);
        jPanel1.add(txtRFC);
        txtRFC.setBounds(80, 90, 410, 22);

        lblModelo.setText("Modelo (año)");
        jPanel1.add(lblModelo);
        lblModelo.setBounds(50, 210, 90, 16);
        jPanel1.add(txtModelo);
        txtModelo.setBounds(50, 240, 190, 22);
        jPanel1.add(txtMarca);
        txtMarca.setBounds(50, 170, 190, 22);

        lblMarca.setText("Marca");
        jPanel1.add(lblMarca);
        lblMarca.setBounds(50, 140, 70, 20);

        lblSerie.setText("Serie (numerología)");
        jPanel1.add(lblSerie);
        lblSerie.setBounds(310, 140, 120, 16);
        jPanel1.add(txtColor);
        txtColor.setBounds(50, 310, 190, 22);

        lblColor.setText("Color");
        jPanel1.add(lblColor);
        lblColor.setBounds(50, 280, 30, 16);

        lblLinea.setText("Linea");
        jPanel1.add(lblLinea);
        lblLinea.setBounds(310, 210, 70, 16);
        jPanel1.add(txtLinea);
        txtLinea.setBounds(310, 240, 190, 22);

        try {
            txtSerie.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });
        jPanel1.add(txtSerie);
        txtSerie.setBounds(310, 170, 190, 22);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 600, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean verificacionRFC() {
        Persona persona = verificacionesSistema.verificarPersonaPorRFC(txtRFC.getText());
        return persona != null;
    }

    public boolean verificacionDeInformacion() {
        return !(txtColor.getText().isEmpty())
                || !(txtMarca.getText().isEmpty())
                || !(txtModelo.getText().isEmpty())
                || !(txtRFC.getText().isEmpty())
                || !(txtSerie.getText().isEmpty() && txtSerie.getText().length() == 7);
    }

    public Auto obtenerAuto(Persona persona) {
        Auto auto = new Auto(persona.getLicencia(), persona, null);

        auto.setMarca(txtMarca.getText());
        auto.setColor(txtColor.getText());
        auto.setModelo(txtModelo.getText());
        auto.setSerie(txtSerie.getText());
        return auto;
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

//verificacionesSistema.consultarExistenciaVehiculoPorSerie(txtSerie.getText());
        if (verificacionDeInformacion()) {
            Persona persona = verificacionesSistema.verificarPersonaPorRFC(txtRFC.getText());
            if (persona != null) {
                if (verificacionesSistema.cuentaConLicenciaActiva(persona)) {
                    Auto autoVerificado = verificacionesSistema.consultarExistenciaVehiculoPorSerie(txtSerie.getText());

                    if (autoVerificado != null) {
                        if (existenciaAuto() == 0) {

                            Tramite tramite = new Tramite(persona, estadosTramite.En_Proceso, tiposTramite.Expedicion_De_Placas, new GregorianCalendar());

                            RegistroPlaca rPlacas = new RegistroPlaca(autoVerificado, persona, tramite, true);

                            rPlacas.setVisible(true);
                        }
                        dispose();
                    } else {

                        Tramite tramite = new Tramite(persona, estadosTramite.En_Proceso, tiposTramite.Expedicion_De_Placas, new GregorianCalendar());

                        RegistroPlaca rPlacas = new RegistroPlaca(obtenerAuto(persona), persona, tramite, false);

                        rPlacas.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Lo siento, no puede registrar un auto sin tener una licencia activa.");
                }

            }
        } else {
            mensajesSistema.mensajeDeFaltaInformacion();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        preguntaCerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    public int existenciaAuto() {
        return JOptionPane.showConfirmDialog(null, "¿Ese automovil ya existe y cuenta con placas, desea asignarle unas nuevas placas?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
    }

    public void preguntaCerrar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir del registro?", "Salir", JOptionPane.YES_NO_OPTION);
        if (respuestaCliente == 0) {
            this.dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblIngresaDatos;
    private javax.swing.JLabel lblIngresarDatos;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JFormattedTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
