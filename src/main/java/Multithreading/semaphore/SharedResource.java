package Multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource  {
    private Semaphore semaphore = new Semaphore(3); // Initialize with 3 permits

        public void accessResource() {
            try {
                semaphore.acquire(); // Acquire a permit
                System.out.println(Thread.currentThread().getName() + " is accessing the resource.");
                // Simulate some work
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release(); // Release the permit
                System.out.println(Thread.currentThread().getName() + " has finished and released the resource.");
            }
        }
}
