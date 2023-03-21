package DataType.float_and_double;

public class Methods {
    public static void main(String[] args) {


        Double KK = Double.valueOf(1986.00);
        Float UP = Float.valueOf(1987F);
        System.out.println(KK.doubleValue()); // Возвращает значение вызывающего объекта как тип double

        System.out.println(KK.equals(UP));
//        Возвращает логическое значение true, если вызывающий объект типа Float равен объекту FloatObj, а иначе -
//        логическое значение false

        System.out.println(KK.hashCode()); // Возвращает хеш-код вызывающего объекта
        System.out.println(KK.shortValue());
        System.out.println(KK.toString()); // Возвращает строковый эквивалент объекта
        System.out.println(KK.byteValue()); // Возвращает значение вызывающего объекта как byte
        System.out.println(KK.compareTo(KK)); //
        /* Сравнивает числовое значение вызьmающего объекта
        со значением d Возвращает нулевое значение, если
        сравниваемые числовые значения равны; отрицательное
        значение, если вызывающий объект имеет меньшее
        значение; или положительное значение, если вызывающий
        объект имеет большее значение
         */

    }
}
