package InterfacesAbstract.epam.cloning;

import java.util.Date;

public class Student  implements Cloneable{ // The class should also implement the Cloneable interface.
    private Date yearSet;
    private int group;
    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
