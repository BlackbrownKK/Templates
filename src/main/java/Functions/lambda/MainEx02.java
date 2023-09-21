package Functions.lambda;

public class MainEx02 {
    public static void main(String[] args) {
        GreetingMassage gm = (String name ) -> {
            System.out.println("Hello " + name);
        };

        gm.greet("Qwerty");

        PrintMassage pm = () -> {
            System.out.println("this is the massage");
        };
        pm.print();
    }

}
