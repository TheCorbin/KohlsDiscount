/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

import java.text.NumberFormat;
import java.util.Locale;

public class Receipt {
    private String custID;
    private ReceiptDataAccessStrategy data;
    private LineItem[] items = new LineItem[0];
    private Customer customer;
    
    private String[] strReceipt = new String[3];
   
    public Receipt(String custID, ReceiptDataAccessStrategy data) {
        this.custID = custID;
        customer = data.findCustomer(custID);
        this.data = data;
    }
    
    public void addLineItem(String productID, int quantity){
        addItem(1);

        Product passingProduct = data.findProduct(productID);
        LineItem temp = new LineItem(passingProduct, quantity);
        for (int i = 0; i<items.length; i++) {
            if (null == items[i]){
                items[i] = temp;
            }
        } 
    }
    
    public String[] receiptReturn(){
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String title = "Thanks For Shopping with us "+ customer.getCustomerName();
        String seperator = "";
        String category ="Item ID    Item Name           Retail  Quantity  SubTotal  Discount Total   Final Total";
        strReceipt[0] = title;
        strReceipt[1] = seperator;
        strReceipt[2] = category;
        
        for (LineItem item : items) {
            addReceiptItem(1);
            for (int x = 0; x < strReceipt.length; x++) {
                if (strReceipt[x] == null) {
                    strReceipt[x] = item.toString();
                }
            }
        }
        
        addReceiptItem(1);
        strReceipt[strReceipt.length - 1] = seperator;
        
        addReceiptItem(3);

        for (int x = 0; x < strReceipt.length; x++) {
                if (strReceipt[x] == null) {
                   strReceipt[x] = String.format("Subtotal: %74s", n.format(getSubtotal()));
                   strReceipt[x+1] = String.format("Discount Total: %68s", n.format(getTotalDiscount()));
                   strReceipt[x+2] = String.format("Final Total: %71s", n.format(getFinalTotal()));
                   x = 100;
                }
        }
        return strReceipt;
    }
    
    private double getSubtotal(){
        Double subTotal = 0.00;
   
        if (items.length != 0){
            for (LineItem Line : items){
                subTotal += Line.getLineSubTotal();
            }
        }  
        return subTotal;
    }
    
    private double getTotalDiscount(){
        Double discountTotal = 0.00;
        
        if (items.length != 0){
            for (LineItem Line : items){
                discountTotal += Line.getLineDiscount();
            }
        }  
        return discountTotal;  
    }
    
    private double getFinalTotal(){
        Double finalTotal = 0.00;
        
        if (items.length != 0){
            for (LineItem Line : items){
                finalTotal += Line.getLineTotal();
            }
        }  
        return finalTotal;  
    }
    
    private void addReceiptItem(int increase){
        String[] temp = new String[strReceipt.length + increase];
        System.arraycopy(strReceipt, 0, temp, 0, strReceipt.length);
        strReceipt = temp;
    }
    
    private void addItem(int increase){
        LineItem[] temp = new LineItem[items.length + increase];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
    }
    
}
