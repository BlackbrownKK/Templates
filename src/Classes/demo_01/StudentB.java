package Classes.demo_01;

// Создание нескольких объектов и хранение в них
// информации через ссылочную переменную.
// НО такой подход заполняет память.

public class StudentB {

    public static void main(String[] args){

        // Создание объектов
        Student student1 = new Student();
        Student student2 = new Student();

        // Инициализация объектов
        student1.id = 121;
        student1.name = "Lucy";
        student2.id = 122;
        student2.name = "Tom";

        // Вывод данных
        System.out.println(student1.id + " " + student1.name);
        System.out.println(student2.id + " " + student2.name);
    }
}
