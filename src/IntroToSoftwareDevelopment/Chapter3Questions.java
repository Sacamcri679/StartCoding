package IntroToSoftwareDevelopment;

import java.util.Scanner;

public class Chapter3Questions {
    public static void main(String[] args) {

        double pay = 1500;
        double score;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter PDP score: ");
        score = input.nextInt();


        if (score > 90) {
            double increaseInPay = pay * 0.3;
            System.out.println("Your pay will increase by " + increaseInPay);
        }
        else {
            double increaseInPay = pay * 0.1;
            System.out.println("Your pay will increase by " + increaseInPay);

        }

    }
}
