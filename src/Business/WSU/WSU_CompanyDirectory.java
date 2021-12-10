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
        int lastId = 0;
        if(wsuCompanyList.size()>0) {
           lastId = wsuCompanyList.get(wsuCompanyList.size() - 1).getId();
        }
        newCompany.setId(lastId+1);
        wsuCompanyList.add(newCompany);
        return wsuCompanyList;
    }
    
    public ArrayList<WSU_Company> removeCompany(WSU_Company newCompany){
        wsuCompanyList.remove(newCompany);
        return wsuCompanyList;
    }
    
    public WSU_Company findCompanyByAdminUserName(String username) {
        WSU_Company newCompany = null;
        for (WSU_Company c: wsuCompanyList){
            if (c.getAdminUserName().equals(username)) {
                newCompany = c;
            }
        }
        return newCompany;
    }
    
    public WSU_Company findCompanyById(int id) {
        WSU_Company newCompany = null;
        for (WSU_Company c: wsuCompanyList){
            if (c.getId() == id) {
                newCompany = c;
            }
        }
        return newCompany;
    }
}
