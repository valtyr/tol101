public class Gafur {
  public static void main (String[] args)  {
    int n = Integer.parseInt(args[0]);
    int item = 1;

    for (int i = 1; i < n; i++) {
      System.out.print(item + ", ");
      item = i + item++;
    }

    System.out.println(item);
  }
}
