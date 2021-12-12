/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Redemption;

import java.util.ArrayList;

/**
 *
 * @author saket
 */
public class RedemptionDirectory {
    private ArrayList<Redemption> redemptionDirectory;

    public RedemptionDirectory() {
        redemptionDirectory = new ArrayList();
    }

    public ArrayList<Redemption> getRedemptionList() {
        return redemptionDirectory;
    }

    public void setRedemptionList(ArrayList<Redemption> redemptionDirectory) {
        this.redemptionDirectory = redemptionDirectory;
    }
    
    public ArrayList<Redemption> createRedemption(Redemption myRedemption){
        int lastId = 0;
        if (redemptionDirectory.size() > 0) {
            lastId = redemptionDirectory.get(redemptionDirectory.size() - 1).getId();
        }
        int currentId = lastId + 1;
        myRedemption.setId(currentId);
        redemptionDirectory.add(myRedemption);
        return redemptionDirectory;
    }
    
}

