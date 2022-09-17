package Inheritance.extends_intro.demoa;

/**
 * Класс Employee наследуется от класса Person.
 * Класс Employee - наследник/потомок/производный/подкласс.
 * Класс Person - суперкласс/базовый/родительский.
 * Класс-наследник через ключевое слово super получает доступ
 * к полям суперкласса.
 * Ключевое слово super используется когда подклассу требуется
 * сослаться на его непосредственный суперкласс.
 * Вызов метода super() должен быть всегда в первом операторе,
 * выполняемом в теле конструк                тора подкласса.
 * */

public class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

/*
Далее класс-наследник содержит свое поле,
конструктор для доступа к полю суперкласса и собственному
полю.
**/

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

// метод класса-наследника
    public void work() {
        System.out.printf("%s работает в %s%n",
                getName(), company);
    }
}
