package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Delete {
    public static void main(String[] args) {
        Path path = Paths.get("Hello.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
        }
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());

         try {

            Files.delete(path);
        } catch (
                IOException e) {
        }
    }
}
