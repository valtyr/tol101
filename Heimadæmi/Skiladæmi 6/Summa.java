public class Summa {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    boolean isSum = false;
    isSum = isSum || b + c == a;
    isSum = isSum || a + c == b;
    isSum = isSum || a + b == c;

    if (isSum) System.out.println("Summa");
    else System.out.println("Ekki summa");
  }
}
