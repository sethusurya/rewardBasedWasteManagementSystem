/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.WRU;

import Business.Bid.Bid;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.UserAccount.UserAccount;
import Business.VU.VU_Company;
import Business.WRU.WRU_Company;
import Business.WSU.WSU_Company;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.WSU.employeeJpanel;

/**
 *
 * @author sethu
 */
public class Wru_CreateNewBid extends javax.swing.JPanel {

    /**
     * Creates new form Wru_NewBid
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    WRU_Company company;
    public Wru_CreateNewBid(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, WRU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        populateMenu();
        populateOrders(ecosystem.getOrderDirectory(),null, null);
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
        selCity = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        lblWaste = new javax.swing.JLabel();
        selWaste = new javax.swing.JComboBox<>();
        btnApply = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnPlaceBid = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblBidCost = new javax.swing.JLabel();
        txtBidCost = new javax.swing.JTextField();

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CREATE NEW BID");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        selCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City : ");

        lblWaste.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWaste.setText("Waste Type : ");

        selWaste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnApply.setText("Apply Filter");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnClear.setText("Clear Filter");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Type", "Quantity (LBS)", "Selling Organization", "Donation"
            }
        ));
        jScrollPane1.setViewportView(table);

        btnPlaceBid.setText("Place Bid");
        btnPlaceBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceBidActionPerformed(evt);
            }
        });

        lblBidCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBidCost.setText("BID price ($): ");

        txtBidCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBidCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selCity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWaste, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selWaste, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnClear)))
                .addGap(8, 8, 8)
                .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPlaceBid)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBidCost, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBidCost, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selCity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApply)
                            .addComponent(btnClear))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBidCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBidCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selWaste, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWaste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(290, 290, 290)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlaceBid)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBidCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBidCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBidCostActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        String city = null;
        String wasteType = null;
        if (!selCity.getSelectedItem().equals("")) city = selCity.getSelectedItem().toString();
        if (!selWaste.getSelectedItem().equals("")) wasteType = selWaste.getSelectedItem().toString();
        populateOrders(ecosystem.getOrderDirectory(), city, wasteType);
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        selCity.setSelectedIndex(0);
        selWaste.setSelectedIndex(0);
        populateOrders(ecosystem.getOrderDirectory(), null, null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPlaceBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceBidActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Order selectedRow = (Order) model.getValueAt(selectedRowIndex, 0);
            if (selectedRow.getIsReportedByVolunteer()) { // this is donation and thus can be claimed
                // handle this different
                int input = JOptionPane.showConfirmDialog(null, "VolunteerORG is dontating this waste, you will not be charged. Do you wish to proceed?", "FREE!!(0$)", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (input == 0) {
                    double bidCost = Double.parseDouble("0");
                      Bid newBid = new Bid();
                      newBid.setBidStatus("success"); // setting bid status to success
                      newBid.setBidTimeStamp(new Date());
                      newBid.setBidValue(bidCost);
                      newBid.setOrderId(selectedRow.getId());
                      newBid.setBidCompanyId(company.getId());
                      newBid.setBidUserName(account.getUsername());
                      ecosystem.getBidDirectory().createNewBid(newBid); // adding it to bid directory
                      Bid selectedBid  = null;
                      for(Bid b: ecosystem.getBidDirectory().getBidList()) {
                          if(b.getOrderId() == selectedRow.getId());
                          selectedBid = b;
                      }
                      if (selectedBid != null) {
                         // we need to update the order too
                        selectedRow.setAcceptedBidId(selectedBid.getId());
                        selectedRow.setBuyingCompanyId(selectedBid.getBidCompanyId());
                        selectedRow.setBuyingTimeStamp(new Date());
                        selectedRow.setBuyingUsername(selectedBid.getBidUserName());
                        selectedRow.setBuyingCost(selectedBid.getBidValue());
                        selectedRow.setStatus("bid accepted");                            
                      }
                      goBack();   
                }
            } else {
              if (txtBidCost.getText().equals("") || txtBidCost == null) {
                  JOptionPane.showMessageDialog(this, "Give the value for Bid");
                  return;
              } else {
                  double bidCost = Double.parseDouble(txtBidCost.getText());
                  Bid newBid = new Bid();
                  newBid.setBidStatus("pending");
                  newBid.setBidTimeStamp(new Date());
                  newBid.setBidValue(bidCost);
                  newBid.setOrderId(selectedRow.getId());
                  newBid.setBidCompanyId(company.getId());
                  newBid.setBidUserName(account.getUsername());
                  ecosystem.getBidDirectory().createNewBid(newBid); // adding it to bid directory

                  goBack();
              }  
            }
        } else {
            JOptionPane.showMessageDialog(this,"Select an order from table to place bid");
        }
    }//GEN-LAST:event_btnPlaceBidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPlaceBid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBidCost;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblWaste;
    private javax.swing.JComboBox<String> selCity;
    private javax.swing.JComboBox<String> selWaste;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtBidCost;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }

    private void populateMenu() {
        // populating city menu
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.add("");
        for(WSU_Company c: ecosystem.getWSUCompanyDirectory().getCompanies()){
            String currentCity = c.getCity();
            Boolean cityAdded = false;
            for(String s: cityList) {
                if (s.equals(currentCity)) cityAdded = true;
            }
            if (!cityAdded) cityList.add(currentCity);
        }
        String[] myCityList = cityList.toArray(new String[0]);
        selCity.setModel(new javax.swing.DefaultComboBoxModel<>(myCityList));
        // populating waste menu
        ArrayList<String> wasteList = new ArrayList<String>();
        wasteList.add("");
        for(employeeJpanel.WasteType c : employeeJpanel.WasteType.values()) {
            wasteList.add(c.toString());
        }
        String[] myWasteTypes = wasteList.toArray(new String[0]);
        selWaste.setModel(new javax.swing.DefaultComboBoxModel<>(myWasteTypes));
    }

    private void populateOrders(OrderDirectory orderDirectory, String city, String wasteType) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Order o: orderDirectory.getOrderList()){ // show only orders with status ="out for auction" orders
            if (o.getStatus().equals("out for auction") && !ecosystem.getBidDirectory().checkIfBidisPlacedByCompany(o.getId(), company.getId())) {
                if (city == null && wasteType == null) {
                    Object[] row = new Object[5];
                    row[0] = o;
                    row[1] = o.getWasteType();
                    row[2] = o.getQuantity();
                    row[3] = "N/A";
                    row[4] = o.getIsReportedByVolunteer() ? "Yes" : "No";
                    if (o.getIsReportedByVolunteer()) {
                        VU_Company c = ecosystem.getVUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c!=null) row[3] = c.getName();
                    } else {
                        WSU_Company c = ecosystem.getWSUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c != null) row[3] = c.getName();  
                    }
                    model.addRow(row);   
                } else if(city == null && wasteType != null) {
                    if(o.getWasteType().equals(wasteType)) {
                        Object[] row = new Object[5];
                        row[0] = o;
                        row[1] = o.getWasteType();
                        row[2] = o.getQuantity();
                        row[3] = "N/A";
                        row[4] = o.getIsReportedByVolunteer() ? "Yes" : "No";
                    if (o.getIsReportedByVolunteer()) {
                        VU_Company c = ecosystem.getVUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c!=null) row[3] = c.getName();
                    } else {
                        WSU_Company c = ecosystem.getWSUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c != null) row[3] = c.getName();
                    }
                        model.addRow(row);  
                    }
                } else if(city != null && wasteType == null) {
                   // get reporting org city and then filter
                   if (o.getIsReportedByVolunteer()) {
                        VU_Company c = ecosystem.getVUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c != null && c.getCity().equals(city)) {
                             Object[] row = new Object[5];
                             row[0] = o;
                             row[1] = o.getWasteType();
                             row[2] = o.getQuantity();
                             row[3] = "N/A";
                             row[4] = o.getIsReportedByVolunteer() ? "Yes" : "No";
                             if (c != null) row[3] = c.getName();

                             model.addRow(row); 
                        } 
                   } else {
                        WSU_Company c = ecosystem.getWSUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c != null && c.getCity().equals(city)) {
                             Object[] row = new Object[5];
                             row[0] = o;
                             row[1] = o.getWasteType();
                             row[2] = o.getQuantity();
                             row[3] = "N/A";
                             row[4] = o.getIsReportedByVolunteer() ? "Yes" : "No";
                             if (c != null) row[3] = c.getName();

                             model.addRow(row); 
                        }   
                   }
                } else {
                    if(o.getIsReportedByVolunteer()) {
                       VU_Company c = ecosystem.getVUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c != null && c.getCity().equals(city) && o.getWasteType().equals(wasteType)){
                            Object[] row = new Object[5];
                            row[0] = o;
                            row[1] = o.getWasteType();
                            row[2] = o.getQuantity();
                            row[3] = "N/A";
                            row[4] = o.getIsReportedByVolunteer() ? "Yes" : "No";
                            if (c != null) row[3] = c.getName();

                            model.addRow(row); 
                        } 
                    } else {
                        WSU_Company c = ecosystem.getWSUCompanyDirectory().findCompanyById(o.getReportingCompanyId());
                        if (c != null && c.getCity().equals(city) && o.getWasteType().equals(wasteType)){
                            Object[] row = new Object[5];
                            row[0] = o;
                            row[1] = o.getWasteType();
                            row[2] = o.getQuantity();
                            row[3] = "N/A";
                            row[4] = o.getIsReportedByVolunteer() ? "Yes" : "No";
                            if (c != null) row[3] = c.getName();

                            model.addRow(row); 
                        } 
                    }
                }
                
            }
        }
    }
}
