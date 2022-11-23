package DataType;

public class DataType05 {

    public static void main(String[] args) {

        byte b1 = 23;
        byte b2 = -12;

        // ОШИБКА компиляции!
        // Несовместимость типов, результат операции тип int, а не short,
        // поскольку в арифметических выражениях с переменными типа byte
        // вычисления выполняются как с типом int.
//         short res = b1 + b2;
//         System.out.println("value = " + res);


        // РЕШЕНИЕ:
        // 1) приведение выражения к short
        short res1 = (short) (b1 + b2);
        System.out.println("value = " + res1);
        // 2) изменение типа результата на int
        int res2 = b1 + b2;
        System.out.println("value = " + res2);

        // В выражениях совмещенного присваивания (+=,-=,*=,/=)
        // приведение происходит автоматически.
        b1 += b2; // <- запись аналогична  b1 = b1 + b2;
        System.out.println("value = " + b1);

    }
}
