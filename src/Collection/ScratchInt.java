package Collection;

import java.util.HashMap;
import java.util.Map;

public class ScratchInt {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 5, 2, 5};

        // Посчитать сколько раз каждое значение встречается в массиве
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : a) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        System.out.println(counter);  // Вывод: {1=1, 2=3, 3=1, 5=2}
        // т.е. 1 встретилось 1 раз, 2 - 3 раза, 3 - 1 раз, 5 - 2 раза

        // Посчитать количество значений, которые встречаются чаще одного раза
        int count = 0;
        for (int value : counter.values()) {
            if (value > 1) {
                count++;
            }
        }

        System.out.println(count); // Вывод: 2
    }
}
