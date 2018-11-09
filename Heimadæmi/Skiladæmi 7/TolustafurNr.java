public class TolustafurNr {
  public static void main(String[] args) {
    System.out.println(tolustafurNr(12345, 0));
    System.out.println(tolustafurNr(12345, 1));
    System.out.println(tolustafurNr(12345, 2));
    System.out.println(tolustafurNr(12345, 3));
    System.out.println(tolustafurNr(12345, 4));
  }

  static int tolustafurNr(int tala, int i) {
    return (tala / (int) Math.pow(10, i)) % 10;
  }
}
