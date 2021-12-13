/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Role.Role;
import Business.Role.RU_Admin;
import Business.UserAccount.UserAccount;
import Business.RU.RU_Company;
import Business.RU.RU_CompanyDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class SA_RuPanel extends javax.swing.JPanel {

    /**
     * Creates new form SA_VolunteerPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SA_RuPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateTable(ecosystem.getRUCompanyDirectory());
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
        btnBack = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("REWARDS UNIT PANEL");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 480, 40));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblCity.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City : ");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 98, 22));

        txtZip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 163, 38));

        lblStreetAddress.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStreetAddress.setText("Street Address : ");
        add(lblStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 98, 22));

        lblZip.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblZip.setText("Zip : ");
        add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 98, 22));

        txtStreet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 163, 38));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 100, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "City", "Zip", "admin"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 105, 660, 141));

        lblName.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Company Name : ");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 120, 22));

        lblUsername.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Admin UserName : ");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, 22));

        lblPassword.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Admin Password : ");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 120, 22));

        txtCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 163, 38));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 163, 38));

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 163, 38));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 84, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 163, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/rewards.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Boolean EditFlag = !txtUsername.isEnabled();
        
        String companyName = txtName.getText();
        String street = txtStreet.getText();
        String city = txtCity.getText();
        Long zip = Long.parseLong(txtZip.getText());
        String username = txtUsername.getText();
        char[] passwordArr = txtPassword.getPassword();
        String password = new String(passwordArr);
        
        Role role = new RU_Admin();
        RU_Company newCompany = new RU_Company();
        newCompany.setName(companyName);
        newCompany.setStreet(street);
        newCompany.setCity(city);
        newCompany.setZip(zip);
        newCompany.setAdminUserName(username);
        if (EditFlag) {
            // update the account password
            UserAccount ua = ecosystem.getUserAccountDirectory().getUserAccountByUserName(username);
            if(ua != null) ua.setPassword(password); // update userAccountPassword
            
            //update the company
            RU_Company c = ecosystem.getRUCompanyDirectory().findCompanyByAdminUserName(username);
            if (c != null) {
                c.setName(companyName);
                c.setCity(city);
                c.setStreet(street);
                c.setZip(zip);
            }
            
            clearInputs();
            refreshData();
        } else {
          // Create userAccount in userDirectory
          if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
              ecosystem.getUserAccountDirectory().createUserAccount(username, password, null, role); // useraccount created
              // Create WRU_Company in WRU_CompanyDirectory
              ecosystem.getRUCompanyDirectory().addCompany(newCompany); // company created
              clearInputs();
              refreshData();
              JOptionPane.showMessageDialog(this, "Created Successfully");
          } else {
              JOptionPane.showMessageDialog(this, "Username already exists");
              return;
          }  
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedIndex = table.getSelectedRow();
        if (selectedIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            RU_Company selectedRowData = (RU_Company) model.getValueAt(selectedIndex, 0);
            String AdminUsername = selectedRowData.getAdminUserName();
            UserAccount adminAccount = ecosystem.getUserAccountDirectory().getUserAccountByUserName(AdminUsername);
            if (adminAccount != null) { // admin account exists
                txtName.setText(selectedRowData.getName());
                txtStreet.setText(selectedRowData.getStreet());
                txtCity.setText(selectedRowData.getCity());
                txtZip.setText(String.valueOf(selectedRowData.getZip()));
                txtUsername.setText(adminAccount.getUsername());
                txtPassword.setText(adminAccount.getPassword());
                
                txtUsername.setEnabled(false); // if username is not enabled then proceed with edit action else go with save
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a row to modify!!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = table.getSelectedRow();
        if (selectedIndex >= 0) {
            int input = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (input == 0) {
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                RU_Company selectedRowData = (RU_Company) model.getValueAt(selectedIndex, 0);
                String AdminUsername = selectedRowData.getAdminUserName();
                UserAccount adminAccount = ecosystem.getUserAccountDirectory().getUserAccountByUserName(AdminUsername);
                if (adminAccount != null) ecosystem.getUserAccountDirectory().getUserAccountList().remove(adminAccount); // deleting admin account
//                for (String s: selectedRowData.getEmployeesList()) {
//                    UserAccount ua = ecosystem.getUserAccountDirectory().getUserAccountByUserName(s);
//                    if (ua != null) ecosystem.getUserAccountDirectory().getUserAccountList().remove(ua); // deleting employee account
//                }
                ecosystem.getRUCompanyDirectory().getCompanies().remove(selectedRowData); // deleting company
                JOptionPane.showMessageDialog(this, "Delete Success");
                clearInputs();
                refreshData(); 
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a row to delete!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private void populateTable(RU_CompanyDirectory selectedCompanyDirectory) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        for(RU_Company p:selectedCompanyDirectory.getCompanies()) {
           Object[] row = new Object[5];
           row[0] = p;
           row[1] = p.getStreet();
           row[2] = p.getCity();
           row[3] = p.getZip();
           row[4] = p.getAdminUserName();
           
           model.addRow(row);
        }
    }
    
    private void clearInputs() {
        txtName.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtZip.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.setEnabled(true);
    }

    private void refreshData() {
        populateTable(ecosystem.getRUCompanyDirectory());
    }
}
