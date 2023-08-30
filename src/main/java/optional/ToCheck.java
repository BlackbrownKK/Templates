package optional;

import java.util.Optional;

public class ToCheck {
    public static void main(String[] args) {
        Optional name = Optional.of("John");
        if (name.isPresent()) {
            System.out.println(name.get());
        }

        Optional name2 = Optional.of("John");
        name2.ifPresent(System.out::println);

        Optional name3 = Optional.empty();
        System.out.println(name3.orElse("Blank"));

        Optional name4 = Optional.of("John");
        System.out.println(name4.orElseGet(String::new));

        Optional empty = Optional.empty();
        Object emptyValue = empty.orElseThrow();
    }
}
