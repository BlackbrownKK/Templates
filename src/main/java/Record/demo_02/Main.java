package Record.demo_02;

public class Main {

    public static void main(String[] args) {

        EmployeeRecord record = new EmployeeRecord(1, "Tom", "manager");

        // Java автоматически создала getter-методы
        // с тем же именем, что и у наших полей.
        // Кроме того, методы toString() и hashCode()
        // также автоматически реализуются Java.

        System.out.println(record.id() + "\n" +
                record.name() + "\n" +
                record.position());

    }
}
