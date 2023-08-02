package InterfacesAbstract.epam.ex01;

public class Teacher extends Person{
    private double academiRank;

    public Teacher(int personId, String lastName, double academiRank) {
        super(personId, lastName);
        this.academiRank = academiRank;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append(super.toString()).append("academiRank=").append(academiRank).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
