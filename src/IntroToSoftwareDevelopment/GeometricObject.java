package IntroToSoftwareDevelopment;

public class GeometricObject {
        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

        /** Construct a default geometric object */
        public GeometricObject() {
            dateCreated = new java.util.Date();
        }

        /** Construct a geometric object with the specified color and filled value */
        public GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        /** Return color */
        public String getColor() {
            return color;
        }

        /** Set a new color */
        public void setColor(String color) {
            this.color = color;
        }

        /** Return filled. Since filled is boolean, its getter method is named isFilled */
        public boolean isFilled() {
            return filled;
        }

        /** Set a new filled */
        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        /** Get dateCreated */
        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        /** Return a string representation of this object */
        public String toString() {
            return "Created on " + dateCreated + "\nColor: " + color + " and Filled: " + filled;
        }
    }
     class Circle extends GeometricObject {
        private double radius;

        /** Default constructor */
        public Circle() {
        }

        /** Constructor with specified radius */
        public Circle(double radius) {
            this.radius = radius;
        }

        /** Constructor with specified radius, color, and filled status */
        public Circle(double radius, String color, boolean filled) {
            super(color, filled); // Calls superclass constructor
            this.radius = radius;
        }

        /** Return radius */
        public double getRadius() {
            return radius;
        }

        /** Set a new radius */
        public void setRadius(double radius) {
            this.radius = radius;
        }

        /** Return area */
        public double getArea() {
            return Math.PI * radius * radius;
        }

        /** Return diameter */
        public double getDiameter() {
            return 2 * radius;
        }

        /** Return perimeter */
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

    }
     class Rectangle extends GeometricObject {
        private double width;
        private double height;

        /** Default constructor */
        public Rectangle() {
        }

        /** Constructor with width and height */
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        /** Constructor with width, height, color, and filled status */
        public Rectangle(double width, double height, String color, boolean filled) {
            super(color, filled); // Calls the superclass constructor
            this.width = width;
            this.height = height;
        }

        /** Return width */
        public double getWidth() {
            return width;
        }

        /** Set a new width */
        public void setWidth(double width) {
            this.width = width;
        }

        /** Return height */
        public double getHeight() {
            return height;
        }

        /** Set a new height */
        public void setHeight(double height) {
            this.height = height;
        }

        /** Return area of the rectangle */
        public double getArea() {
            return width * height;
        }

        /** Return perimeter of the rectangle */
        public double getPerimeter() {
            return 2 * (width + height);
        }

        /** Override toString() method */
        @Override
        public String toString() {
            return super.toString() + "\nWidth: " + width + "\nHeight: " + height;
        }
    }
 class Test3 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(4, "blue", true);
        System.out.println("A circle: " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(3, 5, "red", false);
        System.out.println("\nA rectangle: " + rectangle.toString());
        System.out.println("The color is " + rectangle.getColor());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}

