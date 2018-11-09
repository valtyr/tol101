public class HMedaltal3 {
  public static void main(String[] args) {
    double a = 0.0;
    double b = 0.0;
    double c = 0.0;

    for (int i = 0; !StdIn.isEmpty(); i++) {
      if(i == 0) a = StdIn.readDouble();
      else if(i == 1) b = StdIn.readDouble();
      else if(i == 2) {
        c = StdIn.readDouble();
        printAverage(a, b, c);
      } else {
        a = b;
        b = c;
        c = StdIn.readDouble();
        printAverage(a, b, c);
      }
    }
  }

  static void printAverage(double a, double b, double c) {
    double average = (a + b + c) / 3;
    System.out.println(average);
  }
}
