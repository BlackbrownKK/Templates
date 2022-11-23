package Classes.demo_01;

// Инициализация объекта через ссылочную переменную.

public class StudentA {

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 153;
        student.name = "Tom";
        System.out.println(student.id + " " + student.name);

    }
}
