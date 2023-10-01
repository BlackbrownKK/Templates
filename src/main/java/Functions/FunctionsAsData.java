package Functions;

public class FunctionsAsData {
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {

        public final NoArgFunctions<Person> loadPerson;

        public DataLoader(Boolean idDev) {
            this.loadPerson = idDev ? this::loadPersonFake : this::loadPersonReal;
        }

        private Person loadPersonReal() {
            System.out.println("this is real");
            return new Person("real", 42);
        }

        private Person loadPersonFake() {
            System.out.println("this is fake");
            return new Person("Fake", 18);
        }
    }


    public static void main(String[] args) {
        final Boolean IS_DEV = true;
        DataLoader dataLoader = new DataLoader(IS_DEV);
        System.out.println(dataLoader.loadPerson.apply());

    }
}
