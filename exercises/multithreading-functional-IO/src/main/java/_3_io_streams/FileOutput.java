package _3_io_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput implements FileOutputInterface {
    
    @Override
    public void writeToFile(String fileName, String data) throws IOException {
        File file = new File(fileName);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("Data written to file: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
    }

    @Override
    public void appendToFile(String fileName, String data) throws IOException {
        File file = new File(fileName);
        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("Data appended to file: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
    }

    @Override
    public void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        boolean created = file.createNewFile();
        if (created) {
            System.out.println("File created: " + fileName);
            System.out.println(file.getPath());
        } else {
            System.err.println("File already exists: " + fileName);
            System.out.println(file);
        }
    }
}
