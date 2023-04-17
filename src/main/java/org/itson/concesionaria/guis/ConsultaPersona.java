/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.concesionaria.guis;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.itson.concesionaria.entitys.Persona;
import org.itson.concesionaria.utilities.encriptador;
import org.itson.concesionaria.utilities.tipoBusqueda;
import org.itson.concesionaria.utilities.verificacionesDeSistema;

/**
 *
 * @author naely
 */
public class ConsultaPersona extends javax.swing.JFrame {

    verificacionesDeSistema verificacionesSistema = new verificacionesDeSistema();
    tipoBusqueda tipoDeBusqueda = tipoBusqueda.BUSQUEDA_POR_NOMBRE;

    public ConsultaPersona() {

        initComponents();

        DefaultTableModel modeloTabla = ((DefaultTableModel) this.tabla.getModel());
        modeloTabla.setRowCount(0);
        lblInfoSeleccion.setText("Nombre:");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtInfoBusqueda = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboBoxSeleccionBusqueda = new javax.swing.JComboBox<>();
        lblInfoSeleccion = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();

        jTextField4.setText("jTextField4");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tipo de busqueda:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, -1));

        txtInfoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInfoBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(txtInfoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 169, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellido Paterno", "Apellido Materno", "RFC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 357));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Registro");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 320, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 70, 240, 10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 898, 90));

        comboBoxSeleccionBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por nombre", "Por apellido Paterno", "Por apellido Materno", "Por RFC" }));
        comboBoxSeleccionBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSeleccionBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxSeleccionBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblInfoSeleccion.setText("Null data");
        getContentPane().add(lblInfoSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnHistorial.setText("Historial de la persona");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 362, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton1.setText("Consultar");
        jToggleButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(40, 150, 111, 22);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 90, 950, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void añadirPersonasLista(List<Persona> personas) {
        try {
            DefaultTableModel modeloTabla = ((DefaultTableModel) this.tabla.getModel());
            modeloTabla.setRowCount(0);
            for (Persona persona : personas) {
                Object[] fila = {encriptador.desencriptar(persona.getNombres()), encriptador.desencriptar(persona.getApellidoPaterno()),
                    encriptador.desencriptar(persona.getApellidoMaterno()), persona.getRfc()};
                modeloTabla.addRow(fila);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al añadir a las personas a la lista");
        }
    }

    public void preguntaCerrar() {
        int respuestaCliente = JOptionPane.showConfirmDialog(null, "¿Realmente desea cerrar el programa?", "Cerrar programa", JOptionPane.YES_NO_OPTION);
        if (respuestaCliente == 0) {
            dispose();
        }
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            JOptionPane.showMessageDialog(null, "Esto puede tomar un poco de tiempo, sea paciente :).");
            
            if (tipoDeBusqueda == tipoBusqueda.BUSQUEDA_POR_RFC) {
                añadirPersonasLista(verificacionesSistema.consultarPersonasMedianteInformacion(txtInfoBusqueda.getText(), tipoDeBusqueda));

            } else {
                añadirPersonasLista(verificacionesSistema.consultarPersonasMedianteInformacion(encriptador.encriptar(txtInfoBusqueda.getText()), tipoDeBusqueda));

            }
            
            JOptionPane.showMessageDialog(null, "Puede seleccionar una persona de la lista para generar su reporte.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        preguntaCerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtInfoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInfoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInfoBusquedaActionPerformed

    private void comboBoxSeleccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSeleccionBusquedaActionPerformed

        int itemSeleccionado = comboBoxSeleccionBusqueda.getSelectedIndex();
        switch (itemSeleccionado) {
            case 0:
                lblInfoSeleccion.setText("Nombre:");
                tipoDeBusqueda = tipoBusqueda.BUSQUEDA_POR_NOMBRE;
                break;
            case 1:
                lblInfoSeleccion.setText("Apellido Paterno:");
                tipoDeBusqueda = tipoBusqueda.BUSQUEDA_POR_APELLIDO_PATERNO;
                break;
            case 2:
                lblInfoSeleccion.setText("Apellido Materno:");
                tipoDeBusqueda = tipoBusqueda.BUSQUEDA_POR_APELLIDO_MATERNO;
                break;
            case 3:
                lblInfoSeleccion.setText("RFC:");
                tipoDeBusqueda = tipoBusqueda.BUSQUEDA_POR_RFC;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_comboBoxSeleccionBusquedaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
        
        
        JOptionPane.showMessageDialog(null, tabla.getValueAt(filaSeleccionada, 3).toString());
        Persona persona = verificacionesSistema.obtenerPersonaPorRFC(tabla.getValueAt(filaSeleccionada, 3).toString());
        JOptionPane.showMessageDialog(null, persona);
        if (persona != null) {
            new Reporte(persona).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }//GEN-LAST:event_btnHistorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxSeleccionBusqueda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblInfoSeleccion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtInfoBusqueda;
    // End of variables declaration//GEN-END:variables
}
