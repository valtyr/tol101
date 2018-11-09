import java.util.Arrays;

public class EydaNullum {
  public static void main(String[] args) {
    int[] randomArray = new int[20];
    for (int i = 0; i < 20; i++) {
      randomArray[i] = (int) (Math.random() * 6);
    }

    System.out.println(Arrays.toString(randomArray));
    System.out.println(Arrays.toString(eydaNullum(randomArray)));
  }

  static int[] eydaNullum(int[] a) {
    int returnArraySize = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 0) returnArraySize++;
    }
    int[] returnArray = new int[returnArraySize];

    int returnIndex = 0;
    for (int i = 0; i < a.length; i++) {
      if(a[i] == 0) continue;
      returnArray[returnIndex] = a[i];
      returnIndex++;
    }

    return returnArray;
  }
}
