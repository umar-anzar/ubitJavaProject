/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.UserWindows;

import serviceprovidingsystem.Database.DatabaseConnection;
import serviceprovidingsystem.MapAndAnimation.Animations;

/**
 *
 * @author omer
 */
public class SettingPanel extends javax.swing.JFrame {

    /**
     * Creates new form SettingPanel
     */
    //attributes
    DatabaseConnection database;
    int XMouse;
    int YMouse;
    
    public SettingPanel(){
        initComponents();
    }
    public SettingPanel(DatabaseConnection database) {
        initComponents();
        this.database = database;
        if (this.database.currentUser == null){
            this.mobileNumberField.setVisible(false);
            this.passwordField.setVisible(false);
            this.btnSettingAccept.setVisible(false);
        } else{
            this.mobileNumberField.setText(database.currentUser.getContactNumber());
            this.passwordField.setText(database.currentUser.getPassword());
        }
        this.setOpacity(0.85f);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        mobileNumberField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSettingAccept = new com.k33ptoo.components.KButton();
        passwordField = new javax.swing.JPasswordField();
        errorLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setUndecorated(true);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkGradientFocus(1);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mobileNumberField.setBackground(new java.awt.Color(51, 51, 51));
        mobileNumberField.setForeground(new java.awt.Color(255, 255, 255));
        mobileNumberField.setText("jTextField1");
        mobileNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumberFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(mobileNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 81, 240, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 41, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mobile No.");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 79, -1, -1));

        btnSettingAccept.setText("OK");
        btnSettingAccept.setBorderPainted(false);
        btnSettingAccept.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnSettingAccept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSettingAccept.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSettingAccept.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnSettingAccept.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSettingAccept.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        btnSettingAccept.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSettingAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingAcceptActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSettingAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 123, 43, 26));

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("jPasswordField1");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 45, 240, -1));

        errorLabel.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(193, 56, 56));
        kGradientPanel1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 112, 179, 26));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(507, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSettingAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingAcceptActionPerformed
        // TODO add your handling code here:
        System.out.println(passwordField.getText().isEmpty());
        if (passwordField.getText().isEmpty() || mobileNumberField.getText().isEmpty()) {
            errorLabel.setText("Fields are empty");
        } else if(mobileNumberField.getText().length() != 11) {
            errorLabel.setText("Mobile Number is incorrect");
        } else {
            this.database.currentUser.setPassword(passwordField.getText());
            this.database.currentUser.setContactNumber(mobileNumberField.getText());
            this.database.UPDATE_USER();
            System.out.println("UPDATED_USER");
            this.dispose();
        }
    }//GEN-LAST:event_btnSettingAcceptActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
        errorLabel.setText("");
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void mobileNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberFieldActionPerformed
        // TODO add your handling code here:
        errorLabel.setText("");
    }//GEN-LAST:event_mobileNumberFieldActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Animations.windowCloseAnimation(this, this.getOpacity());
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingPanel(new DatabaseConnection()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnSettingAccept;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
