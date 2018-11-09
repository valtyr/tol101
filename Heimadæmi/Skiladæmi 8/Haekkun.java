import java.util.Arrays;

public class Haekkun {
  static int heildarHaekkun(int[] h) {
    int summa = 0;
    for(int i = 1; i < h.length; i++) {
      if(h[i-1] < h[i]) summa += (h[i] - h[i-1]);
    }
    return summa;
  }

  static int[] slembiFylki() {
    int[] slembi = new int[10];
    for(int i = 0; i < slembi.length; i++) {
      slembi[i] = (int) (Math.random() * 101);
    }
    return slembi;
  }

  public static void main(String[] args) {
    int[] slembi = slembiFylki();
    int haekkun = heildarHaekkun(slembi);
    System.out.println(Arrays.toString(slembi));
    System.out.println(haekkun);
  }
}
