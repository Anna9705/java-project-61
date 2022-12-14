package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calculator {
    private static final String GAME_RULES = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static int calculate(char operator, int num1, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

    public static void runGame() {
        String[][] gameQAndA = new String[ROUNDS_COUNT][2];
        final int rangeOfRandom = 100;
        for (String[] roundQAndA : gameQAndA) {
            var num1 = Utils.generateNumber(rangeOfRandom);
            var num2 = Utils.generateNumber(rangeOfRandom);
            var operator = Utils.generateNumber(OPERATORS.length);
            roundQAndA[0] = num1 + " " + OPERATORS[operator] + " " + num2;
            roundQAndA[1] = Integer.toString(calculate(OPERATORS[operator], num1, num2));
        }
        Engine.gamesEngine(gameQAndA, GAME_RULES);
    }
}
