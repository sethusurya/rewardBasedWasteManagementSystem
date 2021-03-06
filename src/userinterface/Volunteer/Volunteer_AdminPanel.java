/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Volunteer;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.VU.VU_Company;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import userinterface.VolunteerOrganization.AdminAuctionPanel;
import userinterface.VolunteerOrganization.AdminWasteReportingPanel;
import userinterface.VolunteerOrganization.ManageVolunteersJpanel;

/**
 *
 * @author sethu
 */
public class Volunteer_AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form Volunteer_AdminPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    VU_Company company;
    public Volunteer_AdminPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, VU_Company company) {
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

        wsu_adminJpanel = new javax.swing.JLabel();
        btnVolunteers = new javax.swing.JButton();
        btnTasks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCompanyname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wsu_adminJpanel.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        wsu_adminJpanel.setForeground(new java.awt.Color(4, 34, 188));
        wsu_adminJpanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wsu_adminJpanel.setText("VOLUNTEER ADMIN PANEL");
        add(wsu_adminJpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 350, 40));

        btnVolunteers.setBackground(new java.awt.Color(4, 34, 138));
        btnVolunteers.setForeground(new java.awt.Color(255, 255, 255));
        btnVolunteers.setText("MANAGE VOLUNTEERS");
        btnVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolunteersActionPerformed(evt);
            }
        });
        add(btnVolunteers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 208, 34));

        btnTasks.setBackground(new java.awt.Color(4, 34, 138));
        btnTasks.setForeground(new java.awt.Color(255, 255, 255));
        btnTasks.setText("MANAGE TASKS");
        btnTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTasksActionPerformed(evt);
            }
        });
        add(btnTasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 208, 35));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ORGANIZATION : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        lblCompanyname.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblCompanyname.setText("MY COMPANY");
        add(lblCompanyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Welcome,");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 68, 25));

        lblUsername.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblUsername.setText("username");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 134, 25));

        jButton1.setBackground(new java.awt.Color(4, 34, 138));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REPORT WASTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 208, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/volunnn.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 790, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTasksActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("myTaskList", new AdminAuctionPanel(userProcessContainer,ecosystem,account,company));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTasksActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("adminWasteReporting", new AdminWasteReportingPanel(userProcessContainer,ecosystem,account,company));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVolunteersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolunteersActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("manageVolunteers", new ManageVolunteersJpanel(userProcessContainer,ecosystem,company));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVolunteersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTasks;
    private javax.swing.JButton btnVolunteers;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCompanyname;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel wsu_adminJpanel;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        lblUsername.setText(account.getUsername());
        lblCompanyname.setText(company.getName());
    }
}
