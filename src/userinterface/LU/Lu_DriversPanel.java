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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class Lu_DriversPanel extends javax.swing.JPanel {

    /**
     * Creates new form Lu_DriversPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    LU_Company company;
    public Lu_DriversPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, LU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        populateData();
        populateTables(ecosystem.getOrderDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurrent = new javax.swing.JTable();
        btnPickup = new javax.swing.JButton();
        btnDelivered = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCompleted = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTrips = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCompanyName.setText("Company Name : ");
        add(lblCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        tblCurrent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Waste Type", "Quantity (lbs)", "From", "To", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblCurrent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 560, 175));

        btnPickup.setText("Pickup");
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });
        add(btnPickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 103, -1));

        btnDelivered.setText("Delivered");
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });
        add(btnDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        tblCompleted.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Waste Type", "Quantity", "Delivered Timestamp", "Cost ($)"
            }
        ));
        jScrollPane2.setViewportView(tblCompleted);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 560, 175));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Total Money ($): ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        lblCost.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCost.setText("usd");
        add(lblCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COMPLETED TRIPS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CURRENT TRIPS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DRIVER DASHBOARD");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 250, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Completed Trips : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        lblTrips.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblTrips.setText("N/A");
        add(lblTrips, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        txtCompanyName.setText("jLabel6");
        add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/lu.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCurrent.getSelectedRow();
        if (selectedRowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblCurrent.getModel();
            Order selectedRow = (Order) model.getValueAt(selectedRowIndex, 0);
            if (selectedRow.getStatus().equals("driver assigned")) {
                selectedRow.setStatus("picked up");
                refreshData();
            } else {
                JOptionPane.showMessageDialog(this, "Status is already picked up!!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this,"Select a trip to change status to pickup!");
            return;
        }
    }//GEN-LAST:event_btnPickupActionPerformed

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCurrent.getSelectedRow();
        if (selectedRowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblCurrent.getModel();
            Order selectedRow = (Order) model.getValueAt(selectedRowIndex, 0);
            if (selectedRow.getStatus().equals("picked up")) {
                selectedRow.setStatus("delivered");
                selectedRow.setDeliveredTimeStamp(new Date());
                refreshData();
            } else {
                JOptionPane.showMessageDialog(this, "Order has to be picked up first!!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this,"Select a trip to change status to Delivered!");
            return;
        }
    }//GEN-LAST:event_btnDeliveredActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnPickup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblTrips;
    private javax.swing.JTable tblCompleted;
    private javax.swing.JTable tblCurrent;
    private javax.swing.JLabel txtCompanyName;
    // End of variables declaration//GEN-END:variables

    private void populateTables(OrderDirectory orderDirectory) {
        DefaultTableModel model1 = (DefaultTableModel) tblCurrent.getModel();
        model1.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) tblCompleted.getModel();
        model2.setRowCount(0);
        
        for (Order o: orderDirectory.getOrderList()) {
            if (o.getDriverUsername() != null) {
             if (o.getDriverUsername().equals(account.getUsername())) {
                if (o.getStatus().equals("delivered")) {
                    Object[] row = new Object[5];
                    row[0] = o;
                    row[1] = o.getWasteType();
                    row[2] = o.getQuantity();
                    row[3] = o.getDeliveredTimeStamp();
                    row[4] = o.getDeliveryCost();
                    model2.addRow(row);
                } else {
                    Object[] row = new Object[6];
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
                    row[5] = o.getStatus();
                    model1.addRow(row);
                }
            }   
            }
        }
    }

    private void populateData() {
        double totalCost = 0;
        int totalTrips = 0;
        txtCompanyName.setText(company.getName());
        for(Order o: ecosystem.getOrderDirectory().getOrderList()) {
            if (o.getDriverUsername() != null) {
                if(o.getDriverUsername().equals(account.getUsername())) {
                if(o.getStatus().equals("delivered")) {
                    totalCost = totalCost+o.getDeliveryCost();
                    totalTrips = totalTrips + 1;
                }
            }
            }
        }
        lblCost.setText(String.valueOf(totalCost));
        lblTrips.setText(String.valueOf(totalTrips));
    }

    private void refreshData() {
        populateData();
        populateTables(ecosystem.getOrderDirectory());
    }
}
