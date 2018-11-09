public class FinnaSponn {
  public static void main(String[] args) {
    int[] intArray = parseArgs(args);
    int span = calculateSpan(intArray);

    System.out.println("Spönnin er: " + span);
  }

  static int[] parseArgs(String[] args) {
    int[] parsed = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      parsed[i] = Integer.parseInt(args[i]);
    }
    return parsed;
  }

  static int calculateSpan(int[] intArray) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < intArray.length; i++) {
      if(intArray[i] > max) max = intArray[i];
      if(intArray[i] < min) min = intArray[i];
    }
    return max - min;
  }
}
