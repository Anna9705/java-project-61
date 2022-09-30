package hexlet.code;

import java.util.Scanner;
import java.util.Random;
import static hexlet.code.Cli.welcomePlayer;

public class Games {
    public static void evenCheck() {
        welcomePlayer();
        Player.greetPlayer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        boolean check = true;
        var random = new Random();
        var number = 0;
        Scanner in = new Scanner(System.in);
        String answer;
        final int rangeOfRandom = 1000;
        for (var i = 0; i <= 2; i++) {
            number = random.nextInt(0, rangeOfRandom);
            System.out.println("Question: " + number);
            System.out.print("Your answer is: ");
            answer = in.next();
            if ((answer.equals("yes") && number % 2 == 0) || (answer.equals("no") && number % 2 == 1)) {
                System.out.println("Correct!");
            } else {
                check = false;
                if (number % 2 == 1) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'");
                }
                Player.loseMessage();
                break;
            }
        }
        if (check) {
            Player.winMessage();
        }
    }
}
