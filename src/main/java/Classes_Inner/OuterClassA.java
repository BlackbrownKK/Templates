package Classes_Inner;

// Определение класса верхнего уровня.
// Внешний/включающий класс.
public class OuterClassA {

    private int value = 8;

    // Определение внутреннего класса.
    //
    // Внутренний класс действует как член включающего класса
    // и может иметь любые модификаторы доступа:
    // abstract, final, public, protected, private, static.
    //
    // Внутренний класс может получить доступ ко всем членам внешнего
    // класса, включая отмеченные как private.
    //
    // Здесь внутренний класс обращается к private переменной
    // внешнего класса.
    class InnerClassA {
        public void showValue() {
            System.out.println("Значение: " + value);
        }
    }
}
