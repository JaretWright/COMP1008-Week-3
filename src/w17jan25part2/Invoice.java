package w17jan25part2;

/**
 *
 * @author JWright
 */
public class Invoice implements Payable{
    private String partNumber, description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String description, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String toString()
    {
        return String.format("Part #: %s (%s), quantity: %d, price per item: $%.2f",
                            partNumber, description, quantity, pricePerItem);
    }
    
    
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            throw new IllegalArgumentException("Quantity must be greater than 0");
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem >= 0)
            this.pricePerItem = pricePerItem;
        else
            throw new IllegalArgumentException("Price must be greater than or equal to 0");
    }
    
    
    
    @Override
    public double getPaymentAmount() {
       return quantity*pricePerItem;
    }
    
}
