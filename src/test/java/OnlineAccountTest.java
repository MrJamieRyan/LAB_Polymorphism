import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OnlineAccountTest {

    private OnlineAccount onlineAccount;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private GiftCard giftCard;
    private Transaction transaction;

    private ArrayList<IChargeable> cards;

    @Before
    public void before(){
        creditCard = new CreditCard("9999", "11/21");
        debitCard = new DebitCard("8888", "11/22");
        giftCard = new GiftCard("7777","10/22");

    cards = new ArrayList<IChargeable>();
    cards.add(creditCard);
    cards.add(debitCard);
    cards.add(giftCard);

    onlineAccount = new OnlineAccount("Jamie", cards);

    transaction = new Transaction(creditCard, 100, "18/20");

    }

    @Test
    public void canGetCustomerName(){
        assertEquals("Jamie", onlineAccount.getName());
    }

    @Test
    public void canGetCards(){
        assertEquals(creditCard, onlineAccount.getCards().get(0));
    }

    @Test
    public void canAddTransaction(){
        onlineAccount.addTransaction(transaction);
        assertEquals(transaction,onlineAccount.getTransactions().get(0));
    }


}


