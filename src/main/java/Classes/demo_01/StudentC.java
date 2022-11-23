package Classes.demo_01;

// Создание одного
// переиспользуемого экземпляра.
public class StudentC {

    static Student student;

    public static void main(String[] args){

        student = new Student();

        student.id = 121;
        student.name = "Lucy";
        System.out.println(student.id + " " + student.name);

        student.id = 122;
        student.name = "Tom";
        System.out.println(student.id + " " + student.name);
    }
}
