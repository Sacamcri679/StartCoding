package programmingWithJava.InputOutputStreams;

// Starter code for Person class
public class Person {
    // TODO 1: Add instance variables: name (String), age (int), weight (double)
    String name;
    int age;
    double weight;
    // TODO 2: Create constructor with 3 parameters
    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // TODO 3: Implement toString() method
    public String toString(){
        return  "name='" + this.name + '\'' +
                ", age=" + this.age + '\'' +
                ", weight=" + this.weight;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
}

