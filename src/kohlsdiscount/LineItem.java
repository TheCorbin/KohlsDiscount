/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

/**
 *d
 * @author ryancorbin
 */
public class LineItem {
    private int quantity;
    private Product item;
    private Double discount;
    private double subTotal;
    private double Total;
    
    public LineItem(Product passingProduct, int quantity) {
        
        this.quantity = quantity;
        this.item = passingProduct; 
    }
    
    public double getLineDiscount(){
        discount = item.getDiscount(quantity);
        return discount;
    }

    public double getLineSubTotal() {
        subTotal = quantity * item.getRetail();
        return subTotal;
    }

    public double getLineTotal() {
        Total = getLineSubTotal() - getLineDiscount();
        return Total;
    }  
    
    public String getProductId(){
        String id = item.getProdId();
        return id;
    } 
    
    public String getProductName(){
        String name = item.getProdName();
        return name;
    }
    
    @Override
    public String toString(){
        String line = getProductId() + "  " + getProductName() + "   " + getLineSubTotal() + "  " + getLineDiscount() + " "  + getLineTotal();
        return line;
    }
    
}
