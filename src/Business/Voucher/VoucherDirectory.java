/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Voucher;

import java.util.ArrayList;

/**
 *
 * @author saket
 */
public class VoucherDirectory {
    private ArrayList<Voucher> voucherDirectory;

    public VoucherDirectory() {
        voucherDirectory = new ArrayList();
    }

    public ArrayList<Voucher> getVoucherDirectory() {
        return voucherDirectory;
    }

    public void setVoucherDirectory(ArrayList<Voucher> voucherDirectory) {
        this.voucherDirectory = voucherDirectory;
    }
    
    public ArrayList<Voucher> createVoucher(Voucher myVoucher){
        int lastId = 0;
        if (voucherDirectory.size() > 0) {
            lastId = voucherDirectory.get(voucherDirectory.size() - 1).getId();
        }
        int currentId = lastId + 1;
        myVoucher.setId(currentId);
        voucherDirectory.add(myVoucher);
        return voucherDirectory;
    }
    
    public ArrayList<Voucher> removeVoucherById(int id) {
        Voucher selectedVoucher = null;
        for(Voucher v: voucherDirectory) {
            if (v.getId() == id) {
                selectedVoucher = v;
                break;
            }
        }
        if (selectedVoucher != null) voucherDirectory.remove(selectedVoucher);
        return voucherDirectory;
    }
    
    public Voucher getVoucherById(int id) {
        Voucher selectedVoucher = null;
        for(Voucher v: voucherDirectory) {
            if (v.getId() == id) {
                selectedVoucher = v;
                break;
            }
        }
        return selectedVoucher;
    }
}
