package MultiServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8085);) {

            Socket accept = serverSocket.accept();  // жди когда подконестятся кто то , если 3 раза то я жду 3-х клиентов
            // Socket = объект, с него получаем стрим, inStream или outStream

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            String word;

            while ((word = bufferedReader.readLine()) != null) { // клиент что то отправил и транфорсмирует в текст
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("Connection is broken");
        }
    }
}
