import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
            public void before() {
        creditCard = new CreditCard("1234123412341234", "12/21");
    }

    @Test
    public void canGetLongCardNumber(){
        assertEquals("1234123412341234", creditCard.getLongCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("12/21", creditCard.getExpiryDate());
    }

    @Test
    public void canReturnTransactionCost(){
        assertEquals(7.50, creditCard.transactionCost(100), 0.01);
    }


}


