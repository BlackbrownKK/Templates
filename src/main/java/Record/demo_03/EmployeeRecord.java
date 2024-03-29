package Record.demo_03;

// Определение типа Java Record  может содержать
// несколько конструкторов.
//
// Дополнительный конструктор объявляется внутри тела
// объявления EmployeeRecord.
// Обратите внимание, как дополнительный конструктор вызывает
// конструктор по умолчанию EmployeeRecord.
// Это требуется компилятору Java, поэтому компилятор знает,
// какие параметры конструктора в дополнительном конструкторе
// соответствуют параметрам конструктора по умолчанию.
//
// Можете добавить столько дополнительных конструкторов,
// сколько имеет смысл.

public record EmployeeRecord(int id, String name, String position) {

    public EmployeeRecord(int id) {
        this(id, null, null);
    }
}
