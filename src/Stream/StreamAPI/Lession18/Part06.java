package Stream.StreamAPI.Lession18;

import java.util.ArrayList;
import java.util.Optional;

public class Part06 {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        Optional<Integer> reduce = num.stream()
                .map(n -> n + 1)
                .filter(n -> n >= 5)
                .reduce((Integer first, Integer second) -> first + second);

        System.out.println(reduce);

    }
}


