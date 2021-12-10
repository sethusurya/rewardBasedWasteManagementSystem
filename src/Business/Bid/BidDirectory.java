/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Bid;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class BidDirectory {
    private ArrayList<Bid> bidDirectory;

    public BidDirectory() {
        bidDirectory = new ArrayList();
    }
    
    public ArrayList<Bid> getBidList(){
        return bidDirectory;
    }
    
    public ArrayList<Bid> createNewBid(Bid newBid){
        int lastId = 0;
        if (bidDirectory.size() > 0) {
            lastId = bidDirectory.get(bidDirectory.size() - 1).getId();
        }
        int currentId = lastId + 1;
        newBid.setId(currentId);
        bidDirectory.add(newBid);
        return bidDirectory;
    }
    
    public ArrayList<Bid> removeBidById(int selectedId) {
        Bid selectedBid = null;
        for (Bid b: bidDirectory){
            if (b.getId() == selectedId) {
                selectedBid = b;
                break;
            }
        }
        if (selectedBid != null) bidDirectory.remove(selectedBid);
        return bidDirectory;
    }
    
    public Bid getBidById(int selectedId) {
        Bid selectedBid = null;
        for (Bid b: bidDirectory){
            if (b.getId() == selectedId) {
                selectedBid = b;
                break;
            }
        }
        return selectedBid;
    }
    
    public Boolean checkIfBidisPlacedByCompany(int orderId, int companyId) {
        Boolean placed = false;
        for(Bid b: bidDirectory){
            if(b.getBidCompanyId() == companyId && b.getOrderId() == orderId){
                placed = true;
                break;
            }
        }
        return placed;
    }
}
