public class EinvidEind {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int T = Integer.parseInt(args[1]);

    int sum = 0;
    for (int i = 0; i < T; i++) {
      sum += runSimulation(n);
    }
    System.out.println("Meðalfjöldi skrefa var " + sum / (T * 1.0));
  }

  static int upOrDown() {
    if (Math.random() >= 0.5) return 1;
    return 0;
  }

  static int runSimulation(int goal) {
    int place = 0;
    int iterations = 0;
    while (place != goal) {
      if (place == 0) place += 1;
      else place += upOrDown();
      iterations++;
    }
    return iterations;
  }
}
