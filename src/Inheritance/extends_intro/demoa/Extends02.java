package Inheritance.extends_intro.demoa;


public class Extends02 {

    public static void main(String[] args) {

// Создание экземпляра класса-наследника.
// В параметре конструктора переменная суперкласса, переменная класса-наследника.
        Employee person1 = new Employee("Соня", "Oracle");
// Вызов метода суперкласса через экземпляр класса-наследника.
        person1.display();
// Вызов метода класса-наследника через экземпляр класса-наследника.
        person1.work();
    }
}
