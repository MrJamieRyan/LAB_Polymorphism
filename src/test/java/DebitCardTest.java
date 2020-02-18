import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard("0000000000000000", "01/21");
    }

    @Test
    public void canGetLongCardNumber(){
        assertEquals("0000000000000000", debitCard.getLongCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("01/21", debitCard.getExpiryDate());
    }

    @Test
    public void canReturnTransactionCost(){
        assertEquals(4, debitCard.transactionCost(100), 0.01);
    }


}


