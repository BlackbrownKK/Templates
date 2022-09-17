package Controls;

// Проход по String массиву
public class ForEach02 {

    public static void main(String[] args) {

        String[] products = {"apple", "orange", "carrot", "potato", "ice cream"};

        int arrLen = products.length;
        int count = 0;

        for (String product : products) {
            System.out.println(product);
        }

        // просто разделитель
        System.out.println("--------------------------");

        for (String str : products) {
            // вывод через ","
            if (count < arrLen - 1) System.out.print(str + ", ");
            else System.out.print(str);
            count++;
        }

    }
}
