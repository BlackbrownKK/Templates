package Multithreading.epam;

public class ChefOliviaApp {
    public static void main(String[] args)throws InterruptedException {
        System.out.println("Baron starts helping");
        Thread olivia = new ChefOlivia();
        System.out.println("state" + olivia.getState());
        System.out.println("Baron tels to Olivia to start");
        System.out.println("state" + olivia.getState());
        olivia.start();
        System.out.println("state" + olivia.getState());
        System.out.println("Baron in process");
        Thread.sleep(1000);
        System.out.println("state" + olivia.getState());
        System.out.println("Baron waits");
        olivia.join();
        System.out.println("finish");
        System.out.println("state" + olivia.getState());

    }
}
