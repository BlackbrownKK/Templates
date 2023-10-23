package Multithreading.epam;

import java.io.IOException;

public class InputProgramDemo {
    public static void main(String[] args) throws InterruptedException {
        InputProgram i1 = new InputProgram("S1");
        InputProgram i2 = new InputProgram("S1");
        i1.start();
        i2.start();
        Thread.sleep(470);
        InputProgram.aBoolean =false;
        i1.join();
        i2.join();
        System.out.println("i1   = " + i1.value);
        System.out.println("i1   = " + i2.value);
    }
}
