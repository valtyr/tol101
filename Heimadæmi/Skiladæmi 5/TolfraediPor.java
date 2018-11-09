public class TolfraediPor {
  public static void main(String[] args) {
    if (args % 2 != 0) throw Error('Fjöldi inntaka þarf að vera jöfn tala.');


  }

  static double[] parseInput(String[] args) {
    int totalCount;
    Array[] singleArrays = Array[args.length / 2];
    for (int i = 0; i < args.length; i += 2) {
      int count = Integer.parse(args[i]);
      singleArrays[i] = new Double[count];
      for (int j = 0; j < count; j++) {
        singleArrays[i][j] = Double.parseDouble(args[i + 1]);
      }
      totalCount += count;
    }
    int[] parsedArray = new int[totalCount];


  }
}
