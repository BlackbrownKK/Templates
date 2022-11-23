package Record.demo_05;

// Также возможно добавить статические методы
// к определению Java Record.

public record EmployeeRecord(int id, String name, String position) {

    public static String nameAsUpperCase(EmployeeRecord record) {
        return record.name.toUpperCase();
    }
}
