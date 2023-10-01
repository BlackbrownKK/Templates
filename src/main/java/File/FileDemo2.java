package File;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
    public static void main(String[] args) {
        FilenameFilter filenameFilter = (file, fileName)-> {
            return fileName.contains(".");
        };


        String[] contend = new File(".").list(filenameFilter);
        for (String file : contend) {
            System.out.println(file);

            new File("My directoty").mkdir();
/*
.git
.idea
filename.txt
filename1.txt
pom.xml
src
target
 */

        }
    }
}
