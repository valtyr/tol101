public class SlembiJafnar {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int[] A = generateArray(n);

    printArray(A);
  }

  static int[] generateArray(int n) {
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      int slembi = 2 * (int) (Math.random() * 51);
      A[i] = slembi;
    }
    return A;
  }

  static void printArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println(array[array.length - 1]);
  }
}
