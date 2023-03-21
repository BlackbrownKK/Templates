package Collection.Set.Arrays;

public class Arrays05 {

    public static void main(String[] args) {
        // создаем массив определенной длины,
        // и заполняем его поиндексно
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "lemon";
        fruits[3] = "pear";
        fruits[4] = "plum";

        // задаем индекс
        int index = 3;

        System.out.println("Element in index " + index + " is " + fruits[index]);

        int arrLength = fruits.length;
        System.out.println("Array length is " + arrLength);
    }
}
