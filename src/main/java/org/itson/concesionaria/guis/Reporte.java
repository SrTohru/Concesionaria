/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import javax.swing.JOptionPane;
import static org.itson.concesionaria.entitys.Licencia_.persona;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.jasperReportCreator;
import org.itson.concesionaria.utilities.tiposTramite;

/**
 *
 * @author naely
 */
public class Reporte extends javax.swing.JFrame {

    Persona persona;

    public Reporte(Persona persona) {
        this.persona = persona;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        btnGenerarPDF = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblReporte = new javax.swing.JLabel();
        lblTipoTramite = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 96, -1));

        tablaContenidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Completo", "Costo", "Tipo de Tramite", "Fecha Tramite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaContenidos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 590, 345));

        btnGenerarPDF.setBackground(new java.awt.Color(204, 204, 0));
        btnGenerarPDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 100, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        lblReporte.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblReporte.setForeground(new java.awt.Color(255, 255, 255));
        lblReporte.setText("Reporte ");
        jPanel1.add(lblReporte);
        lblReporte.setBounds(30, 20, 110, 32);

        lblTipoTramite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipoTramite.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoTramite.setText("Tipo de tramite");
        jPanel1.add(lblTipoTramite);
        lblTipoTramite.setBounds(30, 70, 130, 16);

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Licencia", "Placas" }));
        jPanel1.add(cbxTipo);
        cbxTipo.setBounds(130, 70, 82, 22);

        btnCrear.setBackground(new java.awt.Color(51, 204, 0));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnCrear);
        btnCrear.setBounds(220, 70, 70, 22);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 50, 140, 10);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(470, 0, 150, 120);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-13, -4, 650, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 630, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        jasperReportCreator jrc = new jasperReportCreator();

        try {
            if (persona != null) {
                
                if (obtenerTipoTramite() == tiposTramite.Expedicion_De_Licencia) {
                    jrc.generarReportePorTipo(persona, tiposTramite.Expedicion_De_Licencia);
                } else if (obtenerTipoTramite() == tiposTramite.Expedicion_De_Placas) {
                    jrc.generarReportePorTipo(persona, tiposTramite.Expedicion_De_Placas);
                } else {
                    jrc.generarReporte(persona);
                }

            } else {
                JOptionPane.showMessageDialog(null, "persona nula");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed
    public tiposTramite obtenerTipoTramite() {
        switch (cbxTipo.getSelectedIndex()) {
            case 0:
                return null;
            case 1:
                return tiposTramite.Expedicion_De_Licencia;

            case 2:
                return tiposTramite.Expedicion_De_Placas;

            default:
                throw new AssertionError();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblTipoTramite;
    private javax.swing.JTable tablaContenidos;
    // End of variables declaration//GEN-END:variables
}
