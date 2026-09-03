package programmingWithJava.SolvingMultipleInheritance.Lab4;

public class Learner implements Assessments {
    String name;
    private Course course;
    double gradeScore = 0.0;

    //TODO 2: create a constructor to initialize instance variables
    public Learner(String name, Course course){
        this.name = name;
        this.course = course;
    }

    //getter
    public String getName() {
        return name;

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //TODO 13: override assignmentScore() method
    // Hint: set the assignment marks in the associated Course object
    @Override
    public void assignmentScore(int marks) {
        course.setAssignmentMarks(marks);
    }

    //TODO 14: override quizScore() method
    // Hint: set the quiz marks in the associated Course object
    public void quizScore(int marks) {
        course.setQuizMarks(marks);
    }

    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;

        //TODO 17: calculate gradeScore as per the instructions
        // - For online courses: assignment max = 30, quiz max = 10
        // - For classroom courses: assignment max = 100, quiz max = 30
        // - Compute assignmentGrade and quizGrade out of 10
        // - gradeScore = average of assignmentGrade and quizGrade
        if(course instanceof OnlineCourse) {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;
        } else if (course instanceof ClassroomCourse) {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }else {
            return 0;
        }

        //get actual marks
        double assignmentMarks = course.getAssignmentMarks();
        double quizMarks = course.getQuizMarks();

        //calculate percentage
        double assignmentScore = (assignmentMarks / maxAssignmentMarks) * 10.0;
        double quizScore = (quizMarks / maxQuizMarks) * 10.0;

        //find average score
        double gradeScore = (assignmentScore + quizScore) / 2.0;

        return gradeScore;
    }
}

