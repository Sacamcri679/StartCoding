package programmingWithJava.ErrorHandling.ExceptionTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {

        int firstNumber;
        int secondNumber;

        int add() {
            return firstNumber + secondNumber;
        }
        // can use the throws method to show the complier you know about
        // the error but it will be handled in the main mathod
       /* void readNumbersFromFile() throws FileNotFoundException {
            Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
            int firstNumber = fileScanner.nextInt();
            int secondNumber = fileScanner.nextInt();
        }*/
// or you can use the try catch method
    void readNumbersFromFile() {
        try {
            Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
            int firstNumber = fileScanner.nextInt();
            int secondNumber = fileScanner.nextInt();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }
    }

