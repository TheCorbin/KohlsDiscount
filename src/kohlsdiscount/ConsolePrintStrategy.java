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
public class ConsolePrintStrategy implements PrintStrategy {
    
    @Override
    public void print(String[] temp){
        for (String line: temp){
            System.out.println(line);
        }
    }
}
