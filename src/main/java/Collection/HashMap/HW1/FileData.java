package Collection.HashMap.HW1;

import java.util.Objects;

public class FileData {

    private final String fileName;
    private final double sizeOfFileInBytes;
    private final String pachToFile;

    public FileData(String fileName, double sizeOfFileInBytes, String pachToFile) {
        this.fileName = fileName;
        this.sizeOfFileInBytes = sizeOfFileInBytes;
        this.pachToFile = pachToFile;
    }

    public String getFileName() {
        return fileName;
    }

    public double getSizeOfFileInBytes() {
        return sizeOfFileInBytes;
    }

    public String getPachToFile() {
        return pachToFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileData fileData)) return false;
        return Double.compare(fileData.sizeOfFileInBytes, sizeOfFileInBytes) == 0 && Objects.equals(fileName, fileData.fileName) && Objects.equals(pachToFile, fileData.pachToFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, sizeOfFileInBytes, pachToFile);
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", sizeOfFileInBytes=" + sizeOfFileInBytes +
                ", pachToFile='" + pachToFile + '\'' +
                '}';
    }
}
