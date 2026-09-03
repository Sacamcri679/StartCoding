package programmingWithJava.SolvingMultipleInheritance.Lab2;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2005); //DOB Student
        Date date2  = new Date(10, 10, 1995); //DOB student
        Date date3 = new Date(1, 4, 2024); //Date of appointment

        Teacher teacher = new Teacher("Madhaven" , date2, date3, "MTech", "Electoronics");
        teacher.setSalary();
        Student student = new Student("Belinda", date1, teacher, "Electronics");
        teacher.getDetails();
        student.getDetails();
    }
}
