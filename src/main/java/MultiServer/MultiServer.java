package MultiServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);
        ArrayList<Integer> ports = new ArrayList<>();
        while (true) {

            Socket socketAccept = serverSocket.accept();
            int port = socketAccept.getPort();
            ports.add(port);

            new Thread(() -> {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));
                    String word;

                    BufferedWriter writer =
                            new BufferedWriter(
                                    new OutputStreamWriter(
                                            socketAccept.getOutputStream()));

                    for (int p: ports) {
                        writer.write("Hallo from server");
                        writer.newLine();
                        writer.flush();
                    }

                    while ((word = bufferedReader.readLine()) != null) { // клиент что то отправил и транфорсмирует в текст
                        System.out.println(word);

                    }
                } catch (IOException e) {
                    System.out.println("Connection is broken");
                }
            }).start();
        }

    }
}