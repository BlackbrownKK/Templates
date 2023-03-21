package Classes;

public class PBDemo {
    public static void main(String[] args) {


        try {
            ProcessBuilder proc = new ProcessBuilder(
                    "notepad. ехе", "testfile");
            proc.start();
        } catch (Exception е) {
            System.out.println("Oшибкa запуска Notepad.");
        }
    }
}
