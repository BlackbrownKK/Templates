package Inheritance.extends_intro.demoa;

public class Extends01 {

    public static void main(String[] args) {

// Создание экземпляра суперкласса.
// В параметре конструктора переменная суперкласса.
       Person person = new Person("Анатолий");

// Вызов метода суперкласса через экземпляр суперкласса.
        person.display();

// Создание экземпляра класса-наследника.
// В параметре конструктора переменная суперкласса.
        Employee person1 = new Employee("Соня");
// Вызов метода суперкласса через экземпляр класса-наследника.
        person1.display();

    }
}
