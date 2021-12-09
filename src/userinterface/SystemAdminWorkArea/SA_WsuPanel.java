/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Role.Role;
import Business.Role.WSU_Admin;
import Business.UserAccount.UserAccount;
import Business.WSU.WSU_Company;
import Business.WSU.WSU_CompanyDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */

public class SA_WsuPanel extends javax.swing.JPanel {

    /**
     * Creates new form SA_WsuPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SA_WsuPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateTable(ecosystem.getWSUCompanyDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City : ");

        lblZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblZip.setText("Zip : ");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("WASTE SEGREGATING UNITS");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Company Name : ");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStreetAddress.setText("Street Address : ");

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

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Admin UserName : ");

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Admin Password : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblZip, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSave)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnDelete)
                                .addComponent(btnEdit)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnEdit, btnSave});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(7, 7, 7)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(66, 66, 66)
                        .addComponent(btnDelete)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSave)
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnEdit, btnSave});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtUsername});

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
        
        Role role = new WSU_Admin();
        WSU_Company newCompany = new WSU_Company();
        newCompany.setName(companyName);
        newCompany.setStreet(street);
        newCompany.setCity(city);
        newCompany.setZip(zip);
        newCompany.setAdminUserName(username);
        newCompany.setEmployeesList(new ArrayList<String>());
        if (EditFlag) {
            // update the account password
            UserAccount ua = ecosystem.getUserAccountDirectory().getUserAccountByUserName(username);
            if(ua != null) ua.setPassword(password); // update userAccountPassword
            
            //update the company
            WSU_Company c = ecosystem.getWSUCompanyDirectory().findCompanyByAdminUserName(username);
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
               ecosystem.getWSUCompanyDirectory().addCompany(newCompany); // company created
               clearInputs();
               refreshData(); 
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
            WSU_Company selectedRowData = (WSU_Company) model.getValueAt(selectedIndex, 0);
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
                WSU_Company selectedRowData = (WSU_Company) model.getValueAt(selectedIndex, 0);
                String AdminUsername = selectedRowData.getAdminUserName();
                UserAccount adminAccount = ecosystem.getUserAccountDirectory().getUserAccountByUserName(AdminUsername);
                if (adminAccount != null) ecosystem.getUserAccountDirectory().getUserAccountList().remove(adminAccount); // deleting admin account
                for (String s: selectedRowData.getEmployeesList()) {
                    UserAccount ua = ecosystem.getUserAccountDirectory().getUserAccountByUserName(s);
                    if (ua != null) ecosystem.getUserAccountDirectory().getUserAccountList().remove(ua); // deleting employee account
                }
                ecosystem.getWSUCompanyDirectory().getCompanies().remove(selectedRowData); // deleting company
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

    private void populateTable(WSU_CompanyDirectory selectedCompanyDirectory) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        for(WSU_Company p:selectedCompanyDirectory.getCompanies()) {
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
    }

    private void refreshData() {
        populateTable(ecosystem.getWSUCompanyDirectory());
    }
}
