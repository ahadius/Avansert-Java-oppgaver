import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzeeTest {
    @Test
    public void chanceSum() {
        var allDices = new allDices(new DiceValue[]{
            new DiceValue(5),
            new DiceValue(4),
            new DiceValue(2),
            new DiceValue(1),
            new DiceValue(6),
        });
        assertEquals(allDices.getSum(), 14);
    }


}
