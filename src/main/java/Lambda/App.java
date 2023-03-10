package Lambda;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        List<Map<String, String>> animals = List.of(
                Map.of("name", "Spooky", "animal", "dog"),
                Map.of("name", "Tom", "animal", "cat"),
                Map.of("name", "Jimmy", "animal", "bird"),
                Map.of("name", "Buddy", "animal", "dog"),
                Map.of("name", "Elsa", "animal", "dog"),
                Map.of("name", "Murka", "animal", "cat")
        );
        LambdaFunctions myCollect = new LambdaFunctions();

    }
}
