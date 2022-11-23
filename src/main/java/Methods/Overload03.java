package Methods;

public class Overload03 {


    public static void main(String[] args) {

        String name = "Tom";
        String position = "director";
        float salary = 230.5f;

        showInfo(name, position);
        showInfo(name, position);
        showInfo(name, position, salary);

        // Ошибка компиляции. Важен порядок полей!!!
//        showInfo(name, salary, position);

    }

// перегрузка методов

    public static void showInfo(String name) {
        System.out.println("Name: " + name + "\n");
    }

    public static void showInfo(String name, String position) {
        System.out.println("Name: " + name + "\nPosition: "
                + position + "\n");
    }

    public static void showInfo(String name, String position, float salary) {
        System.out.println("Name: " + name +
                "\nPosition: " + position +
                "\nSalary UAH: " + salary);
    }

}
