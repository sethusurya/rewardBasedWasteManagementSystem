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
public class WSU_Company {
    private String name;
    private String street;
    private String city;
    private Long zip;
    private int id;
    private String adminUserName;
    private ArrayList<String> employeesList; // list of userNames
    private static int count = 1;

    public WSU_Company() {
        id = count;
        count++;
        employeesList = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public ArrayList<String> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<String> employeesList) {
        this.employeesList = employeesList;
    }

    public static void setCount(int count) {
        WSU_Company.count = count;
    }
    
    @Override
    public String toString(){
       return name;
    }
}
