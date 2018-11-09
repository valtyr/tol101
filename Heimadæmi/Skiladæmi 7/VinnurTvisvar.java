public class VinnurTvisvar {
  public static void main(String[] args) {
    int sumOfTries = 0;
    for (int i = 0; i < 100000;  i++) {
      sumOfTries += vinnurTvisvar();
    }
    double average = sumOfTries / 100000.0;
    System.out.printf("Meðalfjöldi kasta var %f\n", average);
  }

  static int vinnurTvisvar() {
    boolean vannSidast = false;
    for(int i = 1; true; i++) {
      int kast1 = (int) (Math.random() * 6) + 1;
      int kast2 = (int) (Math.random() * 6) + 1;
      if (kast1 > kast2 && vannSidast) return i;
      vannSidast = kast1 > kast2;
    }
  }
}
