package Collection.TreeSet;

import java.util.Objects;

public class User {
    private final String name;
    private final int Age;

    public User(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
