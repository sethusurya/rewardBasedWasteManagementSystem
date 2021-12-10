/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.LU.LU_Company;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LU.Lu_AdminPanel;

/**
 *
 * @author sethu
 */
public class LU_Admin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        LU_Company selectedCompany = null;
        String username = account.getUsername();
        for(LU_Company c: business.getLUCompanyDirectory().getCompanies()) {
          if(c.getAdminUserName().equals(account.getUsername())) {
              selectedCompany = c;
              break;
          }
        };
        if (selectedCompany != null) {
                return new Lu_AdminPanel(userProcessContainer, business, account, selectedCompany);
        } 
        return null;
    }
    
}
