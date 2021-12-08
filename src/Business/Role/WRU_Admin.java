/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WRU.WRU_Company;
import Business.WRU.WRU_CompanyDirectory;
import userinterface.WRU.Wru_AdminPanel;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class WRU_Admin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        WRU_Company selectedCompany = null;
        String username = account.getUsername();
        for(WRU_Company c: business.getWRUCompanyDirectory().getCompanies()) {
          if(c.getAdminUserName().equals(account.getUsername())) {
              selectedCompany = c;
              break;
          }
        };
        if (selectedCompany != null) {
                return new Wru_AdminPanel(userProcessContainer, business, account, selectedCompany);
        } 
        return null;
    }
    
}
