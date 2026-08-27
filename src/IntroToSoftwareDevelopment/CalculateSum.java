package IntroToSoftwareDevelopment;
// import Scanner Class
import java.util.Scanner;







    public class CalculateSum {
        public static void main(String[] args) {

            // initialise a new scanner Object
            Scanner scanner = new Scanner(System.in);

            // prompt the user to enter three numbers of type Double. Store the three numbers in three variables called num1, num2 & num3.
            System.out.println("Enter three numbers: ");

            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();


            // Create a double variable called result, and initialise the value to the the result of the calculateAverage calculation
            double result = calculateAverage(num1, num2, num3);

            // To use the Method above you must 'call' the method by typing out the name of the method exactly followed by round brackets.
            // You must include the three variables you have saved inside the method brackets seperated by a comma.

            // display the result
            System.out.println("The result is: " + result);
            scanner.close();

        }

        // Below is the method used to calculate the averagege then return the result.

        public static double calculateAverage(double number1, double number2, double number3){
            // This is a piece of code called a Method.
            // This Method takes 3 arguments called number1, number2 abd number3.
            // after 'return' statement (on the same line) write the calculation to perform on the three arguments followed by a semicolon
            return  number1 + number2 + number3 / 3;        // Insert the mathematical calculation HERE followed by ';'. Remember to use number1, number2 and number3 as the variables to calculate the equation
        }



    }


