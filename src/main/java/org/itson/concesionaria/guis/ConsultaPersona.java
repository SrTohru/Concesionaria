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
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        txtInfoBusqueda = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboBoxSeleccionBusqueda = new javax.swing.JComboBox<>();
        lblInfoSeleccion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tipo de busqueda:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, -1));

        jToggleButton1.setText("Consultar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 111, -1));

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

        jButton1.setText("Historial de la persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 362, -1, -1));

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
            JOptionPane.showMessageDialog(null, "lo presionaste");
            añadirPersonasLista(verificacionesSistema.consultarPersonasMedianteInformacion(encriptador.encriptar(txtInfoBusqueda.getText()), tipoDeBusqueda));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
       JOptionPane.showMessageDialog(null, tabla.getValueAt(filaSeleccionada, 3).toString());
        Persona persona = verificacionesSistema.consultarPersonaMedianteRFC(tabla.getValueAt(filaSeleccionada, 3).toString(), tipoBusqueda.BUSQUEDA_POR_RFC);
        JOptionPane.showMessageDialog(null, persona);
        if(persona != null){
             new Reporte(persona).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxSeleccionBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblInfoSeleccion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtInfoBusqueda;
    // End of variables declaration//GEN-END:variables
}
