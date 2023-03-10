package DataType.charEx;

public class EqualsDemo {
    public static void main(String args[]) {
        String s1 = "hello" ;
        String s2 = "hello";
        String s3 = "bye";
        String s4 = "HELLO";
        System.out.println(s1 + " == " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + "  ==  " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + "  ==  " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + "  ==  bez ucheta registra " + s4 + " -> " + s1.equalsIgnoreCase(s4));
    }
}

/*
Привет равно Привет -> true
Привет равно Прощай -> false
Привет равно ПРИВЕТ -> false
Привет равно без учета регистра ПРИВЕТ -> true
 */