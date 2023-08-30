package Enums.operation;
/*
2.0 PLUS 4.0 = 6.0
2.0 MINUS 4.0 = -2.0
2.0 TIMES 4.0 = 8.0
2.0 DIVIDED_BY 4.0 = 0.5

 */
public enum Operation {
    PLUS {
        double eval(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double eval(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double eval(double x, double y) {
            return x * y;
        }
    },
    DIVIDED_BY {
        double eval(double x, double y) {
            return x / y;
        }
    };

    abstract double eval(double x, double y);

    public static void main(String args[]) {
        double x = 2.0;
        double y = 4.0;
        for (Operation op : Operation.values())
            System.out.println(x + " " + op + " " + y
                    + " = " + op.eval(x, y));
    }
}
