package Stream.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream("src\\Stream\\Exanple01\\test");
            int a;
            while ( (a = fileInputStream.read()) !=-1) {
                System.out.print(a);
            }
        } catch (IOException a) {
            throw new RuntimeException(a);

        }
    }
}




