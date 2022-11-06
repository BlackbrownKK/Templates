package Stream.FileWriter;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/Stream/FileWriter/Test.txt");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
            printWriter.write("the weather was good!");
            printWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
