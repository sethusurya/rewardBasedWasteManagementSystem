/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Redemption;

import java.util.*;

/**
 *
 * @author saket
 */
public class Redemption {
    private int wsu_id;
    private int voucher_id;
    private Date redemption_date;
    private String voucher_type;

    public String getVoucher_type() {
        return voucher_type;
    }

    public void setVoucher_type(String voucher_type) {
        this.voucher_type = voucher_type;
    }
    private int id;

    public int getVoucher_id() {
        return voucher_id;
    }

    public void setVoucher_id(int voucher_id) {
        this.voucher_id = voucher_id;
    }

    public Date getRedemption_date() {
        return redemption_date;
    }

    public void setRedemption_date(Date redemption_date) {
        this.redemption_date = redemption_date;
    }

    public int getWsu_id() {
        return wsu_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWsu_id(int wsu_id) {
        this.wsu_id = wsu_id;
    }
    
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
