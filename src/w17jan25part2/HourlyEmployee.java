
package w17jan25part2;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate, hoursWorked;
    private final double MINIMUMWAGE=11.40;
    
    public HourlyEmployee(String firstName, String lastName, int socialInsuranceNumber, 
                            LocalDate dateOfBirth, double hourlyRate) 
    {
        super(firstName, lastName, socialInsuranceNumber, dateOfBirth);
        hoursWorked = 0;
        setHourlyRate(hourlyRate);
    }

    /**
     * This method will validate that the hourly rate meets the current, legislated
     * minimums
     * @return 
     */
    public void setHourlyRate(double rate)
    {
        if (rate < MINIMUMWAGE)
            throw new IllegalArgumentException(String.format("Hourly rate must be above $%.2f", MINIMUMWAGE));
        else
            hourlyRate = rate;
    }
    
    /**
     * This method will allow a HourlyEmployee to record the hours worked
     * @return 
     */
    public void addHoursWorked(double newHoursWorked)
    {
        if (newHoursWorked > 0 && newHoursWorked < 15)
            hoursWorked += newHoursWorked;
        else
            throw new IllegalArgumentException("Hours worked must be greater than 0 "
                                                + "and less than 15");        
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * hourlyRate;
        PayCheque newPay = new PayCheque(super.toString(), payAmount, "Hourly employee paid");
        
        hoursWorked = 0; //zero out the hours worked for the next pay period
        
        return newPay;
    }
    
}
