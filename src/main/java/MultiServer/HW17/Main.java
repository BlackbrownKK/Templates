package MultiServer.HW17;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  throws IOException { //not a very good idea to throw exceptions from the main function
        Server server = new Server(8085);
        server.startServer();
    }
}

