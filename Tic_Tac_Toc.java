/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toc;

import javax.swing.JOptionPane;

/**
 *
 * @author Sompod_Programmer
 */
public class Tic_Tac_Toc extends javax.swing.JFrame {


    public Tic_Tac_Toc() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-tac-toe Game");
        setFocusableWindowState(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setForeground(new java.awt.Color(204, 102, 0));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        jLabel2.setText("1st player ");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        jLabel4.setText("2nd player ");

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Tic-tac-toe Game By sompod.");

        jButton10.setBackground(new java.awt.Color(204, 204, 0));
        jButton10.setText("Again");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 0, 51));
        jButton11.setText("Last Result");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Date : 05/04/2018   Creator : Sompod");

        jMenu1.setText("File");

        jMenuItem2.setText("Play with machine");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Play with firend");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem6.setText("Reset all");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int value = 0;
    private boolean game = true;
    private int player1 = 0,player2 = 0;
    private String str,result1,result2;
    private int again = 0;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jButton5.getText().equals("") && value == 0 && game == true) {
            jButton5.setText("O");
            value = 1;
            if(jButton1.getText().equals("O") && jButton7.getText().equals("O")){
                game = false;
            }
            else if(jButton3.getText().equals("O") && jButton9.getText().equals("O")){
                game = false;
            }
            else if(jButton6.getText().equals("O") && jButton4.getText().equals("O")){
                game = false;
            }
            else if(jButton2.getText().equals("O") && jButton8.getText().equals("O")){
                game = false;
            }
            
            
        } else if (jButton5.getText().equals("") && value == 1 && game == true) {
            jButton5.setText("X");
            value = 0;
            if(jButton1.getText().equals("X") && jButton7.getText().equals("X")){
                game = false;
            }
            else if(jButton3.getText().equals("X") && jButton9.getText().equals("X")){
                game = false;
            }
            else if(jButton2.getText().equals("X") && jButton8.getText().equals("X")){
                game = false;
            }
            else if(jButton6.getText().equals("X") && jButton4.getText().equals("X")){
                game = false;
            }
        }
        
        if(game == false && again == 0){
            if(jButton5.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (jButton4.getText().equals("") && value == 0 && game == true) {
            jButton4.setText("O");
            value = 1;
            if(jButton3.getText().equals("O") && jButton7.getText().equals("O")){
                game = false;
            }
            else if(jButton6.getText().equals("O") && jButton5.getText().equals("O")){
                game = false;
            }
            
        } else if (jButton4.getText().equals("") && value == 1 && game == true) {
            jButton4.setText("X");
            value = 0;
            if(jButton3.getText().equals("X") && jButton7.getText().equals("X")){
                game = false;
            }
            else if(jButton6.getText().equals("X") && jButton5.getText().equals("X")){
                game = false;
            }
        }
        if(game == false && again == 0){
            if(jButton4.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jButton1.getText().equals("") && value == 0 && game == true) {
            jButton1.setText("O");
            value = 1;
            if(jButton3.getText().equals("O") && jButton2.getText().equals("O")){
                game = false;
            }
            else if(jButton6.getText().equals("O") && jButton9.getText().equals("O")){
                game = false;
            }
            else if(jButton5.getText().equals("O") && jButton7.getText().equals("O")){
                game = false;
            }
        } else if (jButton1.getText().equals("") && value == 1 && game == true) {
            jButton1.setText("X");
            value = 0;
            if(jButton3.getText().equals("X") && jButton2.getText().equals("X")){
                game = false;
            }
            else if(jButton6.getText().equals("X") && jButton9.getText().equals("X")){
                game = false;
            }
            else if(jButton5.getText().equals("X") && jButton7.getText().equals("X")){
                game = false;
            }
        }
        
        if(game == false && again == 0){
            if(jButton1.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jButton2.getText().equals("") && value == 0 && game == true) {
            jButton2.setText("O");
            value = 1;
            if(jButton3.getText().equals("O") && jButton1.getText().equals("O")){
                game = false;
            }
            else if(jButton5.getText().equals("O") && jButton8.getText().equals("O")){
                game = false;
            }
        } else if (jButton2.getText().equals("") && value == 1 && game == true) {
            jButton2.setText("X");
            value = 0;
            if(jButton3.getText().equals("X") && jButton1.getText().equals("X")){
                game = false;
            }
            else if(jButton5.getText().equals("X") && jButton8.getText().equals("X")){
                game = false;
            }
        }
        if(game == false && again == 0){
            if(jButton2.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jButton3.getText().equals("") && value == 0 && game == true) {
            jButton3.setText("O");
            value = 1;
            if(jButton2.getText().equals("O") && jButton1.getText().equals("O")){
                game = false;
            }
            else if(jButton4.getText().equals("O") && jButton7.getText().equals("O")){
                game = false;
            }
            else if(jButton5.getText().equals("O") && jButton9.getText().equals("O")){
                game = false;
            }
        } else if (jButton3.getText().equals("") && value == 1 && game == true) {
            jButton3.setText("X");
            value = 0;
            if(jButton2.getText().equals("X") && jButton1.getText().equals("X")){
                game = false;
            }
            else if(jButton4.getText().equals("X") && jButton7.getText().equals("X")){
                game = false;
            }
            else if(jButton5.getText().equals("X") && jButton9.getText().equals("X")){
                game = false;
            }
        }
        if(game == false && again == 0){
            if(jButton3.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jButton6.getText().equals("") && value == 0 && game == true) {
            jButton6.setText("O");
            value = 1;
            if(jButton1.getText().equals("O") && jButton9.getText().equals("O")){
                game = false;
            }
            else if(jButton5.getText().equals("O") && jButton4.getText().equals("O")){
                game = false;
            }
        } else if (jButton6.getText().equals("") && value == 1 && game == true) {
            jButton6.setText("X");
            value = 0;
            if(jButton1.getText().equals("X") && jButton9.getText().equals("X")){
                game = false;
            }
            else if(jButton5.getText().equals("X") && jButton4.getText().equals("X")){
                game = false;
            }
        }
        
        if(game == false && again == 0){
            if(jButton6.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (jButton9.getText().equals("") && value == 0 && game == true) {
            jButton9.setText("O");
            value = 1;
            if(jButton6.getText().equals("O") && jButton1.getText().equals("O")){
                game = false;
            }
            else if(jButton8.getText().equals("O") && jButton7.getText().equals("O")){
                game = false;
            }
            else if(jButton5.getText().equals("O") && jButton3.getText().equals("O")){
                game = false;
            }
        } else if (jButton9.getText().equals("") && value == 1 && game == true) {
            jButton9.setText("X");
            value = 0;
            if(jButton6.getText().equals("X") && jButton1.getText().equals("X")){
                game = false;
            }
            else if(jButton8.getText().equals("X") && jButton7.getText().equals("X")){
                game = false;
            }
            else if(jButton5.getText().equals("X") && jButton3.getText().equals("X")){
                game = false;
            }
        }
        if(game == false && again == 0){
            if(jButton9.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (jButton8.getText().equals("") && value == 0 && game == true) {
            jButton8.setText("O");
            value = 1;
            if(jButton5.getText().equals("O") && jButton2.getText().equals("O")){
                game = false;
            }
            else if(jButton7.getText().equals("O") && jButton9.getText().equals("O")){
                game = false;
            }
        } else if (jButton8.getText().equals("") && value == 1 && game == true) {
            jButton8.setText("X");
            value = 0;
            if(jButton2.getText().equals("X") && jButton5.getText().equals("X")){
                game = false;
            }
            else if(jButton9.getText().equals("X") && jButton7.getText().equals("X")){
                game = false;
            }
        }
        if(game == false && again == 0){
            if(jButton8.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (jButton7.getText().equals("") && value == 0 && game == true) {
            jButton7.setText("O");
            value = 1;
            if(jButton3.getText().equals("O") && jButton4.getText().equals("O")){
                game = false;
            }
            else if(jButton8.getText().equals("O") && jButton9.getText().equals("O")){
                game = false;
            }
            else if(jButton5.getText().equals("O") && jButton1.getText().equals("O")){
                game = false;
            }
        } else if (jButton7.getText().equals("") && value == 1 && game == true) {
            jButton7.setText("X");
            value = 0;
            if(jButton3.getText().equals("X") && jButton4.getText().equals("X")){
                game = false;
            }
            else if(jButton8.getText().equals("X") && jButton9.getText().equals("X")){
                game = false;
            }
            else if(jButton5.getText().equals("X") && jButton1.getText().equals("X")){
                game = false;
            }
        }
        
        if(game == false && again == 0){
            if(jButton7.getText().equals("O")){
                ++player1;
                str = String.valueOf(player1);
                jTextField1.setText(str);
                again = 1;
            }
            else
            {
                ++player2;
                str = String.valueOf(player2);
                jTextField2.setText(str);
                again = 1;
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        game = true;
        value = 0;
        again = 0;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
       result1 = jTextField1.getText();
       result2 = jTextField2.getText();
       if(result1.length()<1){
           result1 = "0";
       }
       else if(result2.length()<1){
           result2 = "0";
       }
        JOptionPane.showMessageDialog(createRootPane(), "Player1 Result : "+result1+"\nPlayer2 Result : "+result2);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        result1 = "";
        result2 = "";
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        game = true;
        value = 0;
        again = 0;
        player1 = 0;
        player2 = 0;
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
