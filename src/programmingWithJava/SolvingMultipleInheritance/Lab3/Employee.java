package programmingWithJava.SolvingMultipleInheritance.Lab3;

public class Employee extends Person implements EmployeeInterface{
    int basicPay;

    //TODO 11: declare basicPay as int attribute
    Employee(String name, int age, int basic) {
        this.name = name;
        this.age=age;
        this.basicPay = basic;
    }
    @Override
    public double computeSalary() {
        double salary;
        //TODO 12: salary calculation logic goes here - basicPay+50 percent of basicPay
        salary = (int)(basicPay * 1.5);
        return salary;
    }
    @Override
    public double computeTax() {
        double tax;
        //TODO 13: tax is 10 percent of basicPay
        tax = (int)(basicPay * 0.10);
        return tax;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        //TODO 14: add print statements to print basicPay, salary and tax
        System.out.println("Basic pay is: " + this.basicPay);
        System.out.println("Salary: " + computeSalary());
        System.out.println("tax: " + computeTax());
    }
}
