package Enums.operation;

import java.util.Scanner;

/*
10 + 2 = 12
10 - 2 = 8
10 / 2 = 5
10 * 2 = 20
 */
public enum BinaryOperation {
    PLUS("+") {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MINUS("-") {
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    DIVISION("/") {
        public int calculate(int a, int b) {
            return a / b;
        }
    },
    MULT("*") {
        public int calculate(int a, int b) {
            return a * b;
        }
    };

    private String operation;

    public abstract int calculate(int a, int b);

    BinaryOperation(String operation) {
        this.operation = operation;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER X");
        int x = scanner.nextInt();
        System.out.println("ENTER Y");
        int y = scanner.nextInt();
        for (BinaryOperation op : BinaryOperation.values())
            System.out.println(x + " " + op.operation + " " + y
                    + " = " + op.calculate(x, y));
    }
}