package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReachingAs4 {
    static int N;
    static int runTimes = 0;
    static ArrayList<Integer> ms;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int N = Integer.parseInt(scan.nextLine());
        //N = 12;
        // 1 4 7 9 11
       // N = 5;
       //1 4
        N = 20;
        // 3 8 13 16 19
        ArrayList<Integer> worsts = new ArrayList<>();
        int[] numsRising = new int[N];
        int[] numsDecreasing = new int[N];
        boolean[] bools = new boolean[N];
        for (int i = 0; i < N; i++) {
            numsRising[i] = i;
            numsDecreasing[N - (i + 1)] = i;
            bools[i] = true;
        }

        ms = new ArrayList<>();
        worstPeaks(ms, numsRising, 0, N - 1);

        for (int str : ms) {
            System.out.print(str + " ");
        }
    }

    // Print alle tal der aldrig bliver m
    public static int worstPeaks(ArrayList<Integer> ms, int[] A, int i, int j) {
        int m = (i + j) / 2;
        if (!ms.contains(m)) {
            // 3 8 13 16 19
            //((m + 1) +j) / 2 != m &&
            //!ms.contains((i + m - 1) / 2)

            if (((i + m - 1) / 2) == m && (((m + 1) + j) / 2) == m) {
                return m;
            }

           /* if (i > m - 1) || (((m + 1) < j) / 2) == m) {
                return m;
            }*/

            //           alle m -  if ((i + m - 1) / 2 != m && !ms.contains((i + m - 1) / 2)){


           /* if (((i + m - 1) / 2 != m && !ms.contains((i + m - 1) / 2))) {
                ms.add(m);
                return m;
            }*/


            if (((i + m - 1) / 2) == m || (((m + 1) + j) / 2) == m) {
                if (!(m-1 < 0) && j >= m ){
                    ms.add(m);
                    return m;

                }
            }
            //           alle m -  if ((i + m - 1) / 2 != m && !ms.contains((i + m - 1) / 2)){
        }

        if (!(i > m - 1)) {
            worstPeaks(ms, A, i, m - 1);
        }
        if (!(m + 1 > j)) {
            worstPeaks(ms, A, m + 1, j);
        }

        return m;
    }
}