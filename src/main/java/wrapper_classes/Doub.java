package wrapper_classes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Doub {
    public static void main(String[] args) {
        double d1 = 0.3;
        double d2 = 0.1;
        double res = d1-d2;
        System.out.println(res);
        BigDecimal bd1 = new BigDecimal(0.3, MathContext.DECIMAL32);
        BigDecimal bd2 = new BigDecimal(0.1, MathContext.DECIMAL32);
        BigDecimal result = bd1.subtract(bd2);
        System.out.println(result);
        System.out.println();
        BigDecimal bd3 = new BigDecimal(0.3 );
        BigDecimal bd4 = new BigDecimal(0.1 );
        BigDecimal result2 = bd3.subtract(bd4);
        System.out.println(result2.setScale(1, RoundingMode.CEILING));

    }
}
