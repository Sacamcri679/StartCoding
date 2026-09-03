package programmingWithJava.InputOutputStreams.Lab1;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class FileManager {
    //Define the copyFile method with 2 parameters: sourcePath and target Path
    public static void copyFile(String sourcePath, String targetPath) {
        //Convert the sourcePath String into a Path object
        Path source = Paths.get(sourcePath);

        //Convert the targetPath String into a Path Object
        Path target = Paths.get(targetPath);

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

            //Print a message indicating that the file has been successfully copied
            System.out.println("File has been successfully copied from " + sourcePath + " to " + targetPath);
        }catch (IOException e){
            //error message if there is an IOExeption
            System.out.println("Failed to copy the file: " + e.getMessage());
            //print the stack trace of the exception for debugging purposes
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //Specify the source and target file paths
        String sourcePath = "C:\\Users\\sacam\\IdeaProjects\\StartCoding\\src\\programmingWithJava\\InputOutputStreams\\Lab1\\textFile1.txt";
        String targetPath = "C:\\Users\\sacam\\IdeaProjects\\StartCoding\\src\\programmingWithJava\\InputOutputStreams\\Lab1\\textFile1.txt";

        //Call the Copyfile method with the specified source and target paths
        copyFile(sourcePath, targetPath);
    }
}
