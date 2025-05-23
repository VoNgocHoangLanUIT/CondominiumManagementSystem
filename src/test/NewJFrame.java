/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

/**
 *
 * @author DELL
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        menuPanel = new javax.swing.JPanel();
        accountsButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        otherButton = new javax.swing.JButton();
        serviceFacilityButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        residentManagementButton = new javax.swing.JButton();
        complaintsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        parkingManagementButton = new javax.swing.JButton();
        serviceSub = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        accountsButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        accountsButton.setText("Accounts");
        accountsButton.setContentAreaFilled(false);

        profileButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        profileButton.setText("Profile");
        profileButton.setContentAreaFilled(false);

        otherButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        otherButton.setText("Other");
        otherButton.setContentAreaFilled(false);
        otherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherButtonActionPerformed(evt);
            }
        });

        serviceFacilityButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        serviceFacilityButton.setText("Services & Facility");
        serviceFacilityButton.setContentAreaFilled(false);
        serviceFacilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceFacilityButtonActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Application");

        residentManagementButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        residentManagementButton.setText("Resident Management");
        residentManagementButton.setContentAreaFilled(false);
        residentManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentManagementButtonActionPerformed(evt);
            }
        });

        complaintsButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        complaintsButton.setText("Complaints");
        complaintsButton.setContentAreaFilled(false);

        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        homeButton.setText("Home");
        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        parkingManagementButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        parkingManagementButton.setText("Parking Management");
        parkingManagementButton.setContentAreaFilled(false);
        parkingManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkingManagementButtonActionPerformed(evt);
            }
        });

        serviceSub.setBackground(new java.awt.Color(51, 51, 51));
        serviceSub.setLayout(new javax.swing.BoxLayout(serviceSub, javax.swing.BoxLayout.Y_AXIS));

        jButton9.setFont(new java.awt.Font("Sans Serif Collection", 1, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("services");
        jButton9.setContentAreaFilled(false);
        jButton9.setMaximumSize(new java.awt.Dimension(242, 55));
        jButton9.setPreferredSize(new java.awt.Dimension(242, 55));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        serviceSub.add(jButton9);

        jButton10.setFont(new java.awt.Font("Sans Serif Collection", 1, 15)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("facility");
        jButton10.setContentAreaFilled(false);
        jButton10.setMaximumSize(new java.awt.Dimension(242, 55));
        jButton10.setPreferredSize(new java.awt.Dimension(242, 55));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        serviceSub.add(jButton10);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(complaintsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(residentManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parkingManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(otherButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(serviceSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(serviceFacilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(residentManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parkingManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complaintsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceFacilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherButtonActionPerformed

    private void serviceFacilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceFacilityButtonActionPerformed
        // TODO add your handling code here:
        serviceSub.setVisible(!serviceSub.isVisible());
        if(serviceSub.isVisible()){
            menuPanel.setPreferredSize(new Dimension(menuPanel.getWidth() , 660));
            menuPanel.setSize(menuPanel.getPreferredSize());
            menuPanel.revalidate();
            menuPanel.repaint();
        }
        else{
            menuPanel.setPreferredSize(new Dimension(menuPanel.getWidth(), 545));
            menuPanel.setSize(menuPanel.getPreferredSize());
            menuPanel.revalidate();
            menuPanel.repaint();
        }
    }//GEN-LAST:event_serviceFacilityButtonActionPerformed

    private void residentManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentManagementButtonActionPerformed
        // TODO add your handling code here:
        showPanel("resident");
    }//GEN-LAST:event_residentManagementButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        showPanel("home");
    }//GEN-LAST:event_homeButtonActionPerformed

    private void parkingManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkingManagementButtonActionPerformed
        // TODO add your handling code here:
        showPanel("parking");
    }//GEN-LAST:event_parkingManagementButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        showPanel("apartment");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        showPanel("booking");
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountsButton;
    private javax.swing.JButton complaintsButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton otherButton;
    private javax.swing.JButton parkingManagementButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton residentManagementButton;
    private javax.swing.JButton serviceFacilityButton;
    private javax.swing.JPanel serviceSub;
    // End of variables declaration//GEN-END:variables
}
