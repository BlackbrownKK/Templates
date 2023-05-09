package Collection.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]) {
        // создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        // ввести элементы в древовидное отображение
        tm.put("Джoн Доу", 3434.34);
        tm.put("Toм Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Toд Халл", 99.22);
        tm.put("Paльф Смит", 19.08);
        System.out.println();
        // внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джoн Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
        // получить множество записей
        /*
        В классе TreeMap предоставляются эффективные средства для хранения пар
        "ключ - значение" в отсортированном порядке и обеспечивается их быстрое извлечение.
        Следует, однако, иметь в виду, что, в отличие от хеш-отображения, древовидное
        отображение гарантирует, что его элементы будут отсортированы по порядку
        нарастания ключей.
         */
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
