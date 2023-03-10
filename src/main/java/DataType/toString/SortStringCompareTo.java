package DataType.toString;

public class SortStringCompareTo {
    static String arr[] = {"now", "the", "best", "time", "to", "study"};

// сравнение символьныхстрок в методе compareTo ( ) compareToignoreCase - без учета регистра

    public static void main(String[] args) {

        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                    System.out.println(arr[j]);

                }
            }
        }

        String a1 = "now";
        String a2 = "there";
        System.out.println(a1.compareTo(a2));
    }
}

