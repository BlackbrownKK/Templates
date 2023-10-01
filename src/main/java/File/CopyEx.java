package File;

import DataType.regular_Expressions.ReplacementEx;

import javax.sound.midi.Patch;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyEx {
    // Executing the code: "System.out.println(Files.get("."));" will print the current path.
    public static void main(String[] args) {
        Path seurce = Paths.get(
                "C:\\Users\\Юлия\\Desktop\\Костя Документы\\projects\\Templates\\src\\main\\java\\File\\Hello.txt");
        Path newSeurce = Paths.get("C:\\Users\\Юлия\\Desktop\\Костя Документы\\projects\\Templates\\src\\main\\java\\File\\New.txt");
        try {
            Files.copy(seurce, newSeurce, REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

