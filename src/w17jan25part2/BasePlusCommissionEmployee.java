
package w17jan25part2;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseMonthlySalary;

    public BasePlusCommissionEmployee(double baseMonthlySalary, String firstName, String lastName, int socialInsuranceNumber, LocalDate dateOfBirth, double comRate) {
        super(firstName, lastName, socialInsuranceNumber, dateOfBirth, comRate);
        this.baseMonthlySalary = baseMonthlySalary;
    }
   
    
    /**
     * This method will validate that the base is greater than 0 and set the baseMonthlySalary
     */
    public void setBaseSalary(double base)
    {
        if (base > 0)
            baseMonthlySalary = base;
        else
            throw new IllegalArgumentException("Base monthly salary must be greater than 0");
    }
    
    /**
     * This method will calculate the monthly pay and return a new PayCheque object
     */
    @Override
    public PayCheque getPayCheque()
    {
        double payAmount = super.getCommissionAmount() + baseMonthlySalary;
        
        PayCheque newPay = new PayCheque(super.toString(), payAmount);
        
        super.resetMonthlySales();
        
        return newPay;
    }
    
    public double getPaymentAmount()
    {
        double payAmount = super.getCommissionAmount() + baseMonthlySalary;
        
        super.resetMonthlySales();
        
        return payAmount;
    }
}
