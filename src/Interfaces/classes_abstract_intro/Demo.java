package Interfaces.classes_abstract_intro;

class Demo {

    static Transport plane;
    static Transport lorry;
    static Lorry lorry2;

    public static void main(String[] args) {

        // Создаем объект Plane,
        // переменная plane типа Transport.
        // вызываем необходимые методы.
        plane = new Plane();
        // Вызываем необходимые методы.
        plane.run();
        plane.changeSpeed();

        // Создаем объект Lorry,
        // переменная lorry типа Transport.
        // вызываем необходимые методы.
        lorry = new Lorry();
        // Вызываем необходимые методы.
        lorry.run();
        lorry.changeSpeed();

        // ОШИБКА компиляции!
        // Метода pickUpSpeed() в классе Transport нет.
//        lorry.pickUpSpeed();

        // ТОГДА
        // Создаем объект Lorry,
        // переменная lorry типа Lorry.
        lorry2 = new Lorry();
        lorry2.pickUpSpeed();

    }
}
