package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int rangeOfRandom) {
        var random = new Random();
        return random.nextInt(rangeOfRandom);
    }
}
