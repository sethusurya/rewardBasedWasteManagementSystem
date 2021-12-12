/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validations;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class Functions {
    
    public static Boolean isValidNumber (String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!(c>='0' && c<='9')) {
                return false;
            }
        }
        return true;
    }
}
