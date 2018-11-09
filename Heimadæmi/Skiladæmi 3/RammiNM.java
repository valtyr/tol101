public class RammiNM {
  public static void main(String[] args) {
    int height = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    renderEndLine(width);
    for(int h = height - 2; h>0; h--) renderCenterLine(width);
    renderEndLine(width);
  }

  static String nChars(int n, char character) {
    String returnValue = "";
    for(; n>0; n--) returnValue += character;
    return returnValue;
  }

  static void renderEndLine(int width) {
    System.out.print('+');
    System.out.print(nChars(width - 2, '-'));
    System.out.println('+');
  }

  static void renderCenterLine(int width) {
    System.out.print('|');
    System.out.print(nChars(width - 2, ' '));
    System.out.println('|');
  }
}
