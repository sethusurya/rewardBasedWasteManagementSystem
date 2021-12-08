/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WSU.WSU_Company;
import javax.swing.JPanel;
import userinterface.WSU.Wsu_AdminPanel;

/**
 *
 * @author sethu
 */
public class WSU_Admin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        WSU_Company selectedCompany = null;
        String username = account.getUsername();
        for(WSU_Company c: business.getWSUCompanyDirectory().getCompanies()) {
          if(c.getAdminUserName().equals(account.getUsername())) {
              selectedCompany = c;
              break;
          }
        };
        if (selectedCompany != null) {
                return new Wsu_AdminPanel(userProcessContainer, business, account, selectedCompany);
        } 
        return null;
    }
    
}
