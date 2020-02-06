package Uge1;

import java.util.Scanner;

public class Opgave2 {

    /*Line 1: The number N of integers in the array (1 < N).
Line 2: The integers in the array separated by a space.
Output format
Line 1: The index (0-indexed) of the found peakpoint in the array.

FINDMAX(A, n)
max = 0
 for i = 0 to n-1
if (A[i] > A[max]) max = i
return max
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        //int N = 15;
        //int[] A = {1, 3, 7, 15, 17, 11, 2, 3, 6, 8, 7, 5, 9, 5, 23};

        if (N < 1)
            return;
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > A[max]) {
                max = i;
            }
        }
        System.out.println(max);
        return;
    }
}
