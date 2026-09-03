package programmingWithJava.ErrorHandling.FileHandlingTask;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
    File myFile = new File("C:\\Users\\sacam\\IdeaProjects\\StartCoding\\src\\programmingWithJava\\ErrorHandling\\FileHandlingTask\\file.txt");

        try (BufferedReader inputStream = new BufferedReader(new FileReader(myFile))) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);

            }

            if (myFile.exists()) {
                System.out.println("The file is accessible");
            } else {
                System.out.println("The file does not exist");
            }

        }  catch(FileNotFoundException fileNotFoundException){
            System.err.println("File not found!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }}

