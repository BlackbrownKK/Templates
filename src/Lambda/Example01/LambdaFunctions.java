package Lambda.Example01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaFunctions {

    public static List<String> getPetNames(List<Map<String, String>> animals, String animal) {
        return animals.stream()
                // Сначала отфильтруем всех питомцев, например только собак
                // Метод filter принимает в качестве параметра Predicate
                // Лямбда принимает вид питомца и возвращает true, если оно совпадает с требуемым
                .filter(pet -> pet.get("animal").equals(animal))
                // Затем сделаем отображение, оставим только имя питомца
                // Метод map принимает на вход Function
                // Она принимает текущий элемент стрима и возвращает новый измененный
                .map(pet -> pet.get("name"))
                // Сортируем имена
                // Метод sorted принимает на вход Function
                // Лямбда принимает два соседних элемента стрима и возвращает 1, 0 или -1
                // в зависимости от того, больше ли первый элемент чем второй, равен или меньше
                .sorted((name1, name2) -> name1.compareTo(name2))
                .collect(Collectors.toList());
    }
}