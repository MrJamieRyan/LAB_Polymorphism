public class CreditCard extends PaymentCard implements IChargeable {
    private double riskFactor;
    public CreditCard(String longCardNumber, String expirydate) {
        super (longCardNumber, expirydate);
        this.riskFactor = 1.5;
    }

    public double transactionCost(double transactionAmount) {
        return 0.05 * transactionAmount * riskFactor;
    }
}
