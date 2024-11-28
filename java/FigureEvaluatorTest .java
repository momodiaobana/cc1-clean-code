import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class FigureEvaluatorTest {

    @Test
    void testBrelanDetection() {
        DiceRoll roll = new DiceRoll(Arrays.asList(3, 3, 3, 4, 5));
        FigureEvaluator evaluator = new FigureEvaluator();
        assertEquals(Figure.BRELAN, evaluator.evaluate(roll).get());
    }

    @Test
    void testCarréDetection() { 
        DiceRoll roll = new DiceRoll(Arrays.asList(1, 1, 1, 1, 2));
        FigureEvaluator evaluator = new FigureEvaluator();
        assertEquals(Figure.CARRE, evaluator.evaluate(roll).get());
    }

    @Test
    void testFullDetection() {
     DiceRoll roll = new DiceRoll(Arrays.asList(2, 2, 2, 1, 1));
     FigureEvaluator evaluator = new FigureEvaluator();
     assertEquals(Figure.FULL, evaluator.evaluate(roll).get());

     @Test 
     void testGrandeSuiteDetection() {
         DiceRoll roll = new DiceRoll(Arrays.asList(1, 2, 3, 4, 5));
         FigureEvaluator evaluator = new FigureEvaluator();
         assertEquals(Figure.GRANDE_SUITE, evaluator.evaluate(roll).get());
     }

     @Test 
     void testYAMSDetection() {
         DiceRoll roll = new DiceRoll(Arrays.asList(5, 5, 5, 5, 5));
         FigureEvaluator evaluator = new FigureEvaluator();
         assertEquals(Figure.YAMS, evaluator.evaluate(roll).get());
     }

     
}
