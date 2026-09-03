package programmingWithJava.ErrorHandling.FileHandlingTask3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateAndWriteFileExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/" + fileName + ".txt");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String fileContents = "Hello World!";
            byte[] fileContentsBytes = fileContents.getBytes();
            outputStream.write(fileContentsBytes);
            System.out.println("Data written to file successgully!");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
