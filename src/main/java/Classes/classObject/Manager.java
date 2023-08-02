package Classes.classObject;

public class Manager extends Person {
    int bonus;

    public String toString()    {
        return super.toString()
                + " [bonus=" + bonus
                + "]";
    }
}
