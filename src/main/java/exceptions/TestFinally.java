package exceptions;

public class TestFinally {
    static void procA() {
        try {
            System.out.println("Method procA()");
            return;
        } finally {
            System.out.println("Block finally of method procA()");
        }
    }

    static int procB() {
        try {
            System.out.println("Method procB()");
            return 1;
        } finally {
            System.out.println("Block finally of method procB()");
            return 0;
        }
    }

    public static int getInt() {
        //About to return: 10
        //Return value is now: 20
        //In Main: 10

        /*
        The operation students[5] will generate an exception—index out of range. n this block,
        through the return statement, the value 10 is set to return. After which the finally block
        will be executed, in which the value of the variable returnVal changes, but the return
        value does not change. Therefore, the getInt() method will return 10.
         */
        int returnVal = 10;
        try  {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        }  catch (Exception e) {
            System.out.println("About to return: " + returnVal);
            return returnVal; // !!!
        }  finally {
            returnVal  = 20;
            System.out.println("Return value is now: " + returnVal);
        }
        return returnVal;
    }


    public static void main(String[] args) {
        procA();
        System.out.println(procB());

        System.out.println("In Main: " + getInt());
    }
}
