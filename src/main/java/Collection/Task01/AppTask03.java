package Collection.Task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTask03 {
    public static void main(String[] args) {
        Integer[] arrayIntArguments = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};
        Controller<Integer> convectorListController = new Controller<>();
        List<Integer> arrayIntArgumentsCollection = new ArrayList<>(Arrays.asList(arrayIntArguments));
        System.out.println(convectorListController.searchingSame(arrayIntArgumentsCollection));
    }
}
