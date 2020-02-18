import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionTest {

    private Transaction transaction;
    private IChargeable debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard("222222222222222222", "02/22");
        transaction = new Transaction(debitCard, 25.00, "22/21");
    }

    @Test
    public void canGetCard(){
        assertEquals(debitCard, transaction.getCard());
    }

    @Test
    public void canGetTransactionAmount(){
        assertEquals(25.00, transaction.getTransactionAmount(), 0.01);
    }

    @Test
    public void canGetDate(){
        assertEquals("22/21", transaction.getDate());
    }
}
