/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mostafahassan
 */
public class Payment_panel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form Payment_panel
     */
    public Payment_panel() {
        initComponents();
        add_rank_btn.addActionListener(this);
        calculate_btn.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        rank_name = new javax.swing.JTextField();
        add_rank_btn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        hours_price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        overtime_price = new javax.swing.JTextField();
        avreage = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calculate_btn = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Enter rank name:");

        add_rank_btn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        add_rank_btn.setText("Add Rank");

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel1.setText("Payment Calculator");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Normal Hours Price:");

        hours_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hours_priceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Over Time Price:");

        avreage.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Avreage:");

        calculate_btn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        calculate_btn.setText("Calculate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(avreage)
                        .addGap(404, 404, 404))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rank_name)
                            .addComponent(hours_price)
                            .addComponent(overtime_price, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addComponent(add_rank_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(calculate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addComponent(jLabel9)
                    .addContainerGap(667, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hours_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_rank_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(overtime_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(calculate_btn)
                .addGap(18, 18, 18)
                .addComponent(avreage)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(417, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(221, 221, 221)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hours_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hours_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hours_priceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_rank_btn;
    private javax.swing.JLabel avreage;
    private javax.swing.JButton calculate_btn;
    private javax.swing.JTextField hours_price;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField overtime_price;
    private javax.swing.JTextField rank_name;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        add_rank_btn.setBackground(Color.gray);
        add_rank_btn.setForeground(Color.white);
        calculate_btn.setBackground(Color.gray);
        calculate_btn.setForeground(Color.white);
        if (e.getSource().equals(add_rank_btn)) {
            File myFile = new File(rank_name.getText() + ".txt");//sets the file name with the rank
            if (myFile.exists()) {
                JOptionPane.showMessageDialog(this, "Rank already Entered", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    myFile.createNewFile();
                    PrintWriter p = new PrintWriter(myFile);
                    p.write(Integer.parseInt(hours_price.getText()) + " " + Integer.parseInt(overtime_price.getText()));
                    p.close();
                    JOptionPane.showMessageDialog(this, "Rank Added", "Succes", JOptionPane.OK_OPTION);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            add_rank_btn.setBackground(Color.black);
            add_rank_btn.setForeground(Color.white);

        }
    }
}
