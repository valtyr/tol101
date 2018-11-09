import java.util.Arrays;

public class KlipptMedaltal {
  public static void main(String[] args) {
    double[] slembi = new double[10];
    for(int i = 0; i < 10; i++) {
      slembi[i] = Math.random() * 10.0;
    }

    System.out.println(StdStats.mean(slembi));
    System.out.println(trmean(slembi));
  }

  public static double trmean(double[] a) {
    Arrays.sort(a);
    double[] trimmed = Arrays.copyOfRange(a, 1, a.length - 1);
    return StdStats.mean(trimmed);
  }
}
