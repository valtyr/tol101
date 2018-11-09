public class MestaFjarlaegd {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int[] fylki = generateArray(n);

    printArray(fylki);
    calculateGreatestDistance(fylki);
  }

  static int[] generateArray(int n) {
    int[] fylki = new int[n];
    for (int i = 0; i < n; i++) {
      fylki[i] = randInt();
    }
    return fylki;
  }

  static int randInt() {
    return -5 + (int)(Math.random() * 11);
  }

  static void printArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println(array[array.length - 1]);
  }

  static void calculateGreatestDistance(int[] fylki) {
    int greatestDistance = 0;
    int greatestDistanceValue = 0;
    for (int i = 0; i < fylki.length; i++) {
      int distance = 0;
      int value = fylki[i];
      for (int j = 0; j < fylki.length; j++) {
        int d = j - i;
        if(value == fylki[j] && d > distance) {
          distance = d;
        };
      }
      if(distance > greatestDistance) {
        greatestDistance = distance;
        greatestDistanceValue = value;
      };
    }
    System.out.println("Mesta fjarlægð er " + greatestDistance + " fyrir gildið " + greatestDistanceValue);
  }
}
