package MultiServer.ServerHillel;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        Server server = new Server(8000);
         server.startHost();
         String message;
         while (!(message = scanner.next()).equals("exit")){
             System.out.println("Hallo");
             server.messageAll(message);
         }
    }
}
