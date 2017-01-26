package w17jan25part2;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class CommissionEmployee extends Employee {

    private double monthlySales, commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, 
                              int socialInsuranceNumber, LocalDate dateOfBirth,
                              double comRate) 
    {
        super(firstName, lastName, socialInsuranceNumber, dateOfBirth);
        
        monthlySales = 0;
        setCommissionRate(comRate);
        
    }
    
    /**
     * This method will ensure the commission rate is between 1-40
     * @return 
     */
    public void setCommissionRate(double newComRate)
    {
        if (newComRate >=1 && newComRate <=40)
            commissionRate = newComRate;
        else
            throw new IllegalArgumentException("Commission rates must be 1%-40%");
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * This method allows the CommissionEmployee to add in new sales
     * @return 
     */
    public void addSales(double newSalesAmount)
    {
        if (newSalesAmount > 0)
            monthlySales += newSalesAmount;
        else
            throw new IllegalArgumentException("Sales must be a positive number");
    }
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = commissionRate / 100 * monthlySales;
        
        PayCheque newPay = new PayCheque(super.toString(), payAmount, "Commissions");
        
        monthlySales = 0;
        
        return newPay;
    }
    
}
