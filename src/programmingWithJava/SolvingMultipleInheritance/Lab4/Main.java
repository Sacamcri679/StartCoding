package programmingWithJava.SolvingMultipleInheritance.Lab4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //TODO 20: accept user input for learner's name
        // Hint: use Scanner.nextLine()

        //TODO 18: display available courses and accept user choice
        // Hint: show a numbered list (e.g., 1 = Java, 2 = Java Online, etc.)
        //       and read choice using Scanner
        System.out.println("Enter course code: ");
        System.out.println("1 = Java(Classroom)");
        System.out.println("2 = Java Online");
        System.out.println("3 = JavaScript (Classroom)");
        System.out.println("4 = JavaScript Online");

        int choice = in.nextInt();
        in.nextLine();
        //TODO 19: initialize object of chosen course
        // Hint: choose ClassroomCourse or OnlineCourse based on user input
        Course selectedCourse = null;

        Subject java = new Subject("Java", 3.0);
        Subject js = new Subject("JavaScript", 3.0);

        switch(choice) {
            case 1:
                selectedCourse = new ClassroomCourse(java, "Dr Smith", 500, "Greenwood High School", "Morning");
                break;
            case 2:
                selectedCourse = new OnlineCourse(java, "Dr Smith", 300, 3, 6);
                break;
            case 3:
                selectedCourse = new ClassroomCourse(js, "prof Adams", 450, "Greenwood High", "Afternoon");
                break;
            case 4:
                selectedCourse= new OnlineCourse(js, "Prof Adams", 250, 5,3);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        //Enter name of Learner
        System.out.println("Enter Learner name: ");
        String name = in.nextLine();

        Learner learner = new Learner(name, selectedCourse);


        //TODO 8: declare and initialize the object of ClassroomCourse class
        // Hint: provide subject, instructor, fee, school, and session
        // Subject subject = new Subject("Mathmatics", 3.0);
        //   ClassroomCourse course = new ClassroomCourse(subject, "Dr Smith", 500, "Greenwood High School", "Morning Session") {

        //  };
        //TODO 9: declare and initialize the Learner object
        // Hint: pass learner's name and chosen Course object


        //TODO 21: call assignmentScore() and quizScore() methods
        // Hint: prompt the user for marks and call the respective methods

        //enter marks
        if (selectedCourse instanceof OnlineCourse) {
            System.out.println("Online course -> Assignment max = 30, Quiz max = 10");
        }else {
            System.out.println("Classroom Course -> Assignment max = 100, Quiz max = 30");
        }

        System.out.println("Enter assignment marks: ");
        int assignmentMarks = in.nextInt();

        System.out.println("Enter quiz marks: ");
        int quizMarks = in.nextInt();

        learner.assignmentScore(assignmentMarks);
        learner.quizScore(quizMarks);

        //TODO 22: call calculateGrade() method and display result
        // Hint: if gradeScore >= 5, print "successfully passed"; otherwise, "successfully completed"

        double grade = learner.calculateGrade();
        System.out.println("Grade Score = " + grade);

        if (grade >= 5) {
            System.out.println("Result: Successfully passed!");
        }else {
            System.out.println("Result: Completed");
        }

        in.close();
    }
}
