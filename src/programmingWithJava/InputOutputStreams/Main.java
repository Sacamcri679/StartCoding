package programmingWithJava.InputOutputStreams;

import java.io.*;
import java.util.Scanner;

public class Main {

    // Task 2 - Write Person to file1.txt using FileWriter
    // TODO 4: Add a static method textFileWrite() that returns void
    public static void textFileWrite() {
        // TODO 5: Create Person object
        Person person = new Person("Seth", 41, 70.6);
        String personData = person.toString();

        // TODO 6-7: Write to file using FileWriter in try-catch
        // TODO: Print message "File written with FileWriter..."
        //  Task 3 - Write user input to file2.txt using PrintWriter
        try {
            FileWriter writer = new FileWriter("file1.txt");
            writer.write(personData);
            writer.close();
            System.out.println("file1.txt written successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    // TODO 8: Define a static method printWrite() that returns void
    public static void printWrite () {
        // TODO 9: Take input using Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter Age: ");
        int age = keyboard.nextInt();

        System.out.print("Enter weight: ");
        double weight = keyboard.nextDouble();
        // TODO 10: Create Person object

        Person person1 = new Person(name, age, weight);
        // TODO 11-12: Write to file using PrintWriter in try-catch
        // TODO: Print message "File written with PrintWriter..."
        try {
            PrintWriter writer = new PrintWriter("file2.txt");
            writer.println(person1.toString());
            writer.close();
            System.out.println("file2.txt written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }



    // Task 4 - Write byte array to binary file3.dat using FileOutputStream
    // TODO 13: Define a static method writeBinaryNumbers() that returns void
    public static void writeBinaryNumbers () {
        // TODO 14: Declare byte array
        byte[] numbers = {10, 20, 30, 40, 50};
        // TODO 15-17: Write bytes using FileOutputStream in try-catch
        try {
            FileOutputStream fos = new FileOutputStream("file3.dat");
            fos.write(numbers);
            fos.close();
            System.out.println("file3.dat written successfully with FileOutputStream!");
        } catch (IOException e) {
            System.out.println("Error writing binary file: " + e.getMessage());
        }
    }
    // TODO: Print message "File written with FileOutputStream..."

    // Task 5 - Write Person object to binary file4.dat using DataOutputStream
    //TODO 18: Define a static method writePersonBinary() that returns void
    public static void writePersonBinary() {
        // TODO 19: Read input using Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter Age: ");
        int age = keyboard.nextInt();

        System.out.print("Enter weight: ");
        double weight = keyboard.nextDouble();

        // TODO 20: Create Person object
        Person person = new Person(name, age, weight);
        // TODO 21-23: Write attributes using DataOutputStream in try-catch
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("file4.dat"));
            dos.writeUTF(person.getName());
            dos.writeInt(person.getAge());
            dos.writeDouble(person.getWeight());
            dos.close();
            System.out.println("file4.dat written successfully with DataOutputStream!");
        }catch (IOException e) {
            System.out.println("Error writing binary file: " + e.getMessage());
        }
        // TODO: Print message "File written with DataOutputStream..."
    }



    public static void main (String[]args){
        textFileWrite();
        printWrite();
        writeBinaryNumbers();
        writePersonBinary();
        // TODO 24: Call all static methods to test
    }
}



