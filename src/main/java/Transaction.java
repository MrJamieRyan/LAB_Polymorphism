public class Transaction {

    private IChargeable card;
    private double transactionAmount;
    private String date;
    public Transaction(IChargeable card, double transactionAmount,
                       String date) {
        this.card = card;
        this.transactionAmount = transactionAmount;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public IChargeable getCard() {
        return card;
    }
}
