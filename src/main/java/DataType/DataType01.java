package DataType;

// Расширение или автоматическое
// преобразование (неявное) типов
public class DataType01 {

    int a, b;

    DataType01(int i, int j) {
        a = 1;
        b = 2;
    }

    void meth(DataType01 о) {
        о.a /= 2;
        о.b *= 2;
    }

    static Integer iOb = 100; // автоупаковка значения типа int
    static int i = iOb; // автораспаковка значения типа int


    public static void main(String[] args) {

        int valueA = 128;

        // автоматическое преобразование типов
        long valueB = valueA;

        // автоматическое преобразование типов
        float valueC = valueB;

        System.out.println("Int value " + valueA);
        System.out.println("Long value " + valueB);
        System.out.println("Float value " + valueC);
        System.out.println(i + " " + iOb);
// выводит значения 100 и 100

/*
        Ключевое слово var
        Слово var ставится вместо типа данных, а сам тип переменной выводится из того значения,
                которое ей присваивается. Например, переменной x присваивается число 10, значит,
            переменная будет представлять тип int.
            Но если переменная объявляется с помощью var, то мы обязательно должны инициализировать ее,
             то есть предоставить ей начальное значение, иначе мы получим ошибку, как, например, в следующем случае:

            var x;      // ! Ошибка, переменная не инициализирована
            x = 10;
 */
        var s = valueB;   // автоматическое подбор типов
    }


}
