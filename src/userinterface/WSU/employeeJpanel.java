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
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 632, 213));

        cmbTypeofWaste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbTypeofWaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 312, 163, -1));

        lblWaste.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblWaste.setText("Type of Waste:");
        add(lblWaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 316, -1, -1));

        lblQuantity.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblQuantity.setText("Quantity(lbs):");
        add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 362, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 357, 163, -1));

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 414, 97, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel1.setText("EMPLOYEE WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 230, 33));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 97, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/WSU_800x600.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
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
    private javax.swing.JLabel jLabel2;
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
            if (o.getReportingCompanyId() == company.getId() && o.getReportingUsername().equals(account.getUsername()) && !o.getIsReportedByVolunteer()) {
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
