public class Teningur {
  public static void main(String[] args) {
    double[] venjulegKost = new double[6];
    double[] godKost = new double[6];

    for(int i = 0; i < 1000; i++) {
      int kast = kastaTening();
      int gottKast = kastaGodumTening();

      venjulegKost[kast-1]++;
      godKost[gottKast-1]++;
    }

    StdDraw.setYscale(0.0, 1000.0);

    StdStats.plotBars(venjulegKost);
    StdDraw.pause(10000);
    StdDraw.clear();
    StdStats.plotBars(godKost);

  }

  static int kastaTening() {
    return (int) (Math.random() * 6) + 1;
  }

  static int kastaGodumTening() {
    int kast = (int) (Math.random() * 200) + 1;
    if (kast <= 90) return 6;
    if (kast <= 100) return 1;
    if (kast <= 125) return 2;
    if (kast <= 150) return 3;
    if (kast <= 175) return 4;
    return 5;
  }
}
