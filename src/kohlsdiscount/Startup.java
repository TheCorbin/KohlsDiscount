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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LineMaker liner = new LineMaker();
        TotalMaker totaler = new TotalMaker();
        
        CashRegister POS = new CashRegister(liner, totaler);
        POS.run();
        
        
        
        
    }
    
}
