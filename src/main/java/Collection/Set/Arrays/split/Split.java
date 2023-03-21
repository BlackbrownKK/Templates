package Collection.Set.Arrays.split;

import Collection.Task01.Controller;

import java.util.ArrayList;
import java.util.List;

public class Split {
    public static void main(String[] args) {
        String[] shoppingListArray = "checkLis/aper/corn/paper/corn/apricots/bread/cleaner/rice/vegetables/salt"
                .split("/");
        Controller<String> searchShoppingListFunction = new Controller<>();
        ArrayList<String> shoppingListArrayList = new ArrayList<>(List.of(shoppingListArray));
        System.out.println(searchShoppingListFunction.countOccurance(shoppingListArrayList,"corn"));
    }
}
