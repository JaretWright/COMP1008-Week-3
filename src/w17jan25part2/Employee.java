
package w17jan25part2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jwright
 */
public abstract class Employee {
    private String firstName, lastName;
    private int socialInsuranceNumber;
    private LocalDate dateOfBirth;
    private int employeeNumber;
    private static int nextEmployeeNumber = 10001;

    public Employee(String firstName, String lastName, int socialInsuranceNumber, 
                        LocalDate dateOfBirth) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialInsuranceNumber = socialInsuranceNumber;
        setBirthday(dateOfBirth);
        employeeNumber = nextEmployeeNumber;
        
        nextEmployeeNumber++;
    }
    
    /**
     * This method will validate that an Employee is the correct age
     * to work for our company
     */
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(dob, today).getYears();
        
        if (age >= 14 && age <= 90)
            dateOfBirth = dob;
        else
            throw new IllegalArgumentException("Sorry, applicants must be 14-90 years old");
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    /**
     * This method will create a "PayCheque" object for the Employee
     * @return 
     */
    public abstract PayCheque getPayCheque();
    
    
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    
    
}
