package Stream.StreamAPI.Lession18.PersonExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Max", 18),
                new Person("Max", 1),
                new Person("Max", 2),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12),
                new Person("Mavid", 12));

        personList
                .stream()
                .filter(o -> o.name.equals("Max"))
                .filter(i -> i.age < 5)
                .sorted(Comparator.comparingInt(p -> p.age))
                .forEach(System.out::println);
    }
}

//          personList
//                  .stream()
//                  .filter(o -> o.name.equals("Max"))
//                  .filter(i -> i.age < 5)
//        .forEach(System.out::println);


//        List<Person> filtered = personList
//                .stream()
//                .filter(p -> p.name.startsWith("M"))
//                .collect(Collectors.toList());
//        System.out.println(filtered);
