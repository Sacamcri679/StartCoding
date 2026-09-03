package programmingWithJava.SolvingMultipleInheritance.Lab4;

public class Subject {
    // TODO 4: Declare instance variables and create a constructor to initialize them
    // Hint: Use instance variables `title` (String)
    // and `credits` (double) to declare instance variable,
    // and a constructor with parameters (String title, double credits)

    //variables
    String title;
    double credits;

    //constructor
    Subject(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }

    //toString method
    @Override
    public String toString() {
        return "Subject: " + title + ", Credits: " + credits;
    }

    //TODO 5: define toString() method
    // Hint: return a string representation of the Subject object
}
