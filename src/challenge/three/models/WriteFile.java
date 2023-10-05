package challenge.three.models;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    private FileWriter fileWriter;

    public void openFile(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName + ".json");
    }

    public void writeToFile(String content) throws IOException {
        if (fileWriter != null) {
            fileWriter.write(content);
        } else {
            throw new IllegalStateException("File not open.");
        }
    }

    public void closeFile() throws IOException {
        if (fileWriter != null) {
            fileWriter.close();
        } else {
            throw new IllegalStateException("File not open.");
        }
    }
}
