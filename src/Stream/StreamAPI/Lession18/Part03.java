package Stream.StreamAPI.Lession18;

import java.util.ArrayList;

public class Part03 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(41);
        num.add(5);
        num.add(6);

        Integer intenger = num.stream()
                .map(s -> s * 2)
                .filter(s -> s > 5)
                .findFirst().get();  //  вытаскивает первый элемент стрима:
        System.out.println(intenger);

        Integer intenger2 = num.stream()
                .map(s -> s * 2)
                .filter(s -> s > 5)
                .findAny().get();  //  вытаскивает первый элемент стрима:
        System.out.println(intenger2);
    }
}
