package Collection.stack;
import java.util.*;

public class Stack {
    public static void main(String args[])
    {
        // Creating an empty Stack
        java.util.Stack<String> STACK = new java.util.Stack<>();

        // Use push() to add elements into the Stack
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + STACK.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + STACK);
    }
}