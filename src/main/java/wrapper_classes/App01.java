package wrapper_classes;

public class App01 {
    public static void main(String[] args) {
        Integer intObject1 = new Integer(100); // old
        Double doubleObject1 = new Double(0.01); // old
        Integer intObject2 = new Integer("100"); // old
        Double doubleObject2 = new Double("0.01"); // old


        Integer intObject3 = Integer.valueOf(11);
        Double doubleObject3 = Double.valueOf(11.1);

        Boolean b = new Boolean("true"); // old
        Boolean b1 = new Boolean("false"); // old
        Boolean b2 = Boolean.valueOf("no true");
        Boolean b3 = Boolean.TRUE;
        Boolean b4 = new Boolean("True"); // old
        System.out.println(b + ", " + b1 + ", " + b2 + ", " + b3 + ", " + b4);
        System.out.println("logicalAnd = " + Boolean.logicalAnd(b1,b2));

        String str = "11";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
