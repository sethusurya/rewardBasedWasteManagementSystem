/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.WSU;

import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import Business.WSU.WSU_Company;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Order.OrderDirectory;
import java.awt.Color;
import java.awt.event.ItemEvent;
/**
 *
 * @author varunvuppala
 */
public class FinanceJpanel extends javax.swing.JPanel {

    /**
     * Creates new form FinanceJpanel
     */
    WSU_Company company;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;

    public FinanceJpanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account, WSU_Company company) {
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

        redeemBtnGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAccptedbids = new javax.swing.JTable();
        btnRedeem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSelectVoucher = new javax.swing.JTable();
        lblSelectVoucher = new javax.swing.JLabel();
        lblReedemableValue = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        lblSelectVoucher1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtCashValue = new javax.swing.JTextField();
        radioRedeemCash = new javax.swing.JRadioButton();
        radioRedeemVoucher = new javax.swing.JRadioButton();

        jTableAccptedbids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Orderid", "Type of Waste", "Quantity(lbs)", "Bid Price", "Bidding Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAccptedbids);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 109, 576, 182));

        btnRedeem.setText("Redeem");
        btnRedeem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemActionPerformed(evt);
            }
        });

        jTableSelectVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sample", "Sample", "100"},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Company", "Worth", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableSelectVoucher);

        lblSelectVoucher.setText("Select Voucher");
        add(lblSelectVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 334, 93, -1));

        lblReedemableValue.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        lblReedemableValue.setText("Reedemable Value:");
        add(lblReedemableValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 25, -1, -1));

        lblValue.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        lblValue.setText("jLabel3");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 25, 95, -1));

        lblSelectVoucher1.setText("Successful Bids");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtCashValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashValueActionPerformed(evt);
            }
        });

        redeemBtnGroup.add(radioRedeemCash);
        radioRedeemCash.setText("Redeem Cash");
        radioRedeemCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRedeemCashActionPerformed(evt);
            }
        });

        redeemBtnGroup.add(radioRedeemVoucher);
        radioRedeemVoucher.setText("Redeem Voucher");
        radioRedeemVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRedeemVoucherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReedemableValue)
                        .addGap(18, 18, 18)
                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelectVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioRedeemVoucher)
                                .addGap(142, 142, 142)
                                .addComponent(radioRedeemCash)
                                .addGap(18, 18, 18)
                                .addComponent(txtCashValue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(212, 212, 212))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRedeem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblSelectVoucher1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 617, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReedemableValue)
                            .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack)))
                .addGap(26, 26, 26)
                .addComponent(lblSelectVoucher1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCashValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioRedeemCash))
                    .addComponent(radioRedeemVoucher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblSelectVoucher)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRedeem)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCashValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashValueActionPerformed

    private void btnRedeemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRedeemActionPerformed

    private void radioRedeemVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRedeemVoucherActionPerformed
        // TODO add your handling code here:
        jTableSelectVoucher.setEnabled(true);
        txtCashValue.setEnabled(false);
        txtCashValue.setBackground(Color.GRAY);
        jTableSelectVoucher.setBackground(null);
    }//GEN-LAST:event_radioRedeemVoucherActionPerformed

    private void radioRedeemCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRedeemCashActionPerformed
        // TODO add your handling code here:
        txtCashValue.setEnabled(true);
        jTableSelectVoucher.setEnabled(false);
        jTableSelectVoucher.setBackground(Color.GRAY);
        txtCashValue.setBackground(null);
    }//GEN-LAST:event_radioRedeemCashActionPerformed

//    public void itemStateChanged(ItemEvent e)
//    {
//        if(e.getStateChange() == ItemEvent.SELECTED) {
//            if(e.getItem() == jboxRedeemCash) {
//                jboxRedeemVoucher.setSelected(false);
//            } else {
//                jboxRedeemCash.setSelected(false);
//            }
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRedeem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAccptedbids;
    private javax.swing.JTable jTableSelectVoucher;
    private javax.swing.JLabel lblReedemableValue;
    private javax.swing.JLabel lblSelectVoucher;
    private javax.swing.JLabel lblSelectVoucher1;
    private javax.swing.JLabel lblValue;
    private javax.swing.JRadioButton radioRedeemCash;
    private javax.swing.JRadioButton radioRedeemVoucher;
    private javax.swing.ButtonGroup redeemBtnGroup;
    private javax.swing.JTextField txtCashValue;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }

    private void populateData() {
        lblValue.setText("$ " + String.valueOf(company.getMyrewards()));
    }
    
    private void populateTables(OrderDirectory orderDirectory){
        DefaultTableModel model1 = (DefaultTableModel) jTableAccptedbids.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTableSelectVoucher.getModel();
        model1.setRowCount(0);
//        model2.setRowCount(0);
        
        for (Order o: orderDirectory.getOrderList()){
            if (o.getReportingCompanyId() == company.getId()) {
                if(!((o.getStatus().equals("reported")) | (o.getStatus().equals("out for auction")))) {
                    Object[] row1 = new Object[5];
                    row1[0] = o;
                    row1[1] = o.getWasteType();
                    row1[2] = o.getQuantity();
                    row1[3] = o.getBuyingCost();
                    row1[4] = ecosystem.getWRUCompanyDirectory().findCompanyById(o.getBuyingCompanyId());

                    model1.addRow(row1);
                }
            }
        }
    }
    
    private void refreshData() {
        populateData();
        populateTables(ecosystem.getOrderDirectory());
    }
}
