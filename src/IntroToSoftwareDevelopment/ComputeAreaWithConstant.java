package IntroToSoftwareDevelopment;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main (String[] args) {
        final double PI = 3.14159; //Declaring a constant

        //create a Scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a value for the radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area of circle
        double area = radius * radius * PI;

        //print result of the above equation
        System.out.println("The area of the circle of radius " + radius + " is " + area );
    }
}
