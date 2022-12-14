/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pages;

import Controllers.PageController.QueueController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author pongp
 */
public class Queue extends javax.swing.JPanel {

    private QueueController controller;
    private boolean addQueueOpened;
    /**
     * Creates new form Page1
     */
    public Queue(QueueController controller) {
        this.controller = controller;
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 656));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Queue");

        jButton1.setBackground(new java.awt.Color(108, 118, 234));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Queue");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(108, 118, 234));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 118, 234), 2));

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment Time", "Customer Name", "Pet Name", "Tel", "Pet Details", "Accept"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(158, 165, 241));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setDefaultRenderer(new Renderer.MeowTableHeaderRenderer());
        jTable1.getTableHeader().setBackground(new java.awt.Color(108, 118, 234));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setCellEditor(new Editor.PetDetailEditor(this.controller));
            jTable1.getColumnModel().getColumn(4).setCellRenderer(new Renderer.ButtonRenderer("View"));
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setCellEditor(new Editor.AcceptEditor(this.controller)
            );
            jTable1.getColumnModel().getColumn(5).setCellRenderer(new Renderer.ButtonRenderer("Accept"));
        }
        jTable1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controller.setQueueTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!addQueueOpened){
            Popup.AddQueue addQueue = new Popup.AddQueue(this.controller);
            addQueueOpened = true;
            addQueue.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent event){
                    addQueueOpened = false;
                }
            });
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public javax.swing.JTable getJTable1(){
        return this.jTable1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
