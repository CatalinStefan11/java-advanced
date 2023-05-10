package _3_io_streams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutput fileOutput = new FileOutput();
        String fileName = "output.txt";
        String data = "Hello world!";

        try {
            fileOutput.createFile(fileName);
            fileOutput.writeToFile(fileName, data);
            fileOutput.appendToFile(fileName, "\nHow are you today?");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
