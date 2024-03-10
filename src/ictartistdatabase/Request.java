/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictartistdatabase;

/**
 *
 * @author Renren
 */
public class Request extends javax.swing.JFrame {

    /**
     * Creates new form Request
     */
    public Request() {
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

        Section = new javax.swing.JTextField();
        Social = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Admit = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Section.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Section.setForeground(new java.awt.Color(0, 102, 102));
        Section.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Section.setText("[Section]");
        Section.setBorder(null);
        Section.setOpaque(false);
        Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionActionPerformed(evt);
            }
        });
        getContentPane().add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 740, 840, 120));

        Social.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Social.setForeground(new java.awt.Color(0, 102, 102));
        Social.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Social.setText("[Social Media]");
        Social.setBorder(null);
        Social.setOpaque(false);
        Social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SocialActionPerformed(evt);
            }
        });
        getContentPane().add(Social, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 850, 120));

        Name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 102, 102));
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setText("[Artist's Name]");
        Name.setBorder(null);
        Name.setOpaque(false);
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 850, 110));

        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 950, 230, 60));

        Admit.setContentAreaFilled(false);
        Admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmitActionPerformed(evt);
            }
        });
        getContentPane().add(Admit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 940, 230, 70));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lh1/project/IMG/Admit.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2020, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SocialActionPerformed

    private void SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionActionPerformed

    private void AdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmitActionPerformed
        // TODO add your handling code here:
        dispose();
        new SearchAdmit().setVisible(true);
    }//GEN-LAST:event_AdmitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        dispose();
        new SearchAdmit().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admit;
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Section;
    private javax.swing.JTextField Social;
    // End of variables declaration//GEN-END:variables
}
