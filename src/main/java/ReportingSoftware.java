public class ReportingSoftware {
    public static double getTransactionCost(Transaction transaction){
       return transaction.getCard().transactionCost(transaction.getTransactionAmount());
    }
}
