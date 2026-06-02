/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.component;

import com.raven.model.Model_Card;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.event.ActionListener;

/**
 *
 * @author Gerùain
 */
public class CardB extends javax.swing.JPanel {

    /**
     * Creates new form CardB
     */
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    /**
     *
     */
    public CardB() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMod = new javax.swing.JButton();
        jButtonSupp = new javax.swing.JButton();
        jButtonRen = new javax.swing.JButton();

        jButtonMod.setBackground(new java.awt.Color(0, 0, 255));
        jButtonMod.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButtonMod.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMod.setText("Modifier");
        jButtonMod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jButtonSupp.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSupp.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButtonSupp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSupp.setText("Supprimer");
        jButtonSupp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuppActionPerformed(evt);
            }
        });

        jButtonRen.setBackground(new java.awt.Color(0, 204, 0));
        jButtonRen.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButtonRen.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRen.setText("Renouveler Abonnnement");
        jButtonRen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButtonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButtonSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }
    
    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuppActionPerformed
        // TODO add your handling code here:
        //jButtonSupp.addActionListener();
        
    }//GEN-LAST:event_jButtonSuppActionPerformed

    private void jButtonRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonRen;
    private javax.swing.JButton jButtonSupp;
    // End of variables declaration//GEN-END:variables
}
