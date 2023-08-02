package InterfacesAbstract.epam.ex01;

public abstract class Person {
    private int personId;
    private String lastName;

    public Person(int personId, String lastName) {
        this.personId = personId;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("personId=").append(personId);
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
