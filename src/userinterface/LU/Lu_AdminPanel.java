/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.LU;

import Business.EcoSystem;
import Business.LU.LU_Company;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.RU.*;

/**
 *
 * @author saket
 */
public class Lu_AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form LU_AdminPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    LU_Company company;
    public Lu_AdminPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, LU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        btnManagers = new javax.swing.JButton();
        btnBids = new javax.swing.JButton();
        lblCompanyName = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("LOGISTICS ADMIN PANEL");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 280, 25));

        btnManagers.setBackground(new java.awt.Color(16, 50, 163));
        btnManagers.setForeground(new java.awt.Color(255, 255, 255));
        btnManagers.setText("DRIVERS");
        btnManagers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagersActionPerformed(evt);
            }
        });
        add(btnManagers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 35));

        btnBids.setBackground(new java.awt.Color(16, 50, 163));
        btnBids.setForeground(new java.awt.Color(255, 255, 255));
        btnBids.setText("TRIPS");
        btnBids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBidsActionPerformed(evt);
            }
        });
        add(btnBids, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 34));

        lblCompanyName.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompanyName.setText("Company Name : ");
        add(lblCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 62, 120, 30));

        txtCompanyName.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        txtCompanyName.setText("My Company Name");
        add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/Lu__800x600.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 800, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagersActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("myDriverList", new Lu_Drivers(userProcessContainer,ecosystem,company));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagersActionPerformed

    private void btnBidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBidsActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("myTripsList", new Lu_Trips(userProcessContainer,ecosystem,account,company));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBidsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBids;
    private javax.swing.JButton btnManagers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtCompanyName;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        txtCompanyName.setText(company.getName());
    }
}
