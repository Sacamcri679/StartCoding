import java.util.Scanner;

public class Chapter5point6Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, max;
        System.out.print("Enter an integer(the input ends if it is 0): ");
        number = input.nextInt();
        max = number;

        do {
            System.out.print("Enter an integer(the input ends if it is 0): ");
            number = input.nextInt();
            if (number > max)
                max = number;
        }while(number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);
        }
    }

