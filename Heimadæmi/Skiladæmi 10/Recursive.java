public class Recursive {
  public static void main(String[] args) {
    System.out.println(endurk(4));
    System.out.println(endurk(3));
    System.out.println(endurk(2));
    System.out.println(endurk(1));
    System.out.println(endurk(0));
  }

  public static int endurk(int n) {
    if(n <= 0) return 1;
    return n * endurk(n-1);
  }
}

/*

Vandamálið var að öll gildi fallsins voru fengin út frá 0 með margföldun.
Allt sem er magfaldað með núll verður augljóslega að 0. Ef skipt er yfir í
samlagningu skilar fallið eðlilegri keyrslu með mismunandi gildum fyrir
mismunandi n.

*/
