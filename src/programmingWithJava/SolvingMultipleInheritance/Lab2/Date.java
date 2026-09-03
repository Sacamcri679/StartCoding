package programmingWithJava.SolvingMultipleInheritance.Lab2;

public class Date {
    int date;
    int month;
    int year;

    Date (int d, int m, int y) {
        this.date = d;
        this.month = m;
        this.year = y;
    }

    String getDate() {
        return this.date+"-"+this.month+"-"+this.year;
    }
}
