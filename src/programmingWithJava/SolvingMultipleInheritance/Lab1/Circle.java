package programmingWithJava.SolvingMultipleInheritance.Lab1;

import programmingWithJava.SolvingMultipleInheritance.Lab1.Shape;

public class Circle extends Shape {
    float radius;

    Circle(float r) {
        this.radius = r;
    }

    @Override
    public float calculateArea() {
        float area = (float)Math.PI * this.radius*this.radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius=" + this.radius);
    }

    @Override
    public String lineColor() {
        return "";
    }

    @Override
    public float calculatePerimeter(){
        float perimeter = (float) (2 * Math.PI * radius);
        return perimeter;
    }


    @Override
    public void rectangle() {

    }

    @Override
    public void circle() {

    }
}

