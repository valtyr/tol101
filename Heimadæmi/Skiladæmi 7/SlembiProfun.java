public class SlembiProfun {
  public static int[] slembiFylki(int N, int a, int b) {
    int[] returnArray = new int[N];
    int range = b - a;
    for (int i = 0; i < N; i++) {
      returnArray[i] = (int) (Math.random() * (range + 1)) + a;
    }
    return returnArray;
  }

  public static void main(String[] args) {
    int[] rnd = slembiFylki(25, -10, 10);

    for (int i=0; i<rnd.length; i++) {
      System.out.print(rnd[i] + " ");
      System.out.println();
    }
  }
}
