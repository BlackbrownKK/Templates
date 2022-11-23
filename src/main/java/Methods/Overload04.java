package Methods;

// суперкласс для класса Overload04A

public class Overload04 {

// перегрузка методов

    public static void showInfo(String name) {
        System.out.println("Name: " + name + "\n");
    }

    public static void showInfo(String name, String position) {
        System.out.println("Name: " +
                name + "\nPosition: " +
                position + "\n");
    }

    public static void showInfo(String name, String position, double salary) {
        System.out.println("Name: " + name +
                "\nPosition: " + position +
                "\nSalary UAH: " + salary);
    }
}
