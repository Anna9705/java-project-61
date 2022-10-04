package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calculator {
    private static final String GAME_RULES = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    private static int calculate(char operator, int num1, int num2) {
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
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        var random = new Random();
        var num1 = 0;
        var num2 = 0;
        var operator = 0;
        final int rangeOfRandom = 100;
        for (String[] roundQAndA : gameAnswers) {
            num1 = random.nextInt(rangeOfRandom);
            num2 = random.nextInt(rangeOfRandom);
            operator = random.nextInt(OPERATORS.length);
            roundQAndA[0] = num1 + " " + OPERATORS[operator] + " " + num2;
            roundQAndA[1] = Integer.toString(calculate(OPERATORS[operator], num1, num2));
        }
        System.out.println(Engine.gamesEngine(gameAnswers, GAME_RULES));
    }
}
