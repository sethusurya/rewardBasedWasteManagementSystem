/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import userinterface.WRU.Wru_AdminPanel;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class WRU_Admin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new Wru_AdminPanel(userProcessContainer, business, account);
    }
    
}
