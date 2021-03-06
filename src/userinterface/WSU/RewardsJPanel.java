/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.WSU;

import Business.EcoSystem;
import Business.Redemption.Redemption;
import Business.Redemption.RedemptionDirectory;
import Business.UserAccount.UserAccount;
import Business.Voucher.Voucher;
import Business.WSU.WSU_Company;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varunvuppala
 */
public class RewardsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RewardsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    WSU_Company company;
    
    public RewardsJPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, WSU_Company company) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.company = company;
        
        populateTable(ecosystem.getRedemptionDirectory());
    }
    
    private void populateTable(RedemptionDirectory redemptionDirectory){
        
        DefaultTableModel model1 = (DefaultTableModel) tblRedemptionHistory.getModel();
        model1.setRowCount(0);
        Double voucherTotal = 0.0;
        Double cashTotal = 0.0;
        Double Total = 0.0;
        for (Redemption r: redemptionDirectory.getRedemptionList()){
            if (r.getWsu_id() == company.getId()) {
                if (r.getVoucher_type() == "Voucher"){
                    Object[] row1 = new Object[5];

                    Voucher v = ecosystem.getVoucherDirectory().getVoucherById(r.getVoucher_id());

                    row1[0] = r;
                    row1[1] = v != null ? (ecosystem.getRUCompanyDirectory().findCompanyById(v.getVoucherCompanyId())!= null ?ecosystem.getRUCompanyDirectory().findCompanyById(v.getVoucherCompanyId()) : "N/A") : "N/A";
                    row1[2] = v != null ? v.getVoucherDescription() : "N/A";
                    row1[3] = r.getRedemption_date();
                    row1[4] = r.getVoucher_value();

                    voucherTotal = voucherTotal + r.getVoucher_value();
                    model1.addRow(row1);
                }
                else{
                    Object[] row1 = new Object[5];

                    Voucher v = ecosystem.getVoucherDirectory().getVoucherById(r.getVoucher_id());

                    row1[0] = r;
                    row1[1] = "-";
                    row1[2] = "Cash";
                    row1[3] = r.getRedemption_date();
                    row1[4] = r.getVoucher_value();
                    
                    cashTotal = cashTotal + r.getVoucher_value();
                    model1.addRow(row1);
                }
            }
        }
        lblCashValue.setText(String.valueOf(cashTotal));
        lblVoucherValue.setText(String.valueOf(voucherTotal));
        lblTotalValue.setText(String.valueOf(voucherTotal + cashTotal));
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
        tblRedemptionHistory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblVoucher = new javax.swing.JLabel();
        lblCash = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblVoucherValue = new javax.swing.JLabel();
        lblCashValue = new javax.swing.JLabel();
        lblTotalValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRedemptionHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Redemption ID", "Rewards Company", "Voucher Description", "Redemption Date", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRedemptionHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 92, 650, 182));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel2.setText("Voucher History");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 70, 115, -1));

        lblVoucher.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblVoucher.setText("Voucher Value:");
        add(lblVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        lblCash.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblCash.setText("Cash:");
        add(lblCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 40, -1));

        lblTotal.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblTotal.setText("Total Earnings:");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        lblVoucherValue.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblVoucherValue.setText("jLabel6");
        add(lblVoucherValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        lblCashValue.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblCashValue.setText("jLabel6");
        add(lblCashValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        lblTotalValue.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lblTotalValue.setText("jLabel6");
        add(lblTotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel1.setText("EARNINGS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, 140, 30));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 111, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/Screen Shot 2021-12-11 at 6.21.45 PM.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 230, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/WSU_earnings.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblCashValue;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JLabel lblVoucher;
    private javax.swing.JLabel lblVoucherValue;
    private javax.swing.JTable tblRedemptionHistory;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }
}
