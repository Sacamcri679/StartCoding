import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        //Generate a number and put it in the Int variable number1 and 2
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        //Create a scanner for the user to input their answer
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter the value
        System.out.print("What is " + number1  +" + " + number2 + "? ");
        //declare a variable to hold the input answer that the user entered
        int answer = input.nextInt();
        //display the question and answer and whether the answer is true or not
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));


    }
}
