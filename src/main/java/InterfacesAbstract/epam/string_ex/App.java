package InterfacesAbstract.epam.string_ex;


public class App {
    public static void main(String[] args) {
        BaseService service = new UpperService();
        String string = "dvjhsduv";
        System.out.println(service.change(string));
        service = new CutService();
        System.out.println(service.change(string));
    }
}
