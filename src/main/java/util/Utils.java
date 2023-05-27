package util;

import java.util.Random;

public class Utils {
    public static int kockadobas(int kockaOldalainakSzama) {
        Random rand = new Random();
        return rand.nextInt(1, kockaOldalainakSzama + 1);
    }
}
