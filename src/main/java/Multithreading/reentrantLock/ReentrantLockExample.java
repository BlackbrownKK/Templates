package Multithreading.reentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);

        // Create two threads for deposit and withdrawal
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                account.deposit(130);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(120);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        depositThread.start();
        withdrawThread.start();

        // Wait for the threads to finish
        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
