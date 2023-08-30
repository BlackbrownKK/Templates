package wrapper_classes;

import java.math.BigInteger;
import java.util.Random;

public class Big {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("2568956856256451213236565579686");
        System.out.println(n);
        Long l = Long.MAX_VALUE;
        System.out.println(l);

        BigInteger m = new BigInteger("54885865653231215245789563232456");
        BigInteger mult = n.multiply(m);
        System.out.println(mult);

        BigInteger bigInteger = new BigInteger(100, new Random());
        System.out.println(bigInteger);
    }
}
