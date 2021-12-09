/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.Date;

/**
 *
 * @author sethu
 */
public class Order {
    private int id; // should be unique and non modifiable
    private String wasteType;
    private double quantity;
    private double buyingCost;
    private String reportingUsername;
    private Date reportingTimeStamp;
    private int reportingCompanyId; // id of the company, belongs to WSU_CompanyDirectory
    private String status; // maintains status of the order
    private Boolean isReportedByVolunteer; // default false (make it true when a volunteer reports)
    private String buyingUsername;
    private int buyingCompanyId; // id of the company, belongs to WRU_CompanyDirectory
    private Date buyingTimeStamp; // bid accepted time
    private int acceptedBidId; // accepted bid's id for this order
    private Date deliveredTimeStamp; // driver will set this after delivering
    private String driverUsername; // after driver is assigned
    private double deliveryCost; //usd to deliver, generally given when a driver is assigned
    
    public Order() {
        isReportedByVolunteer = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReportingUsername() {
        return reportingUsername;
    }

    public void setReportingUsername(String reportingUsername) {
        this.reportingUsername = reportingUsername;
    }

    public Date getReportingTimeStamp() {
        return reportingTimeStamp;
    }

    public void setReportingTimeStamp(Date reportingTimeStamp) {
        this.reportingTimeStamp = reportingTimeStamp;
    }

    public int getReportingCompanyId() {
        return reportingCompanyId;
    }

    public void setReportingCompanyId(int reportingCompanyId) {
        this.reportingCompanyId = reportingCompanyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsReportedByVolunteer() {
        return isReportedByVolunteer;
    }

    public void setIsReportedByVolunteer(Boolean isReportedByVolunteer) {
        this.isReportedByVolunteer = isReportedByVolunteer;
    }

    public String getBuyingUsername() {
        return buyingUsername;
    }

    public void setBuyingUsername(String buyingUsername) {
        this.buyingUsername = buyingUsername;
    }

    public int getBuyingCompanyId() {
        return buyingCompanyId;
    }

    public void setBuyingCompanyId(int buyingCompanyId) {
        this.buyingCompanyId = buyingCompanyId;
    }

    public Date getBuyingTimeStamp() {
        return buyingTimeStamp;
    }

    public void setBuyingTimeStamp(Date buyingTimeStamp) {
        this.buyingTimeStamp = buyingTimeStamp;
    }

    public Date getDeliveredTimeStamp() {
        return deliveredTimeStamp;
    }

    public void setDeliveredTimeStamp(Date deliveredTimeStamp) {
        this.deliveredTimeStamp = deliveredTimeStamp;
    }

    public String getDriverUsername() {
        return driverUsername;
    }

    public void setDriverUsername(String driverUsername) {
        this.driverUsername = driverUsername;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getAcceptedBidId() {
        return acceptedBidId;
    }

    public void setAcceptedBidId(int acceptedBidId) {
        this.acceptedBidId = acceptedBidId;
    }

    public double getBuyingCost() {
        return buyingCost;
    }

    public void setBuyingCost(double buyingCost) {
        this.buyingCost = buyingCost;
    }
    
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
