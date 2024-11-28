package cc1-clean-code;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class DiceRollTest {

    @Test
    void testValidDiceRoll() {
        DiceRoll roll = new DiceRoll(Arrays.asList(1, 2, 3, 4, 5));
        assertNotNull(roll);
        assertEquals(5, roll.getDice().size());
    }

    @Test
    void testInvalidDiceRoll() {
        // Vérifie que la liste doit contenir exactement 5 dés
        assertThrows(IllegalArgumentException.class, () -> {
            new DiceRoll(Arrays.asList(1, 2));
        });
    }
}
