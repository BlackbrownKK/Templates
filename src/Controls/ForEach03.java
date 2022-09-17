package Controls;

// Проход по String массиву c continue
public class ForEach03 {

    public static void main(String[] args) {


        String[] arr = {"apple", "orange", "carrot", "potato", "ice cream"};

        int lenArr = arr.length;
        int count = 0;

        for (String str : arr) {
            System.out.println(str);
        }

        // просто разделитель
        System.out.println("--------------------------");

        for (String str : arr) {
            if (str.equals("potato"))
                continue;
            else if (count < lenArr - 2)
                // вывод через ","
                System.out.print(str + ", ");
            else
                System.out.print(str);
            count++;
        }

    }
}
