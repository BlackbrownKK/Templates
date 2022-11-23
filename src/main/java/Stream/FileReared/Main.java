package Stream.FileReared;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader("src/Stream/FileReared/Test.txt");

            char[] ints = new char[50];
            fileReader.read(ints);
            System.out.println(ints);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
