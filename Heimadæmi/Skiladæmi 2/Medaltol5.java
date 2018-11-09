public class Medaltol5 {
  public static void main(String[] args) {
    double[] inntok = {
      Double.parseDouble(args[0]),
      Double.parseDouble(args[1]),
      Double.parseDouble(args[2]),
      Double.parseDouble(args[3]),
      Double.parseDouble(args[4]),
    };

    System.out.println("Venjulegt meðaltal: " + arithMean(inntok));
    System.out.println("Faldmeðaltal: " + geoMean(inntok));
    System.out.println("Þýtt meðaltal: " + harmMean(inntok));
  }

  static double arithMean(double[] input) {
    double sum = 0;
    for (double n : input) {
      sum += n;
    }
    return sum / input.length;
  }

  static double geoMean(double[] input) {
    double product = 1;
    for (double n : input) {
      product = product * n;
    }
    return Math.pow(product, 1.0 / input.length);
  }

  static double harmMean(double[] input) {
    double sum = 0;
    for (double n : input) {
      sum += Math.pow(n, -1);
    }
    return input.length / sum;
  }
}
