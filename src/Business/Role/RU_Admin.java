/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.RU.RU_Company;
import javax.swing.JPanel;
import userinterface.RU.RU_AdminPanel;

/**
 *
 * @author sethu
 */
public class RU_Admin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        RU_Company selectedCompany = null;
        String username = account.getUsername();
        for(RU_Company c: business.getRUCompanyDirectory().getCompanies()) {
          if(c.getAdminUserName().equals(account.getUsername())) {
              selectedCompany = c;
              break;
          }
        };
        if (selectedCompany != null) {
                return new RU_AdminPanel(userProcessContainer, business, account, selectedCompany);
        } 
        return null;
    }
    
}
