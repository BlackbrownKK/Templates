package Classes.encapsulation;

import java.util.Objects;

public class Box {

    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    // конструктор, применяемый при указании всех размеров
    Box() {
        width = -1; // значение -1 служит для обозначения
        height = -1; // неинициализированного
        depth = -1; //параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume () {
        return width * height * depth;}

    // Теперь в классе BoxWeight полностью реализованы все конструкторы


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 && Double.compare(box.height, height) == 0 && Double.compare(box.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }
}



