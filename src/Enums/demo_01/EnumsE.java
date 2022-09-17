package Enums.demo_01;

// Метод values() возвращает массив, содержащий
// все значения перечисления.
public class EnumsE {

    public static void main(String[] args) {
        // Применение for для вывода
        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }

        for (Directions dir : Directions.values()) {
            System.out.println(dir.ordinal());
        }
    }
}
