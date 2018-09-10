public class Timi {
  public static void main(String[] args) {
    System.out.println(Timi.daemi1());
  }

  static boolean daemi1() {
    return Math.sqrt(2.0) * Math.sqrt(2.0) == 2.0;
    // Þetta skilar alltaf false vegna þess að
    // Math.sqrt(2.0) skilar námundun og þegar
    // hún er sett í annað veldi er ekki víst
    // að út komi þeoretískt rétta niðurstaðan
  }
}
