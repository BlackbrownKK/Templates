package Collection.HashCode;

import java.util.Objects;

public class User {
    private final String name;
    private final int Age;
    private final Adress adress;



    public User(String name, int age, Adress adress) {
        this.name = name;
        Age = age;
        this.adress = adress;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Age == user.Age && Objects.equals(name, user.name) && Objects.equals(adress, user.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Age, adress);
    }
}
