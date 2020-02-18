public class GiftCard extends PaymentCard implements IChargeable {
    public GiftCard(String longCardNumber, String expirydate) {
        super (longCardNumber, expirydate);
    }

    public double transactionCost(double transactionAmount) {
        return 0;
    }
}