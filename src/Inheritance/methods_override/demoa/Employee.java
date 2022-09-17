package Inheritance.methods_override.demoa;


public class Employee extends Person {

    private final String company;

    public Employee(String name, String company) {
// Обращение к суперклассу через super().
        super(name);
        this.company = company;
    }

// Переопределение метода.
// Присутствует опциональная аннотация @Override.
    @Override
    public void display() {

// Вывод данных через обращение к методу суперкласса.
        System.out.printf("Name: %s%n", getName());

// Вывод данных через super().
       //super.display();
        System.out.printf("Works at %s%n", company);
    }
}
