package Collection.Set.Arrays;

import java.util.Arrays;

public class ArraysMulti02 {

        static String[][] fruits;

    public static void main(String[] args) {

        fruits = new String[][] {
                { "apple", "pear", "plum" },
                { "orange", "lemon", "grape" }
        };

        System.out.println("Array: " + Arrays.deepToString(fruits));

        // Вывод значения строки 2 столбца 3
        System.out.println("Array element is " + fruits[1][2]);
    }
}
