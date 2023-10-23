package Multithreading.epam;

import java.io.IOException;

public class InputProgram extends Thread {

    public   int value = 0;
    public static boolean aBoolean = true;

    public InputProgram(String name) {
        this.setName(name);
    }

    public void run() {
        while (aBoolean) {
            System.out.println(this.getName() + " running... !");
            value++;
        }
    }
}



