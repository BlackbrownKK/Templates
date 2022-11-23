package Enums.demo_01;

// Метод enum valueOf() помогает преобразовать
// строку в экземпляр enum.
public class EnumsG {

    public static void main(String[] args) {
        Directions east = Directions.valueOf("EAST");
        System.out.println(east);
    }
}
