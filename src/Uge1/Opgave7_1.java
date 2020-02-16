package Uge1;

public class Opgave7_1 {

    /*7 2D Peaks Let M be an n × n matrix (2D-array).
    An entry M[i, j] is a peak if it is no smaller than its N,E, S, and W
    neighbors (
    i.e. M[i][ j] ≥ M[i − 1][ j], M[i][ j] ≥ M[i][ j − 1], M[i][ j] ≥ M[i + 1][ j]
    and M[i][ j] ≥ M[i][ j + 1]). We
    are interested in efficient algorithms for finding peaks in A. Solve the following exercises.
    7.1 Give an algorithm that takes Θ(n^2) time*/

    public static void main(String[] args) {
        int n = 5;
        int[][] M = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = (int) (Math.random() * 100);
                System.out.println("" + M[i][j]);
            }
        }

        System.out.println(findPeak(M, n));


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = (int) (Math.random() * 100);
                System.out.println("" + M[i][j]);
            }
        }


    }

    private static int findPeak(int[][] M, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println("M[i][j]: " + M[i][j] );

                if (M[i][j] >= M[i - 1][j] && M[i][j] >= M[i][j - 1] &&
                        M[i][j] >= M[i + 1][j] && M[i][j] >= M[i][j + 1]) {
                    return M[i][j];
                }
            }
        }
           /* M[i][ j] ≥ M[i − 1][ j], M[i][ j] ≥ M[i][ j − 1], M[i][ j] ≥ M[i + 1][ j]
    and M[i][ j] ≥ M[i][ j + 1]). We*/

        //   return peak;
        return -1;
    }
}
