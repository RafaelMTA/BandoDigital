package utils;

import java.util.Random;

public class ContaUtils {
    private static final Random rand = new Random();
    public static int gerarNumeroAgencia() {
        return 1000 + rand.nextInt(9000);
    }

    public static int gerarNumeroConta(){
        return 10000000 + rand.nextInt(90000000);
    }
}
