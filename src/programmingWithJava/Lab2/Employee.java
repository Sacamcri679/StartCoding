package programmingWithJava.Lab2;

abstract class Employee extends Person {
    Date dateOfAppointment;
    int salary;

    abstract void setSalary();
    abstract int getSalary();
}
