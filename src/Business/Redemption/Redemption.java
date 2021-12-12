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
    private String wsu_company;
    private int wsu_id;
    private String voucher_company;
    private Date redemption_date;
    private int id;

    public Date getRedemption_date() {
        return redemption_date;
    }

    public void setRedemption_date(Date redemption_date) {
        this.redemption_date = redemption_date;
    }

    public String getWsu_company() {
        return wsu_company;
    }

    public void setWsu_company(String wsu_company) {
        this.wsu_company = wsu_company;
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

    public String getVoucher_company() {
        return voucher_company;
    }

    public void setVoucher_company(String voucher_company) {
        this.voucher_company = voucher_company;
    }
    
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
