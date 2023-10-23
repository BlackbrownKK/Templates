package Multithreading.epam;

public class ChefOlivia extends Thread {
    public void run() {
        System.out.println("she started...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("She finished");
    }
}
