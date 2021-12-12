/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.LU;

import Business.EcoSystem;
import Business.LU.LU_Company;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.UserAccount.UserAccount;
import Business.VU.VU_Company;
import Business.WRU.WRU_Company;
import Business.WSU.WSU_Company;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class Lu_CreateTrip extends javax.swing.JPanel {

    /**
     * Creates new form Lu_CreateTrip
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    LU_Company company;
    public Lu_CreateTrip(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, LU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        refreshData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        lblDriver = new javax.swing.JLabel();
        cmbDriver = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CREATE TRIP & ASSIGN DRIVER");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Waste Type", "Quantity", "From", "To"
            }
        ));
        jScrollPane1.setViewportView(table);

        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCost.setText("Cost ($) : ");

        lblDriver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver.setText("Driver : ");

        cmbDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDriver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnSubmit)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (txtCost.equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide cost for the trip to submit!");
            return;
        }
        if (cmbDriver.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please add drivers to create trips and assign drivers!");
            return;
        }
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Order selectedRow = (Order) model.getValueAt(selectedRowIndex, 0);
            // modify order status
            Order myOrder = ecosystem.getOrderDirectory().getOrderById(selectedRow.getId());
            myOrder.setStatus("driver assigned");
            myOrder.setDriverUsername(cmbDriver.getSelectedItem().toString());
            myOrder.setDeliveringCompanyId(company.getId());
            myOrder.setDeliveryCost(Double.parseDouble(txtCost.getText()));
            refreshData();
        } else {
            JOptionPane.showMessageDialog(this, "Select an Order from the table to create a trip");
            return;
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbDriver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCost;
    // End of variables declaration//GEN-END:variables

    private void populateMenu(LU_Company selectedCompany) {
        ArrayList<String> driverList = new ArrayList<String>();
        for(String s: selectedCompany.getEmployeesList()){
            driverList.add(s);
        }
        String[] myDriverList = driverList.toArray(new String[0]);
        cmbDriver.setModel(new javax.swing.DefaultComboBoxModel<>(myDriverList));
    }

    private void populateTable(OrderDirectory orderDirectory) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Order o: orderDirectory.getOrderList()){
            if(o.getStatus().equals("requested logistics")) {
                Object[] row = new Object[5];
                row[0] = o;
                row[1] = o.getWasteType();
                row[2] = o.getQuantity();
                row[3] = "N/A";
                row[4] = "N/A";
                if (o.getIsReportedByVolunteer()) {
                    VU_Company fromCompany = ecosystem.getVUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                    if (fromCompany != null) row[3] = fromCompany.getName();
                } else {
                    WSU_Company fromCompany = ecosystem.getWSUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                    if (fromCompany != null) row[3] = fromCompany.getName();  
                }
                WRU_Company toCompany = ecosystem.getWRUCompanyDirectory().findCompanyById(o.getBuyingCompanyId());
                if (toCompany != null) row[4] = toCompany.getName();
                
                model.addRow(row);
            }
        }
    }

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }

    private void refreshData() {
        clearInputs();
        populateMenu(company);
        populateTable(ecosystem.getOrderDirectory());
    }

    private void clearInputs() {
        txtCost.setText("");
        cmbDriver.setSelectedIndex(0);
    }
}
