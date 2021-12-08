/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WRU.WRU_Company;
import userinterface.WRU.Wru_ManagerPanel;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class WRU_Employee extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        WRU_Company selectedCompany = null;
        String username = account.getUsername();
        for(WRU_Company c: business.getWRUCompanyDirectory().getCompanies()) {
            for(String s: c.getEmployeesList()){
                if (s.equals(username)) {
                    selectedCompany = c;
                    break;
                }
            }
        };
        if (selectedCompany != null) {
            return new Wru_ManagerPanel(userProcessContainer,business,account,selectedCompany);
        }
        return null;
    }
    
}
