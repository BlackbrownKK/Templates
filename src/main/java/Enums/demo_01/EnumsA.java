package Enums.demo_01;


public class EnumsA {

    // декларация переменной
    // типа класса-перечисления
    static Directions dir;

    public static void main(String[] args) {
        // получение доступа к значению
        // переменной (к константе)
        dir = Directions.EAST;
        // вывод значения
        System.out.println(dir);
    }
}
