package DataType.charEx.character;

import static java.lang.Character.*;
import static java.lang.Character.isTitleCase;

public class Char01 {
    public static void main(String[] args) {

        char myChar = 33;
        char vr = 'D';
        System.out.println(isDefined(myChar));
        // Возвращает логическое значение true, если указанный символ задан в Юникоде, а иначе - логическое значение false

        System.out.println(isDigit(myChar)); // true, если указанный символ является цифрой
        System.out.println(isTitleCase(vr)); // true указанный символ является заrлавной буквой,
        System.out.println(codePointAt("myChar", 2));   // Возвращает кодовую точку, находящуюся на заданной поэ.яц.я.я

    }
    /*

     */
}
