package math;

import static java.lang.Math.round;

public class Math {
    public static void main(String[] args) {
        double a = 15;
        double b = 18;
        System.out.println(java.lang.Math.cbrt(a)); // Возвращает кубический корень из указанного аргумента
        System.out.println(java.lang.Math.sqrt(a));  // Возвращает квадратный корень из указанного аргумента
        System.out.println(java.lang.Math.exp(a)); // Возвращает показатель степени указанного аргумента
        System.out.println(java.lang.Math.expm1(a)); // Возвращает показатель степени указанного аргумента
        System.out.println(java.lang.Math.pow(a, b)); // Возвращает  у в степени х,
        System.out.println(java.lang.Math.abs(a)); // Возвращает абсолютное значение указанного аргумента
        System.out.println(java.lang.Math.ceil(a)); // Возвращает наименьшее целое число, которое больше указанного аргумента или равно ему
        System.out.println(java.lang.Math.floor(a)); // Возвращает наименьшее целое число, которое < указанного аргумента или равно ему
//        System.out.println(java.lang.Math.floorDiv(a,b)); // Возвращает  у в степени х,
        System.out.println(java.lang.Math.max(a, b)); //Возвращает большее из двух чисел
        System.out.println(java.lang.Math.nextDown(a)); //Возвращает следующее значение
        System.out.println(java.lang.Math.nextUp(a)); //Возвращает следующее значение

        float num = 5.25f;
        System.out.println(round(num)); //round – rounding pursuant to the standard math rules: Math.round(5.8) // 6
        System.out.println(java.lang.Math.floor(num)); // floor – rounding down: Math.floor(5.7) // 5
        System.out.println(java.lang.Math.ceil(num)); // ceil – rounding up: Math.ceil(3.3) // 4

        System.out.println();
        System.out.println(2+3);
    }

    public class SideLengths {
        public static double[] otherSides(int n) {
            double a = n * 2;
            double b = round(n * java.lang.Math.cbrt(3));
            double[] result = new double[]{a, b};
            return result;
        }
    }
}
