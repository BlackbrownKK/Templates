package iterator.arrayInerator;


import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");

        Iterator<String> it = a.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }
    }
}
