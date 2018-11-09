public class SnuaStofum {
  public static void main(String[] args) {
    System.out.println(snuaStofum(543));
  }

  static int snuaStofum(int n) {
    int orderOfMagnitude = (int) Math.log10(n);
    int returnInt = 0;
    for(int o = orderOfMagnitude; o >= 0; o--) {
      int digit = n % 10;
      returnInt += digit * Math.pow(10, o);
      n = n / 10;
    }
    return returnInt;
  }
}
