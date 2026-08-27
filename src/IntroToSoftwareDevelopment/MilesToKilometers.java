package IntroToSoftwareDevelopment;

public class MilesToKilometers {
    public static void main(String[] args) {
        //declaring value to variable miles
        double miles = 100;
        //declaring a constant value to variable KILOMETERS_PER_MILE
        final double KILOMETERS_PER_MILE = 1.609;

        //declaring equation of miles * KILOMETERS_PER_MILE to variable Kilometers
        double kilometers = miles * KILOMETERS_PER_MILE;

        //print the result of the equation
        System.out.println("There are  " + kilometers + " Kilometers in " + miles + " miles");


    }
}
