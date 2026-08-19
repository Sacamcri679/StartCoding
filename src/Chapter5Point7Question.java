import java.util.Scanner;

public class Chapter5Point7Question {
    public  static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            System.out.print("Enter an integer(the input ends if it is 0): ");
            number = keyboard.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);
        System.out.println("count is " + count);
    }
}
