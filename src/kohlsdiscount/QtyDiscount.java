package kohlsdiscount;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryancorbin
 */
public class QtyDiscount implements DiscountStrategy, NewInterface {
    
    private Double percentOff;
    private int qty;

    public QtyDiscount(Double percentOff, int qty) {
        this.percentOff = percentOff;
        this.qty = qty;
    }
   
    @Override
    public Double getDiscount(int qtyProduct, double price){
        if (qtyProduct < qty){
            return 0.0;
        } else {
            return (qtyProduct*price) * percentOff;
        }
    }
    
    
    
}
