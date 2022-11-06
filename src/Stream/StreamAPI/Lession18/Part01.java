package Stream.StreamAPI.Lession18;

import java.util.ArrayList;

public class Part01 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(41);
        num.add(5);
        num.add(6);

        num.stream().map(s -> s*2).forEach(System.out::println);
    }
}