package Collection.HashCode;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
//to add elements to the ArrayList, use the add() method:
        users.add(new User("Bob", 23, new Adress("wsx", 11)));
        users.add(new User("Ted", 43, new Adress("qaz", 23)));
        users.add(new User("Gary", 34, new Adress("rfv", 45)));
        users.add(new User("Frady", 27, new Adress("tgb", 52)));
        users.add(new User("Dilon", 26, new Adress("yhn", 65)));
        users.add(new User("Merpfy", 30, new Adress("ujm", 88)));

        System.out.println(users);

    }


}
