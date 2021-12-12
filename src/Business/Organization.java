/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Bid.BidDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Order.OrderDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WSU.WSU_CompanyDirectory;
import Business.WRU.WRU_CompanyDirectory;
import Business.LU.LU_CompanyDirectory;
import Business.VU.VU_CompanyDirectory;
import Business.RU.RU_CompanyDirectory;
import Business.Voucher.VoucherDirectory;
import Business.Redemption.RedemptionDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WSU_CompanyDirectory wsuCompanyDirectory;
    private WRU_CompanyDirectory wruCompanyDirectory;
    private LU_CompanyDirectory luCompanyDirectory;
    private VU_CompanyDirectory vuCompanyDirectory;
    private RU_CompanyDirectory ruCompanyDirectory;
    private OrderDirectory orderDirectory;
    private VoucherDirectory voucherDirectory;
    private RedemptionDirectory redemptionDirectory;
    private BidDirectory bidDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        wsuCompanyDirectory = new WSU_CompanyDirectory(); // creating wsu_directory
        wruCompanyDirectory = new WRU_CompanyDirectory(); // creating wru_directory
        ruCompanyDirectory = new RU_CompanyDirectory();
        luCompanyDirectory = new LU_CompanyDirectory(); // creating lu_directory
        vuCompanyDirectory = new VU_CompanyDirectory();
        orderDirectory = new OrderDirectory();
        voucherDirectory = new VoucherDirectory();
        redemptionDirectory = new RedemptionDirectory();
        bidDirectory = new BidDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public WRU_CompanyDirectory getWRUCompanyDirectory() {
        return wruCompanyDirectory;
    }
    
    public RU_CompanyDirectory getRUCompanyDirectory() {
        return ruCompanyDirectory;
    }
    
    public WSU_CompanyDirectory getWSUCompanyDirectory(){
        return wsuCompanyDirectory;
    }
    
    public LU_CompanyDirectory getLUCompanyDirectory(){
        return luCompanyDirectory;
    }
    
    public VU_CompanyDirectory getVUCompanyDirectory(){
        return vuCompanyDirectory;
    }
    
    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }
    
    public VoucherDirectory getVoucherDirectory() {
        return voucherDirectory;
    }
    
    public RedemptionDirectory getRedemptionDirectory() {
        return redemptionDirectory;
    }
    
    public BidDirectory getBidDirectory() {
        return bidDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
