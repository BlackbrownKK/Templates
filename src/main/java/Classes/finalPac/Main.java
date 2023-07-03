package Classes.finalPac;

import java.util.ArrayList;

public class Main extends Person{

    public static void main(String[] args) {

        Person man1 = new Person();
        Person man2 = new Person();
        Person man3 = new Person();
        man3.addFriend(man1);
        man3.addFriend(man2);
        man3.addFriend(man3);
        System.out.println(man3.getFriends());
    }
}
