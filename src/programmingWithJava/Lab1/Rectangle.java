package programmingWithJava.Lab1;

public class Rectangle extends Shape{
    float width;
    float height;
    String lineColor;


    Rectangle (float w, float h) {
        this.width = w;
        this.height = h;
        this.lineColor = lineColor;
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width=" + this.width + " height= " + this.height);
    }

    public String lineColor() {
        return this.lineColor;
    }


    @Override
    public float calculatePerimeter(){
        return 2 * (width + height);
    }

    @Override
    public void rectangle() {

    }

    @Override
    public void circle() {

    }


}
