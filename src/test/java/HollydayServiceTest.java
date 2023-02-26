import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HollydayServiceTest {

    @Test
    public void incomeTenExpensesThreeThresholdTwenty() {
        HollydayService service = new HollydayService();

        int expected = 3;
        int actual = service.calcHollyday(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incomeHundredExpensesSixtyThresholdOneHundredFifty() {
        HollydayService service = new HollydayService();

        int expected = 2;
        int actual = service.calcHollyday(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}
