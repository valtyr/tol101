public class Sivalningur {
  public static void main(String[] args) {
    double rad = Double.parseDouble(args[0]);
    double haed = Double.parseDouble(args[1]);

    System.out.println("Flatarmál sívalningsins er: " + flatarmal(rad, haed));
    System.out.println("Rúmmál sívalningsins er: " + rummal(rad, haed));
  }

  static double rummal(double r, double h) {
    return Math.PI * h * Math.pow(r, 2);
  }

  static double flatarmal(double r, double h) {
    return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * h * r;
  }
}
