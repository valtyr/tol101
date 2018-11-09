public class ThriKassar {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(thriKassar(n));
  }

  static int thriKassar(int n) {
    if (n == 1) return 1;
    return n + thriKassar(n-1);
  }

}
