package lab8;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class Principal extends javax.swing.JFrame {

    static Random r = new Random();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Crear_HR = new javax.swing.JDialog();
        jl_Riesgo = new javax.swing.JLabel();
        jl_Codigo = new javax.swing.JLabel();
        bt_Crear = new javax.swing.JButton();
        tf_C_HR = new javax.swing.JTextField();
        cb_NR_HR = new javax.swing.JComboBox<>();
        bt_Guarda = new javax.swing.JButton();
        jd_Crear_HS = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_Crear1 = new javax.swing.JButton();
        tf_Codigo1 = new javax.swing.JTextField();
        cb_NR_HS = new javax.swing.JComboBox<>();
        bt_Guardar1 = new javax.swing.JButton();
        jd_Simulacion = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jbr_Progreso = new javax.swing.JProgressBar();
        bt_Simular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_Caracteres_Prueba = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        JL_Hacks = new javax.swing.JList<>();
        jd_Mostrar_HR = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Mostar_HR = new javax.swing.JTextArea();
        jd_Mostrar_HS = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_Cargar_HS = new javax.swing.JTextArea();
        jd_Administar = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        JL_Hacks1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        bt_Eliminar = new javax.swing.JButton();
        bt_Cargar = new javax.swing.JButton();
        bt_Cargar1 = new javax.swing.JButton();
        bt_C_HS = new javax.swing.JButton();
        bt_C_HR = new javax.swing.JButton();
        bt_Simulacion = new javax.swing.JButton();
        jl_Menu = new javax.swing.JLabel();
        bt_Administar = new javax.swing.JButton();

        jl_Riesgo.setText("Nivel de Riesgo ");

        jl_Codigo.setText("Codigo");

        bt_Crear.setText("Crear");
        bt_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearActionPerformed(evt);
            }
        });

        cb_NR_HR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", " " }));
        cb_NR_HR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_NR_HRItemStateChanged(evt);
            }
        });

        bt_Guarda.setText("Guardar");
        bt_Guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GuardaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Crear_HRLayout = new javax.swing.GroupLayout(jd_Crear_HR.getContentPane());
        jd_Crear_HR.getContentPane().setLayout(jd_Crear_HRLayout);
        jd_Crear_HRLayout.setHorizontalGroup(
            jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_HRLayout.createSequentialGroup()
                .addGroup(jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_HRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_Riesgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_C_HR)
                            .addComponent(cb_NR_HR, 0, 88, Short.MAX_VALUE)))
                    .addGroup(jd_Crear_HRLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bt_Crear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Guarda)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jd_Crear_HRLayout.setVerticalGroup(
            jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_HRLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_Riesgo)
                    .addComponent(cb_NR_HR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Codigo)
                    .addComponent(tf_C_HR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_Crear_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Crear)
                    .addComponent(bt_Guarda))
                .addGap(73, 73, 73))
        );

        jLabel1.setText("Nivel de Riesgo");

        jLabel2.setText("Codigo");

        bt_Crear1.setText("Crear");
        bt_Crear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear1ActionPerformed(evt);
            }
        });

        cb_NR_HS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8", "9", "10", " " }));
        cb_NR_HS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_NR_HSItemStateChanged(evt);
            }
        });

        bt_Guardar1.setText("Guardar");
        bt_Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Crear_HSLayout = new javax.swing.GroupLayout(jd_Crear_HS.getContentPane());
        jd_Crear_HS.getContentPane().setLayout(jd_Crear_HSLayout);
        jd_Crear_HSLayout.setHorizontalGroup(
            jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_HSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jd_Crear_HSLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_NR_HS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_Crear_HSLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tf_Codigo1)))
                    .addGroup(jd_Crear_HSLayout.createSequentialGroup()
                        .addComponent(bt_Guardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Crear1)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jd_Crear_HSLayout.setVerticalGroup(
            jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Crear_HSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_NR_HS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jd_Crear_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Crear1)
                    .addComponent(bt_Guardar1))
                .addContainerGap())
        );

        jLabel3.setText("Hacks Creados");

        bt_Simular.setText("Simular");
        bt_Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SimularActionPerformed(evt);
            }
        });

        jLabel4.setText("Caracteres");

        jScrollPane3.setViewportView(JL_Hacks);

        javax.swing.GroupLayout jd_SimulacionLayout = new javax.swing.GroupLayout(jd_Simulacion.getContentPane());
        jd_Simulacion.getContentPane().setLayout(jd_SimulacionLayout);
        jd_SimulacionLayout.setHorizontalGroup(
            jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_Simular)
                    .addComponent(jbr_Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Caracteres_Prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jd_SimulacionLayout.setVerticalGroup(
            jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(127, 127, 127))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Caracteres_Prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_Simular)
                .addGap(18, 18, 18)
                .addComponent(jbr_Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        ta_Mostar_HR.setEditable(false);
        ta_Mostar_HR.setColumns(20);
        ta_Mostar_HR.setRows(5);
        jScrollPane1.setViewportView(ta_Mostar_HR);

        javax.swing.GroupLayout jd_Mostrar_HRLayout = new javax.swing.GroupLayout(jd_Mostrar_HR.getContentPane());
        jd_Mostrar_HR.getContentPane().setLayout(jd_Mostrar_HRLayout);
        jd_Mostrar_HRLayout.setHorizontalGroup(
            jd_Mostrar_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jd_Mostrar_HRLayout.setVerticalGroup(
            jd_Mostrar_HRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Mostrar_HRLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        ta_Cargar_HS.setEditable(false);
        ta_Cargar_HS.setColumns(20);
        ta_Cargar_HS.setRows(5);
        jScrollPane2.setViewportView(ta_Cargar_HS);

        javax.swing.GroupLayout jd_Mostrar_HSLayout = new javax.swing.GroupLayout(jd_Mostrar_HS.getContentPane());
        jd_Mostrar_HS.getContentPane().setLayout(jd_Mostrar_HSLayout);
        jd_Mostrar_HSLayout.setHorizontalGroup(
            jd_Mostrar_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Mostrar_HSLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_Mostrar_HSLayout.setVerticalGroup(
            jd_Mostrar_HSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Mostrar_HSLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(JL_Hacks1);

        jLabel5.setText("Hacks Creados");

        bt_Eliminar.setText("Eliminar");
        bt_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EliminarActionPerformed(evt);
            }
        });

        bt_Cargar.setText("Cargar Hackeo Regular");
        bt_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CargarActionPerformed(evt);
            }
        });

        bt_Cargar1.setText("Cargar Hackeo Super");
        bt_Cargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cargar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_AdministarLayout = new javax.swing.GroupLayout(jd_Administar.getContentPane());
        jd_Administar.getContentPane().setLayout(jd_AdministarLayout);
        jd_AdministarLayout.setHorizontalGroup(
            jd_AdministarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AdministarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_AdministarLayout.createSequentialGroup()
                .addGroup(jd_AdministarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AdministarLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(bt_Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Cargar))
                    .addComponent(bt_Cargar1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_AdministarLayout.setVerticalGroup(
            jd_AdministarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AdministarLayout.createSequentialGroup()
                .addGroup(jd_AdministarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AdministarLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE))
                    .addGroup(jd_AdministarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_AdministarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_Eliminar)
                            .addComponent(bt_Cargar))
                        .addGap(29, 29, 29)))
                .addComponent(bt_Cargar1)
                .addGap(35, 35, 35))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_C_HS.setText("Crear Hackeo Super");
        bt_C_HS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_C_HSActionPerformed(evt);
            }
        });

        bt_C_HR.setText("Crear Hackeo Regular");
        bt_C_HR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_C_HRActionPerformed(evt);
            }
        });

        bt_Simulacion.setText("Simulacion");
        bt_Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SimulacionActionPerformed(evt);
            }
        });

        jl_Menu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Menu.setText("Menu");

        bt_Administar.setText("Administrar");
        bt_Administar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AdministarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Administar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_C_HS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(bt_C_HR)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Simulacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jl_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_C_HS)
                    .addComponent(bt_C_HR)
                    .addComponent(bt_Simulacion))
                .addGap(35, 35, 35)
                .addComponent(bt_Administar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SimulacionActionPerformed
        // TODO add your handling code here:
        jd_Simulacion.setModal(true);
        jd_Simulacion.pack();
        jd_Simulacion.setLocationRelativeTo(this);
        jd_Simulacion.setVisible(true);
    }//GEN-LAST:event_bt_SimulacionActionPerformed

    private void bt_C_HSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_C_HSActionPerformed
        // TODO add your handling code here:
        jd_Crear_HS.setModal(true);
        jd_Crear_HS.pack();
        jd_Crear_HS.setLocationRelativeTo(this);
        jd_Crear_HS.setVisible(true);
    }//GEN-LAST:event_bt_C_HSActionPerformed

    private void bt_C_HRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_C_HRActionPerformed
        // TODO add your handling code here:
        jd_Crear_HR.setModal(true);
        jd_Crear_HR.pack();
        jd_Crear_HR.setLocationRelativeTo(this);
        jd_Crear_HR.setVisible(true);
    }//GEN-LAST:event_bt_C_HRActionPerformed

    private void bt_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearActionPerformed
        // TODO add your handling code here:
        h = new Hackeo(Integer.parseInt(tf_C_HR.getText()), riesgo, "Regular");
        hacks.add(h);
        DefaultListModel modelo = (DefaultListModel) JL_Hacks.getModel();
        modelo.addElement(h);
        JL_Hacks.setModel(modelo);
        tf_C_HR.setText("");
        cb_NR_HR.setSelectedIndex(0);
    }//GEN-LAST:event_bt_CrearActionPerformed

    private void cb_NR_HRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_NR_HRItemStateChanged
        // TODO add your handling code here:
        switch (cb_NR_HR.getSelectedIndex()) {
            case 0:
                riesgo = 1;
                break;
            case 1:
                riesgo = 2;
                break;
            case 2:
                riesgo = 3;
                break;
            case 3:
                riesgo = 4;
                break;
            case 4:
                riesgo = 5;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Ocurrio un problema");
                break;
        }
    }//GEN-LAST:event_cb_NR_HRItemStateChanged

    private void bt_Crear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear1ActionPerformed
        // TODO add your handling code here:
        h = new Hackeo(Integer.parseInt(tf_Codigo1.getText()), riesgo2, "Super");
        hacks.add(h);
        DefaultListModel modelo = (DefaultListModel) JL_Hacks.getModel();
        modelo.addElement(h);
        JL_Hacks.setModel(modelo);
        tf_C_HR.setText("");
        cb_NR_HR.setSelectedIndex(0);
    }//GEN-LAST:event_bt_Crear1ActionPerformed

    private void cb_NR_HSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_NR_HSItemStateChanged
        // TODO add your handling code here:
        switch (cb_NR_HR.getSelectedIndex()) {
            case 0:
                riesgo2 = 6;
                break;
            case 1:
                riesgo2 = 7;
                break;
            case 2:
                riesgo2 = 8;
                break;
            case 3:
                riesgo2 = 9;
                break;
            case 4:
                riesgo2 = 10;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Ocurrio un problema");
                break;
        }
    }//GEN-LAST:event_cb_NR_HSItemStateChanged

    private void bt_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Guardar1ActionPerformed
        // TODO add your handling code here:
        adminHackeo ap = new adminHackeo("./Hackeo Super");
        ap.cargarArchivo();
        ap.setHackeo(h);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Hackeo guardado exitosamente");
        tf_C_HR.setText("");
        cb_NR_HR.setSelectedIndex(0);
    }//GEN-LAST:event_bt_Guardar1ActionPerformed

    private void bt_GuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GuardaActionPerformed
        // TODO add your handling code here:
        adminHackeo ap = new adminHackeo("./Hackeo Regular");
        ap.cargarArchivo();
        ap.setHackeo(h);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Hackeo guardado exitosamente");
        tf_C_HR.setText("");
        cb_NR_HR.setSelectedIndex(0);
    }//GEN-LAST:event_bt_GuardaActionPerformed

    private void bt_AdministarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AdministarActionPerformed
        // TODO add your handling code here:
        jd_Administar.setModal(true);
        jd_Administar.pack();
        jd_Administar.setLocationRelativeTo(this);
        jd_Administar.setVisible(true);
    }//GEN-LAST:event_bt_AdministarActionPerformed

    private void bt_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SimularActionPerformed
        // TODO add your handling code here:
        int pos = JL_Hacks.getSelectedIndex();
        String temp = tf_Caracteres_Prueba.getText();
        int n1 = ((HackeoR) hacks.get(pos)).getN_riesgo(), n2 = ((HackeoS) hacks.get(pos)).getN_riesgo();
        int car = temp.length();
        DefaultListModel modelo = (DefaultListModel) JL_Hacks.getModel();
        int r1 = 0;
        int r2 = 0;
        if (hacks.get(pos) instanceof HackeoR) {
            r1 = 1 + r.nextInt(10);
        }
        if (hacks.get(pos) instanceof HackeoS) {
            r2 = 6 + r.nextInt(10);
        }
        int dur = 0;
        int exi = 0;
        int fal = 0;
        jbr_Progreso.setValue(0);
        jbr_Progreso.setMaximum(dur * car);
        adminbarra ab = new adminbarra(jbr_Progreso, dur, car);
        if (h instanceof HackeoR) {
            dur = 2;
            if (n1 == r1) {
                JOptionPane.showMessageDialog(this, "Hackeo fallo");
                ab.stop();
            } else {
                exi++;
                ((HackeoR) h).setHackeoE(exi);
                ab.start();
            }
        }
        if (h instanceof HackeoS) {
            dur = 1;
            if (n2 == r2) {
                fal++;
                ((HackeoS) h).setHackeoF(fal);
            } else {
                ab.start();
            }
        }

    }//GEN-LAST:event_bt_SimularActionPerformed

    private void bt_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CargarActionPerformed
        // TODO add your handling code here:
        CargarAHS();
    }//GEN-LAST:event_bt_CargarActionPerformed

    private void bt_Cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cargar1ActionPerformed
        // TODO add your handling code here:
        CargarAHR();
    }//GEN-LAST:event_bt_Cargar1ActionPerformed

    private void bt_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EliminarActionPerformed
        // TODO add your handling code here:
        JL_Hacks1.remove(JL_Hacks1.getSelectedIndex());
        JL_Hacks.remove(JL_Hacks1.getSelectedIndex());
    }//GEN-LAST:event_bt_EliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JL_Hacks;
    private javax.swing.JList<String> JL_Hacks1;
    private javax.swing.JButton bt_Administar;
    private javax.swing.JButton bt_C_HR;
    private javax.swing.JButton bt_C_HS;
    private javax.swing.JButton bt_Cargar;
    private javax.swing.JButton bt_Cargar1;
    private javax.swing.JButton bt_Crear;
    private javax.swing.JButton bt_Crear1;
    private javax.swing.JButton bt_Eliminar;
    private javax.swing.JButton bt_Guarda;
    private javax.swing.JButton bt_Guardar1;
    private javax.swing.JButton bt_Simulacion;
    private javax.swing.JButton bt_Simular;
    private javax.swing.JComboBox<String> cb_NR_HR;
    private javax.swing.JComboBox<String> cb_NR_HS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JProgressBar jbr_Progreso;
    private javax.swing.JDialog jd_Administar;
    private javax.swing.JDialog jd_Crear_HR;
    private javax.swing.JDialog jd_Crear_HS;
    private javax.swing.JDialog jd_Mostrar_HR;
    private javax.swing.JDialog jd_Mostrar_HS;
    private javax.swing.JDialog jd_Simulacion;
    private javax.swing.JLabel jl_Codigo;
    private javax.swing.JLabel jl_Menu;
    private javax.swing.JLabel jl_Riesgo;
    private javax.swing.JTextArea ta_Cargar_HS;
    private javax.swing.JTextArea ta_Mostar_HR;
    private javax.swing.JTextField tf_C_HR;
    private javax.swing.JTextField tf_Caracteres_Prueba;
    private javax.swing.JTextField tf_Codigo1;
    // End of variables declaration//GEN-END:variables
    private Hackeo h;
    private ArrayList<Hackeo> hacks = new ArrayList();
    private int riesgo;
    private int riesgo2;
    adminbarra ab;

    public void CargarAHS() {
        ArrayList<Hackeo> listaHackeo = new ArrayList();
        File archivo = null;
        DefaultListModel modelo = (DefaultListModel) JL_Hacks1.getModel();
        try {
            listaHackeo = new ArrayList();
            Hackeo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream("./Hackeo Super");
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hackeo) objeto.readObject()) != null) {
                        listaHackeo.add(temp);
                        modelo.addElement(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void CargarAHR() {
        ArrayList<Hackeo> listaHackeo = new ArrayList();
        File archivo = null;
        DefaultListModel modelo = (DefaultListModel) JL_Hacks1.getModel();
        try {
            listaHackeo = new ArrayList();
            Hackeo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream("./Hackeo Regular");
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hackeo) objeto.readObject()) != null) {
                        listaHackeo.add(temp);
                        modelo.addElement(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
