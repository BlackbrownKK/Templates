package Multithreading.CompleteReferenceEx01;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");

        System.out.println("Пoтoк Один запущен: "
                + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен: "
                + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен: "
                + ob3.t.isAlive());
        // ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        } System.out.println("Пoтoк Один запущен: "
                    + ob1.t.isAlive());
            System.out.println("Пoтoк Два запущен: "
                    + ob2.t.isAlive());
            System.out.println("Пoтoк Три запущен: "
                    + ob3.t.isAlive());
            System.out.println("Глaвный поток завершен.");
        }

    }
