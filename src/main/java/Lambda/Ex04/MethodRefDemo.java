package Lambda.Ex04;

public class MethodRefDemo {
/*
В этом методе функциональный интерфейс
указывается в качестве типа первого его
параметра. Следовательно, ему может быть
передан любой экземпляр данного интерфейса,
включая и ссылку на метод
*/


    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают "  + "эффективность Java";
        String outStr;
// Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Иcxoднaя строка: " + inStr);
        System.out.println("Oбpaщeннaя строка: " + outStr);

        /*
        В этой строке кода ссылка на статический метод strReverse (),объявляемый
в классе MyStringOps, передается первому аргументу метода stringOp (). И это
вполне допустимо, поскольку метод strReversе() совместим с функциональным интерфейсом
String Funс. Следовательно, в выражении МуStringОрs::strReverse
вычисляется ссылка на объект того класса, в котором метод strReverse () предоставляет
реализацию метода func () из функционального интерфейса StringFunc.
         */
    }
}
