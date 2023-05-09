package File;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File f1 = new File("src/main/java/File/COPYRIGHT.txt");
        f1.createNewFile();
        System.out.println("Имя файла: " + f1.getName());
        System.out.println("Путь: " + f1.getPath());
        System.out.println("Абсолютный путь: " + f1.getAbsolutePath());
        System.out.println("Родительский каталог: " + f1.getParent());
        System.out.println(f1.exists() ? "существует" : "не существует");
        System.out.println(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        System.out.println(f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        System.out.println(f1.isDirectory() ? "является каталогом" : "не является каталогом");
        System.out.println(f1.isFile() ? "является обычным файлом" : "может быть именованным каналом");
        System.out.println(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        System.out.println("Последнее изменение в файле: " + f1.lastModified());
        System.out.println("Размер: " + f1.length() + " байт");
        System.out.println("Kaтaлor " + f1.isDirectory());
         f1.delete();
    }
}
