public class Fjarfestir {
  public static void main(String[] args) {
    // Inputs
    int upph = Integer.parseInt(args[0]);
    int tap = Integer.parseInt(args[1]);
    int grodi = Integer.parseInt(args[2]);
    int T = Integer.parseInt(args[3]);
    double likur = Double.parseDouble(args[4]);

    // Results
    int salesWithProfit = 0;
    int salesWithLoss = 0;
    int daySum = 0;
    int outcomeSum = 0;

    // Simualtion
    for (int round = T; round > 0; round--) {
      int portfolio = upph;
      while(portfolio < grodi && portfolio > tap) {
        if(profited(likur)) {
          portfolio++;
        } else {
          portfolio--;
        }
        daySum++;
      }
      if(portfolio == grodi) salesWithProfit++;
      if(portfolio == tap) salesWithLoss++;

      outcomeSum += portfolio;
    }
    
    double percentage = (1.0 * salesWithProfit / T) * 100;
    double avgDays = 1.0 * daySum / T;
    double avgOutcome = 1.0 * outcomeSum / T;
    System.out.println("Hlutfall sala með gróða = " + percentage + "%");
    System.out.println("Meðalútkoma fjárfestis  = " + avgOutcome);
    System.out.println("Meðalgjöldi daga        = " + avgDays);

  }

  static boolean profited(double odds) {
    return Math.random() < odds;
  }
}
