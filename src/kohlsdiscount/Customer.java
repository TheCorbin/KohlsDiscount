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
    
    public Customer(final String customerID, final String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public String getCustId() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerID(final String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }
    
}
