public class PaymentCard {
    private String longCardNumber;
    private String expiryDate;

    public PaymentCard(String longCardNumber, String expirydate) {
        this.longCardNumber = longCardNumber;
        this.expiryDate = expirydate;
    }

    public String getLongCardNumber() {
        return longCardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
