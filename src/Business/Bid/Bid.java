/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Bid;

import java.util.Date;

/**
 *
 * @author sethu
 */
public class Bid {
    private int id; // unique identification for the bid
    private int orderId;
    private String bidStatus; // pending, success, fail
    private String bidUserName; // who placed this bid
    private String bidCompanyId; // which company he belongs to
    private double bidValue; // cost of the bid
    private Date bidTimeStamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }

    public String getBidUserName() {
        return bidUserName;
    }

    public void setBidUserName(String bidUserName) {
        this.bidUserName = bidUserName;
    }

    public String getBidCompanyId() {
        return bidCompanyId;
    }

    public void setBidCompanyId(String bidCompanyId) {
        this.bidCompanyId = bidCompanyId;
    }

    public double getBidValue() {
        return bidValue;
    }

    public void setBidValue(double bidValue) {
        this.bidValue = bidValue;
    }

    public Date getBidTimeStamp() {
        return bidTimeStamp;
    }

    public void setBidTimeStamp(Date bidTimeStamp) {
        this.bidTimeStamp = bidTimeStamp;
    }
    
    
}
