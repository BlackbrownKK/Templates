package MultiServer.ServerHillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    private final Map<String, PrintWriter> cliens = new HashMap<>();
    private final ServerSocket server;
    private int nunberOfClients = 0;

    public Server(int port) throws IOException {
        this.server = new ServerSocket(port);
    }

    public void startHost() {
        new Thread(processConnections()).start();
    }

    private Runnable processConnections() {
        return () -> {
            while (true) {
                try {
                    Socket accept = server.accept();
                    nunberOfClients++;
                    this.messageAll(this.generateName() + "has connection");
                    cliens.put(this.generateName(), new PrintWriter(accept.getOutputStream(), true));
                    this.clientProcessor(accept);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }
    private void clientProcessor(Socket accepted) {

        new Thread(() ->{
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(accepted.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println(message);
                    if (message.equals("exit")) break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private String generateName() {
        return "user" + this.nunberOfClients;
    }

    public void messageAll(String message) {
        this.cliens.forEach((k, v) -> {
            v.println(message);
            v.flush();
        });
    }
}
