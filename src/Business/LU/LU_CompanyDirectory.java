/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LU;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class LU_CompanyDirectory {
    private ArrayList<LU_Company> luCompanyList;

    public LU_CompanyDirectory() {
        luCompanyList = new ArrayList();
    }
    
    public ArrayList<LU_Company> getCompanies (){
        return luCompanyList;
    }
    
    public ArrayList<LU_Company> addCompany(LU_Company newCompany){
        int lastId = 0;
        if (luCompanyList.size() > 0) {
            lastId = luCompanyList.get(luCompanyList.size() - 1).getId();
        }
        newCompany.setId(lastId+1);
        luCompanyList.add(newCompany);
        return luCompanyList;
    }
    
    public ArrayList<LU_Company> removeCompany(LU_Company newCompany){
        luCompanyList.remove(newCompany);
        return luCompanyList;
    }
    
    public LU_Company findCompanyByAdminUserName(String username) {
        LU_Company newCompany = null;
        for (LU_Company c: luCompanyList){
            if (c.getAdminUserName().equals(username)) {
                newCompany = c;
            }
        }
        return newCompany;
    }
    
    public LU_Company findCompanyById(int id) {
        LU_Company newCompany = null;
        for (LU_Company c: luCompanyList){
            if (c.getId() == id) {
                newCompany = c;
            }
        }
        return newCompany;
    }
}
