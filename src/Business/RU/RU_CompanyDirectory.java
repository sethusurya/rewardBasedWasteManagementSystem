/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RU;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class RU_CompanyDirectory {
    private ArrayList<RU_Company> ruCompanyList;

    public RU_CompanyDirectory() {
        ruCompanyList = new ArrayList();
    }
    
    public ArrayList<RU_Company> getCompanies (){
        return ruCompanyList;
    }
    
    public ArrayList<RU_Company> addCompany(RU_Company newCompany){
        int lastId = 0;
        if (ruCompanyList.size() > 0) {
            lastId = ruCompanyList.get(ruCompanyList.size() - 1).getId();
        }
        newCompany.setId(lastId+1);
        ruCompanyList.add(newCompany);
        return ruCompanyList;
    }
    
    public ArrayList<RU_Company> removeCompany(RU_Company newCompany){
        ruCompanyList.remove(newCompany);
        return ruCompanyList;
    }
    
    public RU_Company findCompanyByAdminUserName(String username) {
        RU_Company newCompany = null;
        for (RU_Company c: ruCompanyList){
            if (c.getAdminUserName().equals(username)) {
                newCompany = c;
            }
        }
        return newCompany;
    }
    
    public RU_Company findCompanyById(int id) {
        RU_Company newCompany = null;
        for (RU_Company c: ruCompanyList){
            if (c.getId() == id) {
                newCompany = c;
            }
        }
        return newCompany;
    }
    
}
