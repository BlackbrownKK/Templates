package Stream.StreamAPI.Lession18;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Part07 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("I");
        strings.add("love");
        strings.add("you");
        strings.add("!");

                String collect = strings.stream()
                        .collect(Collectors.joining(" "));
        System.out.println(collect);


    }
}
