package Collection.TreeSet;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Comparator<User> comoperator = new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };


        TreeSet<User> users = new TreeSet<>((s,b)   -> s.getName().length() - b.getName().length());
        User alex = new User("Alex", 38);
        User anton = new User("Anton", 33);

        users.add(alex);
        users.add(anton);
        System.out.println(users);
    }
}

