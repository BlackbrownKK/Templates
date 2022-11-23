package Stream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/Stream/OutputStream/Test.txt", true);
            String message = "\n new line here!";

            fileOutputStream.write(message.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
