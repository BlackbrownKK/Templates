package Collection.Task01;

import java.util.*;

public class SwapEven {

    /*
    PriorityQueue   (First-In-First-Out)   get -  peek()); get + remove  -  poll();
    Queue + LinkedList   (First-In-First-Out)   get -  peek()); get + remove  -  poll();
    Stack           (Last-In-First-Out)     put -  push(); get + remove -  pop();  get -  peek()
     */
    static int[] even = new int[]{100, 2, 3, 2, 6, 9, 4, 8, 4, 54}; //   54, 4, 3,  1, 33, 8, 2, 100;

    public static void main(String[] args) {
        swapEven(even);
//        for (int n : even) {
//            System.out.println(n);
//        }
    }

    public static void swapEven(int[] array) {
        if (array == null || array.length == 0) {
            array = new int[1];
            array[0] = 0;
        } else {

            Queue<Integer> queue = new LinkedList<>(); // create new collection for first part array
            Stack<Integer> stack = new Stack<>(); // create new collection for second part array

            for (int num : array) { // recording data to the new collections
                queue.add(num);
                stack.push(num);
            }

            int cicle;
            if (array.length % 2 == 0) cicle = array.length / 2;
            else {
                cicle = (array.length - 1) / 2;
            }


            Queue<Integer> queue2 = new LinkedList<>(); // create new collection for first part result
            Stack<Integer> stack2 = new Stack<>(); // create new collection for first second result

            for (int i = 0; i < cicle; i++) {

                if (queue.peek() % 2 == 0 && stack.peek() % 2 == 0) { // check if both elements are even
                    queue2.add(stack.pop()); // add to other collections, when doth elements are even + remove
                    stack2.push(queue.poll()); // add to other collections, when doth elements are even + remove
                } else {
                    queue2.add(queue.poll()); // add to this new collections, when doth elements are even + remove
                    stack2.push(stack.pop()); // add to this new collections, when doth elements are even + remove
                }
            }

            for (int num : queue2) {
                System.out.print("[" + num + "]");
            }
            System.out.println();
            for (int num : stack2) {
                System.out.print("[" + num + "]");
            }
            System.out.println();


            for (int i = 0; i <= cicle - 1; i++) { // adding to array the result
                array[i] = queue2.poll();
            }
            for (int i = array.length - cicle; i <= array.length - 1; i++) {
                array[i] = stack2.pop();
            }

        }
    }
}
