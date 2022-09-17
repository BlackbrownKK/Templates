package DataType;

// Сужающее или явное преобразование типов.
// Приведение типов - явное преобразование типов.
public class DataType02 {

    public static void main(String[] args) {

        double valueA = 129.57;

        // явное преобразование типов
        long valueB = (long) valueA;

        // явное преобразование типов
        int valueC = (int) valueB;
        System.out.println("Double value " + valueA);

        // потеря дробной части
        System.out.println("Long value " + valueB);

        // потеря дробной части
        System.out.println("Int value " + valueC);

        // ОШИБКА компиляции!
        // char и int - несовместимые типы. int, по диапазону, больше, чем char.
        // Здесь, попытка записать большее в меньшее. Есть риск потерять информацию,
        // сохраненную в переменной num. Компилятор против.
//        int num = 87;
//        char valueD;
//        valueD = num;

        // РЕШЕНИЕ: приведение типа
        int num = 87;
        char valueD;
        valueD = (char) num;
        System.out.println(valueD);
    }
}
