package Classes.demo_02;

public class Chief {

    public static void main(String[] args) {

// создание объекта (экземпляра класса)
        Employee director = new Employee();
// присваиваем значения переменным экземпляра
        director.name = "Tom";
        director.position = "director";
        director.wage = 500;
// запускаем метод показа данных
        director.showInfo();
    }
}
