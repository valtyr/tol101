public class Slembi {
  public static void main(String[] args) {
    boolean[] seen = new boolean[1025];

    int lastRandom = slembi1024(0);
    int runs = 1;
    while (lastRandom != 0) {
      runs++;
      lastRandom = slembi1024(lastRandom);
      if (seen[lastRandom]) break;
      else seen[lastRandom] = true;
    }
    System.out.println("Lotan er " + runs + " að lengd.");
  }

  static int slembi1024(int r) {
    return (22 * r + 5) % 1024;
  }
}
