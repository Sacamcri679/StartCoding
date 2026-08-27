package IntroToSoftwareDevelopment;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {

        //double radius; //declaring variables - (Name on the jar) - double = floating number
        double area; //declaring variable - (Name on the jar) - floating number = number with decimal

        //below creates an object called Scanner and assigns it to the variable name input
        //an object can invoke its method - by giving it a task
        Scanner input = new Scanner(System.in);
        //to prompt the user to input a value
        System.out.println("Enter a number for the radius: ");
        //invoke on the radius variable below we can use input.nextDouble()
        //it reads the value from the keyboard from the user and stores it in the variable radius
        double radius = input.nextDouble(); //declaring variables - (Name on the jar) - double = floating number

        //radius = 20; // assigns the value to the variable - (what is inside the jar)
        // calculation of the area
        area = radius * radius * 3.14159;

        //Display the answer to the above calculation
        System.out.println("The area of the circle of radius : " + radius + " is " + area);

    }
}
//every variable has a Name, Type and a Value
// the + has to roles 1) is in calculations and 2) is to combine values together
