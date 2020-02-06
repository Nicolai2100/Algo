package Uge1;

import java.util.Scanner;

public class Opgave3 {
    /*Line 1: The number N of integers in the array (1 < N).
    Line 2: The integers in the array separated by a space.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(Peak3(A, 0, A.length));
    }

    /*PEAK3(A,i,j)
m = ⎣(i+j)/2)⎦
if A[m] ≥ neighbors return m
elseif A[m-1] > A[m]
return PEAK3(A,i,m-1)
elseif A[m] < A[m+1]
return PEAK3(A,m+1,j) */

    public static int Peak3(int[] A, int i, int j) {
        int m = (i + j) / 2;
        try {
            if (A[m] >= A[m - 1] && A[m] >= A[m + 1])
                return m;
            if (A[m] < A[m - 1])
                return Peak3(A, i, m - 1);
            else if (A[m] < A[m + 1])
                return Peak3(A, m + 1, j);
        } catch (IndexOutOfBoundsException e) {
            return m;
        }
        return -1;
    }
}