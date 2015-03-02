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
public class Product {
    private String prodNumber;
    private String prodName;
    private Double retail;
    private DiscountStrategy discount;

    public Product(final String prodNumber, final String prodName, final Double retail, final DiscountStrategy discount) {
        this.prodNumber = prodNumber;
        this.prodName = prodName;
        this.retail = retail;
        this.discount = discount;
    }

    public String getProdId() {
        return prodNumber;
    }

    public String getProdName() {
        return prodName;
    }

    public Double getRetail() {
        return retail;
    }

    public double getDiscount(final int qty) {
        return discount.getDiscount(qty, retail);
    }

    public void setProdNumber(final String prodNumber) {
        this.prodNumber = prodNumber;
    }

    public void setProdName(final String prodName) {
        this.prodName = prodName;
    }

    public void setRetail(final Double retail) {
        this.retail = retail;
    }

    public void setDiscount(final DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
    
    
    
    
    
    
    
}
