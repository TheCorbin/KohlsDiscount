/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

public class Receipt {
    private String custID;
    private ReceiptDataAccessStrategy data;
    private LineItem[] items = new LineItem[0];
    private Customer customer;
    
    private String[] strReceipt = new String[1];
   
    public Receipt(String custID, ReceiptDataAccessStrategy data) {
        this.custID = custID;
        customer = data.findCustomer(custID);
        this.data = data;
    }
    
    public void AddLineItem(String productID, int quantity){
        addItem(1);
        Product passingProduct = data.findProduct(productID);
        LineItem temp = new LineItem(passingProduct, quantity);
        for (int i = 0; i<items.length; i++) {
            if (items[i] == null){
                items[i] = temp;
            }
        } 
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
                finalTotal += Line.getLineDiscount();
            }
        }  
        return finalTotal;  
    }
    
    
    public String[] receiptReturn(){
        String title = "Thanks For Shopping with us "+ customer.getCustomerName();
        int keeper = 1;
        
        strReceipt[0] = title;
        for (LineItem item : items) {
            addReceiptItem(1);
            for (int x = 0; x<items.length; x++) {
                if (strReceipt[x] == null) {
                    strReceipt[x] = item.toString();
                    keeper = x;
                }
            }
        }
        addReceiptItem(3);
        strReceipt[keeper+1] = "Subtotal:       $" + getSubtotal();
        strReceipt[keeper+2] = "Discount Total: $" + getTotalDiscount();
        strReceipt[keeper+3] = "Final Total:    $" + getFinalTotal();
        
        return strReceipt;
    }
    
    
    
    private void addReceiptItem(int increase){
        String[] temp = new String[strReceipt.length + increase];
        System.arraycopy(strReceipt, 0, temp, 0, strReceipt.length);
    }
    
    private void addItem(int increase){
        LineItem[] temp = new LineItem[items.length + increase];
        System.arraycopy(items, 0, temp, 0, items.length);
    }
    
}
