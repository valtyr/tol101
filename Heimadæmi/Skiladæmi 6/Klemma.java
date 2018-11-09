public class Klemma {
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double max = a > b ? a : b;
    double min = a > b ? b : a;

    while(!StdIn.isEmpty()) {
      double n = StdIn.readDouble();
      if (n >= max) System.out.println(max);
      else if (n <= min) System.out.println(min);
      else System.out.println(n);
    }
  }
}
