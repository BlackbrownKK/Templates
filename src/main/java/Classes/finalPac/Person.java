package Classes.finalPac;

import java.util.ArrayList;

public class Person {
    private final ArrayList friends = new ArrayList<>();
    public ArrayList getFriends() {
        return friends;
    }
    public void addFriend(Person friend) {
        friends.add(friend);
    }
}
