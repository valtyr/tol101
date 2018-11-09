public class Toppar {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println("");
    }

    int topCount = 0;
    for (int i = 1; i < n - 1; i++) {
      for (int j = 1; j < n - 1; j++) {
        boolean isTopVert = matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i + 1][j];
        boolean isTopHoriz = matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i][j + 1];

        boolean isTop = isTopVert && isTopHoriz;
        if(isTop) {
          System.out.println("Stak (" + i + ", " + j + ") = " + matrix[i][j] + " er toppur");
          topCount++;
        };
      }
    }

    System.out.println("Fjöldi toppa er: " + topCount);
  }
}
