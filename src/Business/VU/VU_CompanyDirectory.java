/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.VU;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class VU_CompanyDirectory {
     private ArrayList<VU_Company> vuCompanyList;

    public VU_CompanyDirectory() {
        vuCompanyList = new ArrayList();
    }
    
    public ArrayList<VU_Company> getCompanies (){
        return vuCompanyList;
    }
    
    public ArrayList<VU_Company> addCompany(VU_Company newCompany){
        int lastId = 0;
        if (vuCompanyList.size() > 0) {
            lastId = vuCompanyList.get(vuCompanyList.size() - 1).getId();
        }
        newCompany.setId(lastId+1);
        vuCompanyList.add(newCompany);
        return vuCompanyList;
    }
    
    public ArrayList<VU_Company> removeCompany(VU_Company newCompany){
        vuCompanyList.remove(newCompany);
        return vuCompanyList;
    }
    
    public VU_Company findCompanyByAdminUserName(String username) {
        VU_Company newCompany = null;
        for (VU_Company c: vuCompanyList){
            if (c.getAdminUserName().equals(username)) {
                newCompany = c;
            }
        }
        return newCompany;
    }
    
    public VU_Company findCompanyById(int id) {
        VU_Company newCompany = null;
        for (VU_Company c: vuCompanyList){
            if (c.getId() == id) {
                newCompany = c;
            }
        }
        return newCompany;
    }
}
