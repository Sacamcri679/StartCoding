package programmingWithJava.SolvingMultipleInheritance.Lab4;

public class ClassroomCourse extends Course{
    //TODO 6: declare instance variables
    // Hint: school (String), session (String)

    //Variables
    String school;
    String session;

    //TODO 7: create a constructor
    // Hint: parameters (Subject subject, String instructor, int fee, String school, String session)
    // - Call the superclass constructor to initialize subject, instructor, and fee
    // - Initialize school and session

    //Constructor
    ClassroomCourse(Subject subject, String instructor, int fee, String school, String session){
        //super is calling the superclass constructor in course class
        super(subject, instructor, fee);
        this.school = school;
        this.session = session;
    }
}
