package Stream.chanal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
// Запись данных в файл через канал
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        // получить канал к файлу в блоке оператора try с ресурсами
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/java/Stream/chanal/test. txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {
// создать буфер
            ByteBuffer mBuf = ByteBuffer.allocate(50);

            // записать некоторое количество байтов в буфер
            for (int i = 0; i < 50; i++)
                mBuf.put((byte) ('1' + i));
            // подготовить буфер к записи данных
            mBuf.rewind();
            // подготовить буфер к записи данных записать данные из буфера в выходной файл
            fChan.write(mBuf);
        } catch (InvalidPathException е) {
            System.out.println("Ошибка указания пути " + е);
        } catch (IOException е) {
            System.out.println("Omибкa ввода-вывода: " + е);
            System.exit(1);
        }
    }
}

/*
Следует отметить одну важную особенность данной программы. Как упоминалось
ранее, после записи данных в буфер байтов mBuf, но перед их записью в файл,
для буфера mBuf вызывается метод rewind ().Это необходимо для обнуления текущей
позиции после записи данных в буфер mBuf. Ведь не следует забывать, что
после каждого вызова метода pu t ( ) для буфера mBu f текущая позиция смещается.
Поэтому текущую позицию необходимо возвратить в начало буфера, прежде
чем вызывать метод wr i t е ( ) . Если не сделать этого, метод wr i t е ( ) не сумеет
обнаружить в буфере никаких данных, посчитав, что их там вообще нет.
 */