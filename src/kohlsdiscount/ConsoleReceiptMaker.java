/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscount;

import java.util.Scanner;

 *
 * @author ryancorbin
 */
public class ConsoleReceiptMaker {
    
    Scanner scan  = new Scanner(System.in);
    
    ReceiptDataAccessStrategy data = new FakeDatabase();
    private String customerID;
    private Customer customer;
    private LineMaker liner;
    private TotalMaker totaler;
    
    public void run(LineMaker liner, TotalMaker totaler){
        this.liner = liner;
        this.totaler = totaler;
        Intro();
        
    }
    
    private void Intro(){
        System.out.println("Hello!  What's your customer ID?");
            customerID = scan.nextLine();
            customer = data.findCustomer(customerID);
            System.out.println("Hello" + customer.getCustomerName());
    }
    
    private void LineCreator(){
        While 
        
        System.out.print("Enter an item ID:");
        
    }
    
    
    
    
    
    
    
}
