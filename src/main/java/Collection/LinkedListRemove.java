package Collection;

import java.util.Iterator;
import java.util.List;

public class LinkedListRemove {
    public static void main(String[] args) {


        List<Integer> arr = new java.util.LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Iterator<Integer> iterator = arr.iterator();

        iterator.next();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}