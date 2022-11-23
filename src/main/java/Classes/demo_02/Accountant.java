package Classes.demo_02;

public class Accountant {

    public static void main(String[] args) {

        String duties = "Manage bookkeeping";

// создание объекта (экземпляра класса)
        Employee bookkeeper = new Employee();

// присваиваем значения переменным экземпляра
        bookkeeper.name = "Alice";
        bookkeeper.position = "accountant";
        bookkeeper.wage = 450;
// запускаем метод показа данных
        bookkeeper.showInfo();

        System.out.println(duties);

    }
}
