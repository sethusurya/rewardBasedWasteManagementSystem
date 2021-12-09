/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.WRU;

import Business.Bid.Bid;
import Business.Bid.BidDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import Business.WRU.WRU_Company;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class Wru_ManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form Wru_ManagerOnGoingBids
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    WRU_Company company;
    public Wru_ManagerPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, WRU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        txtCompany.setEnabled(false);
        populateData();
        populateBids(ecosystem.getBidDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateBid = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOngoingBids = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCompletedBids = new javax.swing.JTable();
        title1 = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnCreateBid.setText("Create New Bid");
        btnCreateBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateBidActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CURRENT BIDS");

        tblOngoingBids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bid Id", "Order Id", "Waste Type", "Quanity", "Bid Cost ($)", "TimeStamp"
            }
        ));
        jScrollPane1.setViewportView(tblOngoingBids);

        tblCompletedBids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bid Id", "Order Id", "Waste Type", "Quantity (lbs)", "Bid Cost ($)", "Bid Status"
            }
        ));
        jScrollPane2.setViewportView(tblCompletedBids);

        title1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("BID HISTORY");

        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCompany.setText("Company Name : ");

        txtCompany.setEditable(false);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateBid)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                                .addComponent(title1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateBid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addGap(65, 65, 65)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBidActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("createNewBid", new Wru_CreateNewBid(userProcessContainer,ecosystem,account,company));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateBidActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateData();
        populateBids(ecosystem.getBidDirectory());
    }//GEN-LAST:event_formComponentShown

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblOngoingBids.getSelectedRow();
        if (selectedRowIndex >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblOngoingBids.getModel();
            Bid selectedBid = (Bid) model.getValueAt(selectedRowIndex, 0);
            if (selectedBid.getBidStatus().equals("pending")) {
                int input = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (input == 0) {
                    ecosystem.getBidDirectory().removeBidById(selectedBid.getId()); // removes the bid from bid directory;
                    populateBids(ecosystem.getBidDirectory()); // refresh   
                }
            } else {
                JOptionPane.showMessageDialog(this, "Decision has already been made on this bid, cannot be deleted!!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a bid to delete");
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateBid;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JTable tblCompletedBids;
    private javax.swing.JTable tblOngoingBids;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField txtCompany;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        txtCompany.setText(company.getName());
    }

    private void populateBids(BidDirectory bidDirectory) {
        DefaultTableModel model1 = (DefaultTableModel) tblOngoingBids.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblCompletedBids.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        
        for(Bid b: bidDirectory.getBidList()){
            if(b.getBidCompanyId() == company.getId() && b.getBidUserName().equals(account.getUsername())) {
                if (b.getBidStatus().equals("pending")) {
                    Object[] row1 = new Object[6];
                    row1[0] = b;
                    row1[1] = b.getOrderId();
                    row1[2] = "N/A";
                    row1[3] = "N/A";
                    Order o = ecosystem.getOrderDirectory().getOrderById(b.getOrderId());
                    if(o != null) {
                        row1[2] = o.getWasteType();
                        row1[3] = o.getQuantity();
                    }
                    row1[4] = b.getBidValue();
                    row1[5] = b.getBidTimeStamp();

                    model1.addRow(row1);    
                } else {
                    Object[] row1 = new Object[6];
                    row1[0] = b;
                    row1[1] = b.getOrderId();
                    row1[2] = "N/A";
                    row1[3] = "N/A";
                    Order o = ecosystem.getOrderDirectory().getOrderById(b.getOrderId());
                    if(o != null) {
                        row1[2] = o.getWasteType();
                        row1[3] = o.getQuantity();
                    }
                    row1[4] = b.getBidValue();
                    row1[5] = b.getBidStatus();

                    model2.addRow(row1); 
                }
            }
        }

    }
}
