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
public class CashRegister {
   
    private Receipt receipt;
   
    public void createReceipt(final String customerNo, final ReceiptDataAccessStrategy data){
        receipt = new Receipt(customerNo, data);
    }
    
    public void addItem(final String productId, final int Quantity){
        receipt.addLineItem(productId, Quantity);
    }
    
    public void printReceipt(final PrintStrategy printer){
        printer.print(receipt.receiptReturn()); 
    }
}
