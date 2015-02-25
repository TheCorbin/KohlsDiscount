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

    public Product(String prodNumber, String prodName, Double retail, DiscountStrategy discount) {
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

    public double getDiscount() {
        return discount.getDiscount(qtyProduct, price);
    }

    public void setProdNumber(String prodNumber) {
        this.prodNumber = prodNumber;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setRetail(Double retail) {
        this.retail = retail;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
    
    
    
    
    
    
    
}
