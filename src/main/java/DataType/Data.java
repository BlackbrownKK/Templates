package DataType;

public class Data {
    //    String - stores text, such as "Hello". String values are surrounded by double quotes
//    int - stores integers (whole numbers), without decimals, such as 123 or -123
//    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//    boolean - stores values with two states: true or false
    public static void main(String[] args) {


        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum2 = 5 / 8;
        float myFloatNum = 5.99f;
        char myLetter = 'D'; // Character
        boolean myBool = true;
        /*
 static Boolean valueOf(boolean логическое_значение) логическое_значение должно быть равно true или false.

static Boolean valueOf(String логическая_строка)  будет содержать логическое значение true, если логическая_строка содержит символьную
строку" true" (в верхнем или нижнем регистре). В противном случае этот объект
будет содержать логическое значение false.
         */
        String myText = "Hello";

        System.out.println(myText);
        System.out.println(myText.charAt(3));
        double а = 1.47d;
        float b = 1 / 2;

        char chars[] = {'а', 'Ь', 'с'}; // конструктор: String(char chars[]) -> " аЬс ".
        String s = new String(chars);


        char chars1[] = {'а', 'Ь', 'с', 'd', 'е', 'f'}; // -> "cde"
        String s1 = new String(chars, 2, 3);

        // Сцепление строк "Ему 9 лет".
        String age = "9";
        String s2 = "He " + age + " 9.";
        System.out.println(s2); // В данном примере переменная age относится к типу int, а не String
// значение типа int автоматически преобразуется в свое строковое представление в объекте типа String

        String s3 = "четыре: " + 2 + 2; //  четыре: 22
        String s4 = " четыре: " + (2 + 2); //  четыре: 4
    }
    public void data(){

        int i = 3;
        byte b = 1;
        byte b1 = 1 + 2;                // line 1
//        short s = 304111;               // line 2
        short s1 = (short) 304111;      // line 3
//        b = b1 + 1;                     // line 4
        b = (byte)  (b1 + 1);           // line 5
//        b = -b;                         // line 6
        b = (byte) -b;                  // line 7
        b1 *= 2;                        // line 8
//        b = i;                          // line 9
        b = (byte)  i;
        b += i++;
        float f = 1.1f;
        b /= f;
    }

}
//byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	2 bytes	Stores a single character/letter or ASCII values

//   Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double
//
//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte

