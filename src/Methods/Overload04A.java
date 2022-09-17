package Methods;


// наследование
public class Overload04A extends Overload04 {

    public static void main(String[] args) {
        String name = "Tom";
        String position = "director";
        double salary = 230.5;

// вызов методов из класса OverloadD
        showInfo(name);
        showInfo(name, position);
        showInfo(name, position, salary);
    }
}
