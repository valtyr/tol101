public class Tafla {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for(int i = 1; i <= n; i++) {
      int fjoldi = n - i + 1;
      for(int ii = fjoldi; ii > 0; ii--) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }
}
