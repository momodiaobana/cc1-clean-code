package cc1-clean-code;

import java.util.List;

public class DiceRoll {
    private final List<Integer> dice;

    public DiceRoll(List<Integer> dice) {
        if (dice.size() != 5) {
            throw new IllegalArgumentException("A roll must contain exactly 5 dice.");
        }
        this.dice = dice;
    }

    public List<Integer> getDice() {
        return dice;
    }
}
