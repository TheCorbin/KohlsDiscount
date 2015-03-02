/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount.Discounts;

import kohlsdiscount.DiscountStrategy;

/**
 *
 * @author ryancorbin
 */
public class PercentOffDiscount implements DiscountStrategy {
    
    private Double percentOff;

    public PercentOffDiscount(final Double percentOff) {
        this.percentOff = percentOff;
    }
    
    @Override
    public Double getDiscount(final int qtyProduct, final double price){
        return (qtyProduct*price) * percentOff; 
    }
}
