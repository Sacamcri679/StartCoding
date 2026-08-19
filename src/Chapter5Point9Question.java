public class Chapter5Point9Question {
    public static void main(String[] args) {
       // for (int i = 0; i < 10; i++)
          //  for(int j = 0; j < i; j++)
           //     System.out.print(i * j);
        double sum = 0;
        double d = 0;
        while (d != 10.0) {
            d += 0.1;
            sum += sum + d;
        }
    }
}
