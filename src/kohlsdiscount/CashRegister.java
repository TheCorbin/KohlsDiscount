/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

import java.util.Scanner;

/**
 *
 * @author ryancorbin
 */
public class CashRegister {
    private LineMaker liner;
    private TotalMaker totaler;
    Scanner scan  = new Scanner(System.in);
    private String customerID;
    private Customer customer;
    private String[] receipt;
    private ConsoleReceiptMaker consoleReceipt; 
    
    
    public CashRegister(LineMaker liner, TotalMaker totaler) {
        this.liner = liner;
        this.totaler = totaler;
    }
    
    public void run(){
            consoleReceipt.run(liner, totaler);
    }
        
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
}
