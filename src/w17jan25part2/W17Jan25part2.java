/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan25part2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

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

        
        CommissionEmployee empl3 = new CommissionEmployee("Bam Bam","Rubble", 1234, 
                                       LocalDate.of(1972, Month.JANUARY, 1), 5);
        
        empl3.addSales(3456.32);
        empl3.addSales(456.88);
        empl3.addSales(17456.32);

        
        ArrayList<Employee> employees = new ArrayList();
        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);
        
        //This will error out, because a PayChque is NOT a type of Employee
        //employees.add(new PayCheque("Frank", 1234.54, "payment"));
        
        ArrayList<Payable> thingsToPay = new ArrayList();
        
        //adding in Employees to our list
        thingsToPay.add(empl1);
        thingsToPay.add(empl2);
        thingsToPay.add(empl3);
        
        //adding invoices to our list
        thingsToPay.add(new Invoice("1234","Computer",3,4538.76));
        thingsToPay.add(new Invoice("1235","mouse",3,45.99));
        
        
        for (Payable payableObject : thingsToPay)
        {
            System.out.printf("Payable object: %s owed: $%.2f%n",payableObject.toString(), 
                                                                 payableObject.getPaymentAmount());
            System.out.printf("This is class: %s%n", payableObject.getClass());
            
            //this allows us to pull out the different types of classes even though
            //they are of a generic interface
            if (payableObject.getClass()==Invoice.class)
            {
                System.out.printf("Wahoo - that's just cool%n%n");
                ((Invoice)payableObject).getPaymentAmount();
            }
        }
    }
}
