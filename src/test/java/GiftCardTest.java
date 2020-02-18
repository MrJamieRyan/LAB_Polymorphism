import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard("1111222233334444", "05/25");
    }

    @Test
    public void canGetLongCardNumber(){
        assertEquals("1111222233334444", giftCard.getLongCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("05/25", giftCard.getExpiryDate());
    }

    @Test
    public void canReturnTransactionCost(){
        assertEquals(0, giftCard.transactionCost(100), 0.01);
    }


}


