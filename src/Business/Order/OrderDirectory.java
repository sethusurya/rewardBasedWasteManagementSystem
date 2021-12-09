/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class OrderDirectory {
    private ArrayList<Order> orderDirectory;

    public OrderDirectory() {
        orderDirectory = new ArrayList();
    }

    public ArrayList<Order> getOrderList() {
        return orderDirectory;
    }

    public void setOrderList(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public ArrayList<Order> createOrder(Order myOrder){
        int lastId = 0;
        if (orderDirectory.size() > 0) {
            lastId = orderDirectory.get(orderDirectory.size() - 1).getId();
        }
        int currentId = lastId + 1;
        myOrder.setId(currentId);
        orderDirectory.add(myOrder);
        return orderDirectory;
    }
    
    public ArrayList<Order> removeOrderById(int id) {
        Order selectedOrder = null;
        for(Order o: orderDirectory) {
            if (o.getId() == id) {
                selectedOrder = o;
                break;
            }
        }
        if (selectedOrder != null) orderDirectory.remove(selectedOrder);
        return orderDirectory;
    }
    
    public Order getOrderById(int id) {
        Order selectedOrder = null;
        for(Order o: orderDirectory) {
            if (o.getId() == id) {
                selectedOrder = o;
                break;
            }
        }
        return selectedOrder;
    }
}
