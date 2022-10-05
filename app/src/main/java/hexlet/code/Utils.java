package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int rangeOfRandom) {
        var random = new Random();
        return random.nextInt(rangeOfRandom);
    }

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

    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (var i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + step * i);
        }
        return progression;
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (var i = 2 + 1; i < number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calculateGCD(num2, num1 % num2);
        }
    }
}
