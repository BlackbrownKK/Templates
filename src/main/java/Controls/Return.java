package Controls;

public class Return {
// завершающий вызов метода println () не выполняется. Сразу
//после выполнения оператора return управление возвращается вызывающему
//объекту.


    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Дo возврата.");
        if (t) return; // возврат в вызывающий код
        System.out.println(
                "Этот оператор выполняться не будет.");
    }
}
