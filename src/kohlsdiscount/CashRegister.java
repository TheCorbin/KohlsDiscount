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
   
    public void createReceipt(String customerNo, ReceiptDataAccessStrategy data){
        receipt = new Receipt(customerNo, data);
    }
    
    public void addItem(String productId, int Quantity){
        receipt.addLineItem(productId, Quantity);
    }
    
    public void printReceipt(PrintStrategy printer){
        printer.print(receipt.receiptReturn()); 
    }
}
