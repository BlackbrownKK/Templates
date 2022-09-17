package Inheritance.extends_intro.demob;

/*
Переменная суперкласса может ссылаться на объект подкласса.

В этом примере объявлено три переменные типа Box, но они указывают
на разные объекты. Для каждого объекта мы можем узнать его ширину,
но при попытке обратиться к переменной color объекта redBox,
возникнет ошибка компиляции.
В чем причина?
Переменная color объявлена в классе ColorBox с уровнем доступа по умолчанию,
класс DemoB находится в том же пакете, то есть переменная color должна
быть доступна. Дело в том, что доступные члены класса определяются типом
ссылочной переменной, а не типом объекта, на который она ссылается.
То есть если переменная объявлена типа Box, нам доступны только члены
объявленные в классе Box (weight, height, depth), и неважно на какой
объект она ссылается. А вот для переменной blueBox мы можем узнать цвет,
так как переменная объявлена как ColorBox.
**/

class Demo02 {

    public static void main(String[] args) {
        Box box = new Box(15, 10, 25);
        Box heavyBox = new HeavyBox(15, 10, 20, 5);
        Box redBox = new ColorBox(25, 12, 20, "красный");

        ColorBox blueBox = new ColorBox(25, 12, 20, "голубой");

        System.out.println("Ширина коробки: " + box.width);
        System.out.println("Ширина тяжелой коробки: " + heavyBox.width);
        System.out.println("Ширина красной коробки: " + redBox.width);
        System.out.println("Ширина голубой коробки: " + blueBox.width);

        System.out.println("Цвет голубой коробки: " + blueBox.color);

////        Здесь могут быть ошибки
//        System.out.println("Цвет красной коробки: " + redBox.color);
//        System.out.println("Вес тяжелой коробки: " + heavyBox.weight);

    }
}
