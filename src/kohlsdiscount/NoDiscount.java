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
public class NoDiscount implements DiscountStrategy {

    public NoDiscount() {
    }
    
    @Override
    public Double getDiscount(int qtyProduct, double price){
        return 0.0;
    }
    
}
