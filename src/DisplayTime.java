import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter and integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; //finding the minutes in seconds
        int remainingSeconds = seconds % 60; //the seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
