/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

/**
 *
 * @author ryancorbin
 */
public class Customer {
    private String customerID;
    private String customerName;
    private Customer customer;
    

    public Customer(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public String getCustId() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
    
    
    
    
    
    
    
    
}