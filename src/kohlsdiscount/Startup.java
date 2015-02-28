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
        CashRegister POS = new CashRegister();
        PrintStrategy console = new ConsolePrintStrategy();
        
        POS.createReceipt("100", new FakeDatabase());
        POS.addItem("A101", 2);
        POS.addItem("B205", 2);
        POS.addItem("C222", 4);
        POS.addItem("A101", 1);
        POS.printReceipt(console);     
    } 
}
