package Uge1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Opgave1 {

    /*PEAK1(A, n)
if A[0] ≥ A[1] return 0
 for i = 1 to n-2
if A[i-1] ≤ A[i] ≥ A[i+1] return i
if A[n-2] ≤ A[n-1] return n-1 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        //int N = 15;
        //int[] A = {1, 3, 7, 15, 17, 11, 2, 3, 6, 8, 7, 5, 9, 5, 23};

        if (A[0] >= A[1]) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i <= N - 2; i++) {
            if (A[i - 1] <= A[i] && A[i] >= A[i + 1]) {
                System.out.println(i);
                return;
            }
        }
        if (A[N - 2] <= A[N - 1]) {
            System.out.println(N - 1);
            return;
        }
    }
}

/*15
1 3 7 15 17 11 2 3 6 8 7 5 9 5 23
Expected Output
4*/
