public class Fib {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    System.out.println(fibOrd(n));
    System.out.println(fibOrdRec(n));
  }

  static String fibOrdRec(int n) {
    if (n == 0) return "b";
    if (n == 1) return "a";
    return fibOrdRec(n-1) + fibOrdRec(n-2);
  }

  static String fibOrd(int n) {
    if (n == 0) return "b";
    if (n == 1) return "a";

    String x = "b";
    String z = "a";

    for(int i = 1; i < n; i++) {
      String oldX = x;
      x = z;
      z = z + oldX;
    }

    return z;
  }
}
