package programmingWithJava.GradedLab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public static void createSampleFile(String directory, String fileName, String content) {

        // Ensure directory exists
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Create file inside directory
        File file = new File(dir, fileName);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("File created: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
