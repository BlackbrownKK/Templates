package Stream;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/Stream/filename1.txt");

            if (myObj.createNewFile()) { //Creates an empty file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println(myObj.canRead()); // Tests whether the file is readable or not
            System.out.println(myObj.canWrite()); // Tests whether the file is writable or not
            System.out.println(myObj.exists()); // 	Tests whether the file exists
            System.out.println(myObj.getAbsolutePath()); // Returns the absolute pathname of the file
            System.out.println(myObj.length()); // Returns the size of the file in bytes
            System.out.println(myObj.getName()); //Returns the name of the file
            System.out.println(myObj.list()); // Returns an array of the files in the directory
            myObj.delete(); //	Deletes a file
//            myObj.mkdir(); // Creates a directory
            System.out.println(myObj.canRead()); // Tests whether the file is readable or not
            System.out.println(myObj.canWrite()); // Tests whether the file is writable or not
            System.out.println(myObj.exists());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
