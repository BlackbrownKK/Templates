package Classes_Inner;

import java.util.Arrays;
import java.util.Comparator;

public class TestClassK {

    public static void main(String[] args) {
        // используйте оба имени класса
        OuterClassK.NestClass nest = new OuterClassK.NestClass();
        nest.showData();


        String[] arr = {"java", "scala", "fortran", "ada", "modula"};

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String) o1;
                String str2 = (String) o2;
                return str2.compareTo(str1);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
