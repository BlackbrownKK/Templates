package Lambda.Hillel;


import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(123);
        arrayList.add(13432);
        arrayList.add(2);
        arrayList.add(14);
        arrayList.add(21);

        arrayList.forEach(s ->{
            System.out.println(s);
        });
    }
}
