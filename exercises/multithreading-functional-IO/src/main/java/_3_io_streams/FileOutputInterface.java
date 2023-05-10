package _3_io_streams;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileOutputInterface {
    void writeToFile(String fileName, String data) throws IOException;
    void appendToFile(String fileName, String data) throws IOException;
    void createFile(String fileName) throws IOException;
}
