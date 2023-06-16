package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String []args) {
        int[] libraryNum = {108,123,124,235,285,379,456,476,756,998};
        System.out.println("Enter the library card number");
        Scanner scanner = new Scanner(System.in);
        int requiredNum = scanner.nextInt();
        int result = Arrays.binarySearch(libraryNum, requiredNum);
        if (result<0) {
            System.out.println("The entered library card number " + requiredNum + " was not found in the list or you entered an invalid customer library card number.");
        }
        else  {
            System.out.println("The entered library card number " + requiredNum + " was found in the list.\n");
        }
    }
}
