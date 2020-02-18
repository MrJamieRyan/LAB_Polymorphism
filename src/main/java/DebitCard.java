public class DebitCard extends PaymentCard implements IChargeable {
    public DebitCard(String longCardNumber, String expirydate) {
        super (longCardNumber, expirydate);
    }

    public double transactionCost(double transactionAmount) {
        return 0.04 * transactionAmount;
    }
}
