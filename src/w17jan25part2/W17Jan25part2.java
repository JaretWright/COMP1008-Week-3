/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25part2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jwright
 */
public class W17Jan25part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee empl1 = new Employee("Fred","Flintstone", 1234, 
                                       LocalDate.of(1956, Month.MARCH, 12));
        
        System.out.printf("The first employee is %s%n", empl1.toString());
        
        Employee empl2 = new Employee("Barney","Rubble", 1234, 
                                       LocalDate.of(1958, Month.JANUARY, 1));
        
        System.out.printf("The second employee is %s%n", empl2.toString());
        
        
    }
    
}
