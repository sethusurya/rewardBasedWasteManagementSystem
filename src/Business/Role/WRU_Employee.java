/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import userinterface.WRU.Wru_ManagerPanel;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class WRU_Employee extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new Wru_ManagerPanel(userProcessContainer,business,account);
    }
    
}
