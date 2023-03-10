package Lambda;

import java.util.Objects;

public class Animals {
    private final String name;
    private final String Spooky;
    private final String animal;
    private final String dog;

    public Animals(String name, String spooky, String animal, String dog) {
        this.name = name;
        Spooky = spooky;
        this.animal = animal;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public String getSpooky() {
        return Spooky;
    }

    public String getAnimal() {
        return animal;
    }

    public String getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", Spooky='" + Spooky + '\'' +
                ", animal='" + animal + '\'' +
                ", dog='" + dog + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return Objects.equals(name, animals.name) && Objects.equals(Spooky, animals.Spooky) && Objects.equals(animal, animals.animal) && Objects.equals(dog, animals.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Spooky, animal, dog);
    }
}
