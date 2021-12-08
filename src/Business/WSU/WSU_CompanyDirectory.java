/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WSU;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class WSU_CompanyDirectory {
    private ArrayList<WSU_Company> wsuCompanyList;

    public WSU_CompanyDirectory() {
        wsuCompanyList = new ArrayList();
    }
    
    public ArrayList<WSU_Company> getCompanies (){
        return wsuCompanyList;
    }
    
    public ArrayList<WSU_Company> addCompany(WSU_Company newCompany){
        wsuCompanyList.add(newCompany);
        return wsuCompanyList;
    }
    
    public ArrayList<WSU_Company> removeCompany(WSU_Company newCompany){
        wsuCompanyList.remove(newCompany);
        return wsuCompanyList;
    }
}
