package Functions.lambda;

public class MainEx01 {
    public static void main(String[] args) {

    GreetingMassage gm = new  GreetingMassage(){
        @Override
        public void greet(String name){
            System.out.println("Hello " + name);
        }
    };
    gm.greet("Poll");
    }
}
