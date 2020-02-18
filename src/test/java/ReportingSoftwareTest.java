import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReportingSoftwareTest {
    private CreditCard creditCard;
    private Transaction transaction;

    @Before
    public void before(){
        creditCard = new CreditCard("99999", "22/22");
        transaction = new Transaction(creditCard, 100, "20/20");
    }

    @Test
    public void canReturnTransactionCost(){
        assertEquals(7.5,ReportingSoftware.getTransactionCost(transaction),
                0.01);
    }
}
