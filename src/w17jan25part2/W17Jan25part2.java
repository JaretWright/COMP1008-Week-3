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
        HourlyEmployee empl1 = new HourlyEmployee("Fred","Flintstone", 1234, 
                                       LocalDate.of(1956, Month.MARCH, 12),23.12);
        
        System.out.printf("The first employee is %s%n", empl1.toString());
        
        HourlyEmployee empl2 = new HourlyEmployee("Barney","Rubble", 1234, 
                                       LocalDate.of(1958, Month.JANUARY, 1),15.87);
        
        System.out.printf("The second employee is %s%n", empl2.toString());
        
        empl1.addHoursWorked(13);
        empl1.addHoursWorked(4);
        empl2.addHoursWorked(10);
        empl2.addHoursWorked(10);
        
        System.out.printf("The paycheque for %s is %s%n", empl1, empl1.getPayCheque());
        System.out.printf("The paycheque for %s is %s%n", empl2, empl2.getPayCheque());
        
        CommissionEmployee empl3 = new CommissionEmployee("Bam Bam","Rubble", 1234, 
                                       LocalDate.of(1972, Month.JANUARY, 1), 5);
        
        empl3.addSales(3456.32);
        empl3.addSales(456.88);
        empl3.addSales(17456.32);
        
        System.out.printf("PayCheque for employee 3: %s%n", empl3.getPayCheque());
        
        
    }
}
