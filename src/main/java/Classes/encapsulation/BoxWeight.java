package Classes.encapsulation;

public class BoxWeight extends Box {
    double weight; // вес параллелепипеда


    BoxWeight(BoxWeight ob) {    //   сконструировать клон объекта
        super(ob);
        //передать объект конструктору
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор из суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {

        super(len);
        weight = m;
    }

}





