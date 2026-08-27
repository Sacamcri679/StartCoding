package IntroToSoftwareDevelopment;

public class Test {
    public static void main(String[] args) {
        int j = 0;
        int i = ++j + j * 5;
            System.out.println(i);

        int x = 1;
        int y = x + x++;
        System.out.println("y is " + y);

        int a = 0;
        int b = a++ + a * 5;

        System.out.println("What is i? " + b);

        int c = 1;
        int d = c++ + c;
        System.out.println("y is " + d);

        double e = 5.5;
        int f = (int)e;
        System.out.println("x is " + e + " and y is " + f);
    }
}
