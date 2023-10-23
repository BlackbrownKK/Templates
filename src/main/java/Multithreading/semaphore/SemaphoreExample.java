package Multithreading.semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create multiple threads to access the shared resource
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(() -> {
                resource.accessResource();
            });
            thread.start();
        }
    }
}
