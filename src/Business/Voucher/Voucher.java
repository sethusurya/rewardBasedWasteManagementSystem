/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Voucher;

/**
 *
 * @author saket
 */
public class Voucher {
    private int id;
    private int voucherCompanyId;
    private double voucherWorth;
    private String voucherDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVoucherWorth() {
        return voucherWorth;
    }

    public void setVoucherWorth(double voucherWorth) {
        this.voucherWorth = voucherWorth;
    }
    
    public int getVoucherCompanyId() {
        return voucherCompanyId;
    }

    public void setVoucherCompanyId(int voucherCompanyId) {
        this.voucherCompanyId = voucherCompanyId;
    }

    public String getVoucherDescription() {
        return voucherDescription;
    }

    public void setVoucherDescription(String voucherDescription) {
        this.voucherDescription = voucherDescription;
    }
    
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
