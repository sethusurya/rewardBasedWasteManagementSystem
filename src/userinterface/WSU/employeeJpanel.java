/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.WSU;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.UserAccount.UserAccount;
import Business.WSU.WSU_Company;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class employeeJpanel extends javax.swing.JPanel {

   public enum WasteType{
        organic,
        paper,
        recyclable,
        ewaste,
        medical,
    }

    /**
     * Creates new form employeeJpanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    WSU_Company company;
    public employeeJpanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, WSU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        populateMenu();
        populateTable(ecosystem.getOrderDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cmbTypeofWaste = new javax.swing.JComboBox<>();
        lblWaste = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Type of Waste", "Quantity", "TimeStamp", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        cmbTypeofWaste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblWaste.setText("Type of Waste:");

        lblQuantity.setText("Quantity(lbs):");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel1.setText("Employee Work Area");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(182, 182, 182)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblQuantity)
                                .addComponent(lblWaste))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbTypeofWaste, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTypeofWaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWaste))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnReport)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        if (txtQuantity.getText().length() == 0) { // empty value Check
            JOptionPane.showMessageDialog(this, "Please Give the Quantity of waste");
            return;
        }
        
        Date currentTime = new Date();
        String wasteType = cmbTypeofWaste.getSelectedItem().toString();
        Double wasteQuantity = Double.parseDouble(txtQuantity.getText());
        String status = "reported"; // only limited status are given
        
        // creating new order
        Order newOrder = new Order();
        newOrder.setStatus(status);
        newOrder.setWasteType(wasteType);
        newOrder.setQuantity(wasteQuantity);
        newOrder.setReportingTimeStamp(currentTime);
        newOrder.setReportingUsername(account.getUsername());
        newOrder.setReportingCompanyId(company.getId()); //wsu_company
        ecosystem.getOrderDirectory().createOrder(newOrder);
        refreshData();
        clearInputs();
        JOptionPane.showMessageDialog(this, "Order Created");
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Order selectedRow = (Order) model.getValueAt(selectedRowIndex, 0);
            if (!selectedRow.getStatus().equals("reported")) {
                JOptionPane.showMessageDialog(this, "Order has been already placed for auction!!");
                return;
            } else {
                int input = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (input == 0) {
                    ecosystem.getOrderDirectory().removeOrderById(selectedRow.getId()); // remove the order from echosystem
                    refreshData();
                    clearInputs();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select an order row to delete it");
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cmbTypeofWaste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblWaste;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void populateMenu() {
        ArrayList<String> wasteList = new ArrayList<String>();
        for(WasteType c : WasteType.values()) {
            wasteList.add(c.toString());
        }
        // convert arraylist to array
        String[] myWasteTypes = wasteList.toArray(new String[0]);
        // populating the menus
        cmbTypeofWaste.setModel(new javax.swing.DefaultComboBoxModel<>(myWasteTypes));
    }
    
    private void populateTable(OrderDirectory orderDirectory) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        // loopthrough orders
        
        for (Order o: orderDirectory.getOrderList()){
            if (o.getReportingCompanyId() == company.getId() && o.getReportingUsername().equals(account.getUsername())) {
                Object[] row = new Object[5];
                row[0] = o;
                row[1] = o.getWasteType();
                row[2] = o.getQuantity();
                row[3] = o.getReportingTimeStamp();
                row[4] = o.getStatus();

                model.addRow(row);   
            }
        }
    }
    
    private void clearInputs() {
        txtQuantity.setText("");
        cmbTypeofWaste.setSelectedIndex(0);
    }

    private void refreshData() {
        populateTable(ecosystem.getOrderDirectory());
    }

    
}
