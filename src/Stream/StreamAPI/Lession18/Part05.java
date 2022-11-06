package Stream.StreamAPI.Lession18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Part05 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(41);
        num.add(5);
        num.add(6);

        List<Integer> collect = num.stream()
                .map(n -> n + 1)
                .filter(n -> n > 5)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
