package Record.demo_04;

// Можно добавить методы экземпляра в определение
// Java Record точно так же, как и в случае с
// обычным классом Java.

 public record EmployeeRecord(int id, String name, String position) {
     public String asUpperCase () {
         return position ().toUpperCase();
     }
}