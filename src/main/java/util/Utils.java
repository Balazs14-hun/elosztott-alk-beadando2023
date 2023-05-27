package util;

import java.util.Random;

public class Utils {
    public static int kockadobas(int kockaOldalainakSzama) {
        Random rand = new Random();
        int kockadobasEredmenye = rand.nextInt(1, kockaOldalainakSzama + 1);
        return kockadobasEredmenye;
    }
}
