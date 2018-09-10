public class Div7 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    boolean aDivBy7 = a % 7 == 0;
    boolean bDivBy7 = b % 7 == 0;

    System.out.println(aDivBy7 && bDivBy7);
  }
}
