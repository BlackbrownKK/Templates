package Multithreading.readWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create multiple reader threads
        for (int i = 0; i < 5; i++) {
            Thread readerThread = new Thread(() -> {
                for (int j = 0; j < 3; j++) {
                    resource.readData();
                }
            });
            readerThread.start();
        }

        // Create a writer thread
        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                resource.writeData(i + 1);
            }
        });
        writerThread.start();
    }
}
