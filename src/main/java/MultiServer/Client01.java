package MultiServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket(InetAddress.getLocalHost(), 8085);) {

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                printWriter.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

