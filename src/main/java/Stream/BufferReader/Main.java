package Stream.BufferReader;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/Stream/BufferReader/Test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().forEach(System.out::println);
fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        try (FileInputStream fileInputStream = new FileInputStream("src/Stream/BufferReader/Test.txt")) {
//            int a;
//            while ((a = fileInputStream.read()) != -1) {
//                System.out.print((char)a);
//            }
//
//        } catch (IOException e) {
//            System.out.println("cannot find file!");
//        }

    }
}
