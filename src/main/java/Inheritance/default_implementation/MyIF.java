package Inheritance.default_implementation;

public interface MyIF {
    // Это объявление обычного метода в интерфейсе. Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода с реализацией по умолчанию.  Обратите внимание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";

    }
    // Это объявление статического метода в интерфейсе
    static int getDefaultNumber() {
            return 1;
    }

    int defNum = MyIF.getDefaultNumber();
}

//  статические методы из интерфейсов не наследуются ни реализующими их классами, ни подчиненными интерфейсами.
