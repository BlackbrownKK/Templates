package Lambda.Ex02;

public class MainMyNumber {
    public static void main(String[] args) {
       MyNumber myNum;
// использовать лямбда-выражение в контексте присваивания
// Здесь лямбда-выражение просто является
// константным выражением. Когда оно присваивается
// ссылочной переменной myNum, получается экземпляр
// класса, в котором лямбда-выражение реализует
//метод getValue() из функционального
//интерфейса MyNumЬer
        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());
//Лямбда-выражение было ранее присвоено переменной rnyNurn ссылки на функциональный
//интерфейс MyNurnber. Оно возвращает значение константы 123. 45,
//которое получается в результате вызова метода getValue ().
    }

}
