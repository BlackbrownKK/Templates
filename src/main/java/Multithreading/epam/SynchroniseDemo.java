package Multithreading.epam;

public class SynchroniseDemo {
    public static void main(String[] args) throws InterruptedException{
        Thread barron = new Synchronise3();
        Thread olivia = new Synchronise3();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        //System.out.println("we should bue " + Synchronise.garlicCount + " garlics");
        System.out.println("we should bue " + Synchronise3.garlicCount + " garlics");
    }
}
