package InterfacesAbstract.epam.cloning;

import java.util.Date;

public class Main {
    public static void main(String[] arg) throws Exception  {
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);

        ClassA obj1 = new ClassA();
        ClassA obj2 = new ClassA(obj1);
    }
}
