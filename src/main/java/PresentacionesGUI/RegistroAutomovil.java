/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentacionesGUI;

import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.utilities.costoLicencias;
import org.itson.concesionaria.utilities.costoPlacas;
import org.itson.concesionaria.utilities.estadosTramite;
import org.itson.concesionaria.utilities.mensajesDeSistema;
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
        jSeparator = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        lblIngresarDatos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIngresarDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresarDatos.setText("Ingresa los datos del automóvil");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\naely\\Downloads\\Itson\\6to Semestre\\BDAvanzadas\\UC2\\Proyecto Unidad 2\\p2 Licencias\\Concesionaria\\src\\main\\java\\Multimedia\\CIRCULACION - REGISTRO DE AUTOS.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblIngresarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)))
                .addGap(28, 28, 28)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 570, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Porfavor ingresa los datos que se te solicitan a continuación");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 50, 423, 16);

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(240, 310, 100, 20);

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnSalir);
        btnSalir.setBounds(490, 360, 72, 23);

        lblRFC.setText("RFC");
        jPanel1.add(lblRFC);
        lblRFC.setBounds(50, 90, 30, 16);
        jPanel1.add(txtRFC);
        txtRFC.setBounds(80, 90, 410, 22);

        lblModelo.setText("Modelo");
        jPanel1.add(lblModelo);
        lblModelo.setBounds(70, 140, 50, 16);
        jPanel1.add(txtModelo);
        txtModelo.setBounds(70, 170, 190, 22);
        jPanel1.add(txtMarca);
        txtMarca.setBounds(310, 170, 190, 22);

        lblMarca.setText("Marca");
        jPanel1.add(lblMarca);
        lblMarca.setBounds(310, 140, 70, 20);
        jPanel1.add(txtSerie);
        txtSerie.setBounds(70, 240, 190, 22);

        lblSerie.setText("Serie");
        jPanel1.add(lblSerie);
        lblSerie.setBounds(70, 210, 30, 16);
        jPanel1.add(txtColor);
        txtColor.setBounds(310, 240, 190, 22);

        lblColor.setText("Color");
        jPanel1.add(lblColor);
        lblColor.setBounds(310, 210, 30, 16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 570, 410));

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

    public Auto obtenerAuto(Persona persona){
        return new Auto(persona.getLicencia(), persona, null);
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (verificacionDeInformacion()) {
            if(verificacionRFC()){
                
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
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
