package Inheritance.methods_override.demoa;

public class Demo01 {

    public static void main(String[] args) {

        String mName = "Alice";
        String mCompany = "Oracle";

        Employee employee = new Employee(mName, mCompany);
        employee.display();

    }
}
