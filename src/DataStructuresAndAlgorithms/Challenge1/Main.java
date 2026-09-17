package DataStructuresAndAlgorithms.Challenge1;

public class Main {
    public static void main(String[] args) {

        //declare an int dayInMonth with a size of 12
        int daysInMonth[] = new int[12];

        //Initialise the array with the number of days in each month
        daysInMonth[0] = 31; // Jan
        daysInMonth[1] = 28; //Feb
        daysInMonth[2] = 31; // March
        daysInMonth[3] = 30; // April
        daysInMonth[4] = 31; // May
        daysInMonth[5] = 30; // June
        daysInMonth[6] = 31; // July
        daysInMonth[7] = 31; // August
        daysInMonth[8] = 30; // Sept
        daysInMonth[9] = 31; // Oct
        daysInMonth[10] = 30; // Nov
        daysInMonth[11] = 31; // Dec

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthNames[i] + " has " + daysInMonth[i] + " days" );
        }
    }
}

