package InterfacesAbstract.epam.ex02;

public class Client extends Base implements Call {
    public void call() {
        System.out.println ("сall() of class Client: NUM = " + NUM);
        super.call();
    }

}
