package utils;

import java.util.Random;

public class BancoUtils {
    private static final Random rand = new Random();
    public static int gerarNumero() {
        return 1000 + rand.nextInt(9000);
    }
}
