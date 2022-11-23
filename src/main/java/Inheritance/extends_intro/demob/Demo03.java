package Inheritance.extends_intro.demob;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Demo03 {

    static Box box;
    static double width;
    static double height;
    static double depth;
    static int places;

    public static void main(String[] args) {
        initVars();
        showVolume();
    }

    private static void initVars() {
        // инициализация перед созданием экземпляра!!!
        width = 12.5;
        height = 2.3;
        depth = 1.5;

        box = new Box(width, height, depth);
        places = 2;
    }

    private static void showVolume() {
        System.out.println("Значение без округления: "
                + box.getVolume());
        System.out.println("Значение с округлением: "
                + roundValue(box.getVolume(), places));
    }

    // округление значения
    private static double roundValue(double value, int places) {
        //if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
