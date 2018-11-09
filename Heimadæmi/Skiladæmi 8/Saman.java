public class Saman {
  static boolean saman(int[] a, int d, int e) {
    for(int i = 1; i < a.length - 1; i++) {
      if (a[i] == d && a[i-1] == e) return true;
      if (a[i] == e && a[i-1] == d) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(saman(arr, 3, 4));
    System.out.println(saman(arr, 3, 5));
    System.out.println(saman(arr, 4, 3));
  }
}
