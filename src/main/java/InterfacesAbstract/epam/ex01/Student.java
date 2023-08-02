package InterfacesAbstract.epam.ex01;

public class Student extends Person{
    private double mark;

    public Student(int personId, String lastName, double mark) {
        super(personId, lastName);
        this.mark = mark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString()).append("mark=").append(mark).append('\'');;
        sb.append('}');
        return sb.toString();
    }
}
