public class NullaUtanHornalinu {
  public static void main(String[] args) {
    double[][] a = randMatrix();
    StdArrayIO.print(a);
    nullaUtanHornalinu(a);
    StdArrayIO.print(a);
  }

  static void nullaUtanHornalinu(double[][] a) {
    for(int x = 0; x < a.length; x++) {
      for(int y = 0; y < a.length; y++) {
        if(x == y) continue;
        a[x][y] = 0.0;
      }
    }
  }

  static double[][] randMatrix() {
    double[][] m = new double[5][5];
    for(int x = 0; x < 5; x++) {
      for(int y = 0; y < 5; y++) {
        m[x][y] = Math.random() * 10;
      }
    }
    return m;
  }
}
