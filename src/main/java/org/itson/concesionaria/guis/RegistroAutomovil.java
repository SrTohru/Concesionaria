/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

        jToggleButton1 = new javax.swing.JToggleButton();
        lblIngresarDatos = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblIngresarDatos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngresarDatos.setText("Ingresa los datos del automóvil");

        lblModelo.setText("Modelo");

        lblMarca.setText("Marca");

        lblSerie.setText("Serie");

        lblColor.setText("Color");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        lblRFC.setText("RFC");

        jLabel1.setText("Porfavor ingresa los datos que se te solicitan a continuación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRFC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngresarDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIngresarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblRFC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerie)
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
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
                || !(txtSerie.getText().isEmpty());
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

            if (verificacionRFC()) {

                Persona persona = verificacionesSistema.verificarPersonaPorRFC(txtRFC.getText());
                Tramite tramite = new Tramite(persona, estadosTramite.En_Proceso, tiposTramite.Expedicion_De_Placas, new GregorianCalendar());

                RegistroPlaca rPlacas = new RegistroPlaca(obtenerAuto(persona), persona, tramite);

                rPlacas.setVisible(true);
            }
        } else {
            mensajesSistema.mensajeDeFaltaInformacion();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblIngresarDatos;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
