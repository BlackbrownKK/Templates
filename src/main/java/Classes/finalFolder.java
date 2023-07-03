package Classes;

public class finalFolder {

//    private final String lastName; -> error
    private   String lastName; // -> no error

    public finalFolder(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String name) {
        this.lastName = name;
    }
}
