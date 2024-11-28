package cc1-clean-code;


import java.util.*;

public class FigureEvaluator {
    public Optional<Figure> evaluate(DiceRoll roll) {
        List<Integer> dice = roll.getDice();
        Map<Integer, Long> counts = dice.stream()s
            .collect(Collectors.groupingBy(d -> d, Collectors.counting()));

        if (counts.values().contains(3L)) {
            return Optional.of(Figure.BRELAN);
        }

        return Optional.of(Figure.CHANCE); 
}
