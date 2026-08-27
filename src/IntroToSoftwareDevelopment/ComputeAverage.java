package IntroToSoftwareDevelopment;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //New Scanner object created
        Scanner input = new Scanner(System.in);
//prompt the user to enter 3 values
        System.out.println("Enter three numbers: ");

        // storing the values inputted by the user into these variables
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //calculate the average of the 3 values and store in a new variable
        double average = (number1 + number2 + number3) / 3;

        //Display the result of the calculation
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

    }
}
