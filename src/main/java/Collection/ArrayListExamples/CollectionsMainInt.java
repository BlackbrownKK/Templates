package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;  // Import the Collections class

public class CollectionsMainInt {

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        myNumbers.set(1, myNumbers.get(2)+1);
        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.println(myNumbers.get(i));
        }

        System.out.println(myNumbers.size());  // size
        System.out.println(myNumbers.get(0));  // get
        myNumbers.set(0, 11); // set
        myNumbers.remove(0); // remove
        Collections.sort(myNumbers);  // Sort myNumbers
        System.out.println(myNumbers);
        Integer myNumbersArray[] = new Integer[myNumbers.size()]; // create array correct size
        myNumbersArray = myNumbers.toArray(myNumbersArray);  // ArrayList to Array
        System.out.println(myNumbersArray[3]);
        // суммировать элементы массива
        int sum = 0;
        for(int i : myNumbersArray) sum += i; // sum
        System.out.println("Cyммa: " + sum);
        myNumbers.clear(); // clear
    }
}
