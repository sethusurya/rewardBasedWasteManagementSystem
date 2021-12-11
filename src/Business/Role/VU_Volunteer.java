/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.VU.VU_Company;
import javax.swing.JPanel;
import userinterface.VolunteerOrganization.WasteReportingVolunteerJpanel;

/**
 *
 * @author sethu
 */
public class VU_Volunteer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        VU_Company selectedCompany = null;
        String username = account.getUsername();
        for(VU_Company c: business.getVUCompanyDirectory().getCompanies()) {
            for(String s: c.getEmployeesList()){
                if (s.equals(username)) {
                    selectedCompany = c;
                    break;
                }
            }
        };
        if (selectedCompany != null) {
            return new WasteReportingVolunteerJpanel(userProcessContainer,business,account,selectedCompany);
        }
        return null;
    }
    
}
