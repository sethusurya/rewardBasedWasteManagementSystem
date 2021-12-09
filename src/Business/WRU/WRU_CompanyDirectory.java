/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WRU;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class WRU_CompanyDirectory {
    private ArrayList<WRU_Company> wruCompanyList;

    public WRU_CompanyDirectory() {
        wruCompanyList = new ArrayList();
    }
    
    public ArrayList<WRU_Company> getCompanies (){
        return wruCompanyList;
    }
    
    public ArrayList<WRU_Company> addCompany(WRU_Company newCompany){
        int lastId = wruCompanyList.get(wruCompanyList.size() - 1).getId();
        newCompany.setId(lastId+1);
        wruCompanyList.add(newCompany);
        return wruCompanyList;
    }
    
    public ArrayList<WRU_Company> removeCompany(WRU_Company newCompany){
        wruCompanyList.remove(newCompany);
        return wruCompanyList;
    }
    
    public WRU_Company findCompanyByAdminUserName(String username) {
        WRU_Company newCompany = null;
        for (WRU_Company c: wruCompanyList){
            if (c.getAdminUserName().equals(username)) {
                newCompany = c;
            }
        }
        return newCompany;
    }
}
