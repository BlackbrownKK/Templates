package Enums;

import java.util.Arrays;

public class Examples {

    public enum Season { WINTER, SPRING, SUMMER, FALL }

    public static void main(String[] args) {

        Season variable = Season.SPRING;
        System.out.println(variable.toString()); //SPRING
        System.out.println(Season.class.getSuperclass()); //class java.lang.Enum

        System.out.println(Season.WINTER.name()); //WINTER
        System.out.println(Season.WINTER.ordinal()); // 0

        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons)); //[WINTER, SPRING, SUMMER, FALL]

        System.out.println(Season.valueOf("WINTER").ordinal()); //0

        System.out.println(Season.SPRING.compareTo(Season.WINTER)); //1
        System.out.println(Season.SPRING.compareTo(Season.SPRING)); //0
        System.out.println(Season.SPRING.compareTo(Season.SUMMER)); //-1
        System.out.println(Season.WINTER.compareTo(Season.SUMMER)); //-2

        boolean isEqualToItself = Season.WINTER.equals(Season.WINTER);
        boolean isEqualToDifferentSeason = Season.WINTER.equals(Season.SUMMER);
        System.out.println(isEqualToItself);
        System.out.println(isEqualToDifferentSeason);

        int hashOfWinter = Season.WINTER.hashCode();
        int hashOfSummer = Season.SUMMER.hashCode();
        System.out.println(hashOfWinter);
        System.out.println(hashOfSummer);


        System.out.println("---------------------------");

        for (DocumentStatus docSt : DocumentStatus.values()) {
            System.out.println("Name = " + docSt.name() +
                    ", statusCode is = " + docSt.getStatusCode() );
        }

        System.out.println("---------------------------");
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.WINTER);
        System.out.println(Season2.FALL);
    }

}
