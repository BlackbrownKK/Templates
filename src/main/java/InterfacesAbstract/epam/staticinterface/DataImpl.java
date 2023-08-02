package InterfacesAbstract.epam.staticinterface;

public class DataImpl implements Data {
    public boolean isNull(String str) {
        System.out.println("Null check ");
        return str == null;
    }

    public static void main(String[] args) {
        DataImpl obj = new DataImpl();
        obj.print("");
        obj.isNull("abc");
    }

}
