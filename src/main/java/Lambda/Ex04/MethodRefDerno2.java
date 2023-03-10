package Lambda.Ex04;

public class MethodRefDerno2 {
    /*
В этом методе функциональный интерфейс
указывается в качестве типа первого его
параметра. Следовательно, ему может быть
передан любой экземпляр этого интерфейса,
включая и ссылку на метод
     */

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают " + "эффективность Java";
        String outStr;

// создать объект типа MyStringOps
        NonStaticMyStringOps nonStaticMyStringOps = new NonStaticMyStringOps();
        // А теперь ссылка на метод экземпляра strReverse() передается методу stringOp()
        outStr = stringOp(nonStaticMyStringOps::strReverse, inStr);
        System.out.println("Иcxoднaя строка: " + inStr);
        System.out.println("Oбpaщeннaя строка: " + outStr);

        /*
        Эта версия программы выводит такой же результат, как и предыдущая ее
версия. Обратите внимание в данном примере программы на то, что метод str
Reverse () теперь объявляется в классе MyStringOps как метод экземпляра.
А в теле метода main () создается экземпляр strOps класса MyStringOps. Этот
экземпляр служит для создания ссылки на свой метод strReverse () при вызове
метода s tr ingOp ( ) , как еще раз показано ниже. В данном примере метод экземпляра
strReverse () вызывается для объекта strOps.

имя_класса::имя_метода_экземпляра

         */
    }
}
