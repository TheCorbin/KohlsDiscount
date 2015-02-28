/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

import java.text.NumberFormat;
import java.util.Locale;

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

    public int getQuantity() {
        return quantity;
    }
    
    public Double getRetail(){
        return item.getRetail();
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
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String s = String.format("%-12.5f%.20f", 12.23429837482,9.10212023134);
        
        
        String line = String.format("%4s%24s%9s%7s%12s%14s%14s", getProductId(), getProductName(), n.format(getRetail()), getQuantity(), n.format(getLineSubTotal()), n.format(getLineDiscount()), n.format(getLineTotal()));  
                
//        String line = getProductId() + "       " + getProductName() + "   " + n.format(getRetail()) + "      " + getQuantity() + "       " + n.format(getLineSubTotal()) + "       " + n.format(getLineDiscount()) + "       "  + n.format(getLineTotal());
        return line;
    }
    
}
