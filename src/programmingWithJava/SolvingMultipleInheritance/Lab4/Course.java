package programmingWithJava.SolvingMultipleInheritance.Lab4;

abstract class Course {
    // TODO 3: Include instance variables and create a constructor to initialize some of them
// Hint: Instance variables: subject (Subject), instructor (String), fee (int), assignmentMarks (int), quizMarks (int)
//       Constructor parameters: (Subject subject, String instructor, int fee) to initialize subject, instructor, and fee
    private Subject subject;
    private String instructor;
    private int fee;
    private int assignmentMarks = 0;
    private int quizMarks = 0;

    //constructor
    Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;
    }

    //getters
    public Subject getSubject() {
        return subject;
    }

    public String getInstructor(){
        return instructor;
    }

    public int getFee() {
        return fee;
    }

    public int getAssignmentMarks() {
        return assignmentMarks;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    //setters
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setAssignmentMarks(int assignmentMarks){
        this.assignmentMarks = assignmentMarks;
    }

    public void setQuizMarks(int quizMarks) {
        this.quizMarks = quizMarks;
    }

}
