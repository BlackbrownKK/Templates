package Arrays;

import java.util.Arrays;

public class Arrays06 {

    // объявление массива вне метода main
    static String[] fruits;

    public static void main(String[] args) {
        // инициализация массива, объявленного вне метода main
        fruits = new String[]{"orange", "mango", "kiwi", "apple"};

        System.out.println("Array: " + Arrays.toString(fruits));

        // последний элемент массива
        String lastValue = fruits[fruits.length - 1];
        System.out.println("Last element is " + lastValue);


        for (String str : fruits) {
            str = "qaz";
        }
        System.out.println(Arrays.toString(fruits));
    }
}
