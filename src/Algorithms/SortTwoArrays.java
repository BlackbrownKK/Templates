package Algorithms;

// Одновременная сортировка двух массивов
// (с сортировкой единиц измерения).
// Условие:
// Перечень цен, который должен быть отсортирован по-возрастанию:
// 15,99 грн./шт; 9,99 грн./кг; 15,89 грн./л; 45,55 грн./шт.;
// 26,67 грн./л; 7,79 грн./кг; 18,25 грн./ящ.


public class SortTwoArrays {

    public static void main(String[] args) {

        float[] amount = {15.99f, 9.99f, 15.89f, 45.55f, 26.67f, 7.79f, 18.25f};
//        String[] measures = {"шт", "кг", "л", "шт", "л", "кг", "ящ"};
        String[] measures = {"item", "kg", "l", "item", "l", "kg", "box"};

        int len = amount.length;


        sort(amount, measures);

        for (int i = 0; i < len; i++)
            System.out.println(amount[i] +
                    " UAH/" +
                    measures[i]);
    }

    public static void sort(float[] amount, String[] measures) {

        int len = amount.length;
        float temp;
        String tem;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {

                if (amount[j - 1] > amount[j]) {

                    temp = amount[j - 1];
                    amount[j - 1] = amount[j];
                    amount[j] = temp;

                    tem = measures[j - 1];
                    measures[j - 1] = measures[j];
                    measures[j] = tem;
                }
            }
        }
    }
}
