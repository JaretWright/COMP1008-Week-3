
package w17jan25part2;

import java.time.LocalDate;

/**
 *
 * @author jwright
 */
public class PayCheque {
    private String employeeName, memo;
    private double amount;
    private LocalDate dateIssued;
    private int chequeNumber;
    private static int nextChequeNumber = 100001;
    
    public PayCheque(String name, double payAmount, String memo)
    {
        employeeName = name;
        setAmount(payAmount);
        this.memo = memo;
        
        chequeNumber = nextChequeNumber;
        nextChequeNumber++;
    }
    
    /**
     * This method will validate that the amount of the cheque is positive
     */
    private void setAmount(double amount)
    {
        if (amount <= 0)
            throw new IllegalArgumentException("Cheque amounts must be greater than 0");
        else
            this.amount = amount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getMemo() {
        return memo;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }
    
    /**
     * This will return a String representation of a PayCheque
     */
    public String toString()
    {
        return String.format("Name: %s, amount: $%.2f, cheque #: %d memo: %s", employeeName,
                                                                      amount,
                                                                      chequeNumber,
                                                                      memo);
    }
}
