/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem;
import serviceprovidingsystem.MapAndAnimation.Animations;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import serviceprovidingsystem.Database.DatabaseConnection;



/**
 *
 * @author omer
 */
public class MainIntro extends javax.swing.JFrame{

    /**
     * Creates new form LoginRegister
     */
    //attribute
    
    public MainIntro() {
        initComponents();
        //code
        this.setBackground(new Color(0, 0, 0, 0));//and tik off from opaque in Kgradient Panel
        this.setOpacity(0f);//set opacity transparency
        this.setIconImage(new ImageIcon("src\\serviceprovidingsystem\\images\\short\\taskbarIcon.png").getImage());
        this.setLocationRelativeTo(null);//Centered the window
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
        jLabel1 = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkBorderRadius(100);
        kGradientPanel1.setkEndColor(new java.awt.Color(60, 156, 220));
        kGradientPanel1.setkGradientFocus(400);
        kGradientPanel1.setkStartColor(new java.awt.Color(180, 225, 255));
        kGradientPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/output-onlinegiftools (5).gif"))); // NOI18N
        jLabel1.setText("jLabel1");

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/short/loading.gif"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(loading)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /*A thread, in the context of Java, is the path followed when executing 
        a program. All Java programs have at least one thread, known as the main 
        thread, which is created by the Java Virtual Machine (JVM) at the program's 
        start, when the main() method is invoked with the main thread.*/
        
        /*Every java application has at least one thread – main thread. But from 
        application point of view – main is the first java thread and we can create 
        multiple threads from it. ... Multithreading refers to two or more threads 
        executing concurrently in a single program.*/
        
        
        /*first we have to pass object in a reference variable so that we can
        access it in Thread.
        then an override run function is created to run the bigger loops in gui*/
        
        //Window Appear Animation
        Animations.windowAppearAnimation(this, 0.9f);
        
        MainIntro window = this;//necessary before any animation in my code
        //open window from 0,0
        Thread th1 = new Thread(){
            @Override
            public void run(){
                try {
                    for (int i = 1; i < 101; i++) {
                        Thread.sleep(74);
                    }
                    Animations.windowCloseAnimation(window, 0.9f);
                    new SignInWindow(new DatabaseConnection()).setVisible(true);
                    } catch (Exception e) {
                }
            }
        };th1.start();
        //Loading Timer
//        Thread th2 = new Thread(){
//            @Override
//            public void run(){
//                try {
//                    for (int i = 1; i < 101; i++) {
//                        Thread.sleep(20);
//                    }
//                    Animations.windowCloseAnimation(window, 0.9f);
//                    new SignInWindow(new DatabaseConnection()).setVisible(true);
//                    } catch (Exception e) {
//                }
//            }
//        };th2.start();
    }//GEN-LAST:event_formWindowOpened
         
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
            java.util.logging.Logger.getLogger(MainIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainIntro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainIntro().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel loading;
    // End of variables declaration//GEN-END:variables
}
