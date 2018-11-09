public class Ferningur {
  public static void main(String[] args) {
    int activePlayer = 1;
    int number = (int) (Math.random() * 11) + 10;

    number = executeTurn(number, activePlayer);
    while (number != 0) {
      activePlayer = activePlayer == 1 ? 2 : 1;
      number = executeTurn(number, activePlayer);
    }
    System.out.printf("Leikmaður %d hefur sigrað!\n", activePlayer);
  }

  static int executeTurn(int number, int activePlayer) {
    System.out.printf("| Tala: %2d | Leikmaður: %d | ", number, activePlayer);
    int input = StdIn.readInt();

    while(!isSquare(input) || input > number) {
      System.out.printf("Hmmm... %2d er óleyfileg tala. Reyndu aftur: ", input);
      input = StdIn.readInt();
    }

    return number - input;
  }

  static boolean isSquare(int i) {
    return Math.sqrt(i) % 1 == 0.0;
  }
}
