public class TveirThrir {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    int fjoldiDeilanlegra = 0;

    if(deilanlegtMedThremur(a)) fjoldiDeilanlegra++;
    if(deilanlegtMedThremur(b)) fjoldiDeilanlegra++;
    if(deilanlegtMedThremur(c)) fjoldiDeilanlegra++;

    // Ef nákvæmlega tvö inntök eiga að vera deilanleg:
    System.out.println(fjoldiDeilanlegra == 2);

    // Ef fleiri mega vera deilanleg:
    // System.out.println(fjoldiDeilanlegra >= 2);
  }

  static boolean deilanlegtMedThremur(int x) {
    return x % 3 == 0;
  }
}
