package Record.demo_02;

// Нет class в синтаксисе, вместо этого record.
// Мы передаем поля в параметрах так же, как в конструкторе.
// Java автоматически узнает, что переданные параметры являются
// полями класса.
//
// Кроме того, шаблонные методы также обрабатываются самой Java.

public record EmployeeRecord(int id, String name, String position) {
}
