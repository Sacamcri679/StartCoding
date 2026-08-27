package IntroToSoftwareDevelopment;

public class FindingTheCurrentTime {
    public static void main(String[] args) { // need to use long to stop the
        //program from giving loads of remainder digits
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println("The current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);

    }
}
