/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.LU.LU_Company;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LU.Lu_DriversPanel;

/**
 *
 * @author sethu
 */
public class LU_Employee extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
         LU_Company selectedCompany = null;
        String username = account.getUsername();
        for(LU_Company c: business.getLUCompanyDirectory().getCompanies()) {
            for(String s: c.getEmployeesList()){
                if (s.equals(username)) {
                    selectedCompany = c;
                    break;
                }
            }
        };
        if (selectedCompany != null) {
            return new Lu_DriversPanel(userProcessContainer,business,account,selectedCompany);
        }
        return null;
    }
    
}
