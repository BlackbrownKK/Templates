package Record.demo_05;

public class Main {

    public static void main(String[] args) {

        EmployeeRecord record = new EmployeeRecord(1, "Tom", "manager");

        System.out.println(EmployeeRecord.nameAsUpperCase(record));

    }
}
