package Inheritance.methods_override.demob;

/*
Создается массив типа Figure, который будет содержать объекты типа Figure,
Triangle и Rectangle. Подсчитаем площадь для каждого элемента перебирая
элементы массива и вызывая метод area() для каждого элемента.
Все равно какого типа объект - у каждого есть вызываемый метод area().
JVM с помощью динамической диспетчеризации выбирает нужный вариант метода,
основываясь на реальном типе объекта.
**/


public class FindArea {

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        figures[0] = new Figure(10, 10);
        figures[1] = new Rectangle(10, 10);
        figures[2] = new Triangle(10, 10);

        for (Figure figure : figures) {
            figure.area();
        }
    }
}
