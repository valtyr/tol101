public class TolustafurNr {

  public static void main(String[] args) {
    System.out.println(tolustafurNr(543210, 2));
  }

  static int tolustafurNr(int tala, int n) {
    if (n == 0) return tala % 10;
    return tolustafurNr(tala / 10, n - 1);
  }

}
