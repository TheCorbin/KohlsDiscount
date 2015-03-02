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
public class Startup {

    public static void main(String[] args) {
        CashRegister pOS = new CashRegister();
        PrintStrategy console = new ConsolePrintStrategy();
        
        pOS.createReceipt("300", new FakeDatabase());
        pOS.addItem("A101", 2);
        pOS.addItem("B205", 2);
        pOS.addItem("C222", 4);
        pOS.addItem("A101", 1);
        pOS.printReceipt(console);     
    } 
}
