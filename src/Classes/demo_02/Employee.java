package Classes.demo_02;

public class Employee {

    String name;
    String position;
    int wage;

    void showInfo() {
        System.out.printf("Name: %s, position: %s, wage: %d%n",
                name, position, wage);
    }
}
