/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author DELL
 */
public class HomeUserForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public HomeUserForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuPanel = new View.ColorPanel.gradientMenu();
        jLabel1 = new javax.swing.JLabel();
        residentManagementButton = new javax.swing.JButton();
        complaintsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        parkingManagementButton = new javax.swing.JButton();
        accountsButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        otherButton = new javax.swing.JButton();
        serviceFacilityButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        residentPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Application");

        residentManagementButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        residentManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        residentManagementButton.setText("Resident Management");
        residentManagementButton.setContentAreaFilled(false);
        residentManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                residentManagementButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                residentManagementButtonMouseExited(evt);
            }
        });
        residentManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentManagementButtonActionPerformed(evt);
            }
        });

        complaintsButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        complaintsButton.setForeground(new java.awt.Color(255, 255, 255));
        complaintsButton.setText("Complaints");
        complaintsButton.setContentAreaFilled(false);
        complaintsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                complaintsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                complaintsButtonMouseExited(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        parkingManagementButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        parkingManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        parkingManagementButton.setText("Parking Management");
        parkingManagementButton.setContentAreaFilled(false);
        parkingManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                parkingManagementButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                parkingManagementButtonMouseExited(evt);
            }
        });

        accountsButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        accountsButton.setForeground(new java.awt.Color(255, 255, 255));
        accountsButton.setText("Accounts");
        accountsButton.setContentAreaFilled(false);
        accountsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountsButtonMouseExited(evt);
            }
        });

        profileButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.setContentAreaFilled(false);
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileButtonMouseExited(evt);
            }
        });

        otherButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        otherButton.setForeground(new java.awt.Color(255, 255, 255));
        otherButton.setText("Other");
        otherButton.setContentAreaFilled(false);
        otherButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otherButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otherButtonMouseExited(evt);
            }
        });

        serviceFacilityButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        serviceFacilityButton.setForeground(new java.awt.Color(255, 255, 255));
        serviceFacilityButton.setText("Services & Facility");
        serviceFacilityButton.setContentAreaFilled(false);
        serviceFacilityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serviceFacilityButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serviceFacilityButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accountsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(complaintsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parkingManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(residentManagementButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(otherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(serviceFacilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(residentManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parkingManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complaintsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceFacilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("day la trang chu cua user");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        contentPanel.add(homePanel, "home");

        residentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("day la cu dan");

        javax.swing.GroupLayout residentPanelLayout = new javax.swing.GroupLayout(residentPanel);
        residentPanel.setLayout(residentPanelLayout);
        residentPanelLayout.setHorizontalGroup(
            residentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(residentPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        residentPanelLayout.setVerticalGroup(
            residentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(residentPanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        contentPanel.add(residentPanel, "resident");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        showPanel("home");
    }//GEN-LAST:event_homeButtonActionPerformed

    private void residentManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentManagementButtonActionPerformed
        // TODO add your handling code here:
        showPanel("resident");
    }//GEN-LAST:event_residentManagementButtonActionPerformed

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // TODO add your handling code here:
        homeButton.setBackground(Color.WHITE);
        homeButton.setForeground(new Color(14, 90, 147));
        homeButton.setContentAreaFilled(true);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // TODO add your handling code here:
        homeButton.setForeground(Color.WHITE);
        homeButton.setContentAreaFilled(false);
    }//GEN-LAST:event_homeButtonMouseExited

    private void residentManagementButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_residentManagementButtonMouseEntered
        // TODO add your handling code here:
        residentManagementButton.setBackground(Color.WHITE);
        residentManagementButton.setForeground(new Color(14, 90, 147));
        residentManagementButton.setContentAreaFilled(true);
    }//GEN-LAST:event_residentManagementButtonMouseEntered

    private void residentManagementButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_residentManagementButtonMouseExited
        // TODO add your handling code here:
        residentManagementButton.setForeground(Color.WHITE);
        residentManagementButton.setContentAreaFilled(false);
    }//GEN-LAST:event_residentManagementButtonMouseExited

    private void parkingManagementButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parkingManagementButtonMouseExited
        // TODO add your handling code here:
        parkingManagementButton.setForeground(Color.WHITE);
        parkingManagementButton.setContentAreaFilled(false);
    }//GEN-LAST:event_parkingManagementButtonMouseExited

    private void parkingManagementButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parkingManagementButtonMouseEntered
        // TODO add your handling code here:
        parkingManagementButton.setBackground(Color.WHITE);
        parkingManagementButton.setForeground(new Color(14, 90, 147));
        parkingManagementButton.setContentAreaFilled(true);
    }//GEN-LAST:event_parkingManagementButtonMouseEntered

    private void complaintsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintsButtonMouseEntered
        // TODO add your handling code here:
        complaintsButton.setBackground(Color.WHITE);
        complaintsButton.setForeground(new Color(14, 90, 147));
        complaintsButton.setContentAreaFilled(true);
    }//GEN-LAST:event_complaintsButtonMouseEntered

    private void complaintsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintsButtonMouseExited
        // TODO add your handling code here:
        complaintsButton.setForeground(Color.WHITE);
        complaintsButton.setContentAreaFilled(false);
    }//GEN-LAST:event_complaintsButtonMouseExited

    private void serviceFacilityButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceFacilityButtonMouseExited
        // TODO add your handling code here:
        serviceFacilityButton.setForeground(Color.WHITE);
        serviceFacilityButton.setContentAreaFilled(false);
    }//GEN-LAST:event_serviceFacilityButtonMouseExited

    private void serviceFacilityButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceFacilityButtonMouseEntered
        // TODO add your handling code here:
        serviceFacilityButton.setBackground(Color.WHITE);
        serviceFacilityButton.setForeground(new Color(14, 90, 147));
        serviceFacilityButton.setContentAreaFilled(true);
    }//GEN-LAST:event_serviceFacilityButtonMouseEntered

    private void accountsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsButtonMouseEntered
        // TODO add your handling code here:
        accountsButton.setBackground(Color.WHITE);
        accountsButton.setForeground(new Color(14, 90, 147));
        accountsButton.setContentAreaFilled(true);
    }//GEN-LAST:event_accountsButtonMouseEntered

    private void accountsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsButtonMouseExited
        // TODO add your handling code here:
        accountsButton.setForeground(Color.WHITE);
        accountsButton.setContentAreaFilled(false);
    }//GEN-LAST:event_accountsButtonMouseExited

    private void profileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseEntered
        // TODO add your handling code here:
        profileButton.setBackground(Color.WHITE);
        profileButton.setForeground(new Color(14, 90, 147));
        profileButton.setContentAreaFilled(true);
    }//GEN-LAST:event_profileButtonMouseEntered

    private void profileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseExited
        // TODO add your handling code here:
        profileButton.setForeground(Color.WHITE);
        profileButton.setContentAreaFilled(false);
    }//GEN-LAST:event_profileButtonMouseExited

    private void otherButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherButtonMouseEntered
        // TODO add your handling code here:
        otherButton.setBackground(Color.WHITE);
        otherButton.setForeground(new Color(14, 90, 147));
        otherButton.setContentAreaFilled(true);
    }//GEN-LAST:event_otherButtonMouseEntered

    private void otherButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherButtonMouseExited
        // TODO add your handling code here:
        otherButton.setForeground(Color.WHITE);
        otherButton.setContentAreaFilled(false);
    }//GEN-LAST:event_otherButtonMouseExited
    
    private void showPanel(String name) {
        CardLayout cl = (CardLayout) contentPanel.getLayout();
        cl.show(contentPanel, name);
    }
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
            java.util.logging.Logger.getLogger(HomeUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountsButton;
    private javax.swing.JButton complaintsButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private View.ColorPanel.gradientMenu menuPanel;
    private javax.swing.JButton otherButton;
    private javax.swing.JButton parkingManagementButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton residentManagementButton;
    private javax.swing.JPanel residentPanel;
    private javax.swing.JButton serviceFacilityButton;
    // End of variables declaration//GEN-END:variables
}
