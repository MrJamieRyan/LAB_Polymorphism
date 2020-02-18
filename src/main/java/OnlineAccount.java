import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList<Transaction> transactions;
    private ArrayList<IChargeable> cards;

    public OnlineAccount(String name, ArrayList<IChargeable> cards){
        this.name = name;
        this.cards = cards;
        this.transactions = new ArrayList<Transaction>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<IChargeable> getCards() {
        return this.cards;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
}
