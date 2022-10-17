package Collection.Task01;

import java.util.ArrayList;
import java.util.List;

public class AppTask01 {
    public static void main(String[] args) {
        String[] dataList = "checkLis/aper/corn/paper/corn/apricots/bread/cleaner/rice/vegetables/salt".split("/");
        Controller<String> stringListDataWork = new Controller<>();
        ArrayList<String> list = new ArrayList<>(List.of(dataList));
        System.out.println(stringListDataWork.countOccurance(list,"corn"));
    }
}
