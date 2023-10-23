package Multithreading.tryLock;



public class TryDemo {

    public static void main(String[] args) throws InterruptedException {
        Shopper barron = new Shopper("Barron");
        Shopper olivia = new Shopper("Olivia");
        long start = System.currentTimeMillis();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        long finish = System.currentTimeMillis();
        System.out.println("Time " + (float) (finish - start) / 1000 + " seconds");

    }
}
