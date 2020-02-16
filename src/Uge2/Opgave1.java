package Uge2;

import java.util.Scanner;

/*BinarySearch(A,i,j,x)
 if j < i return false
 m = ⎣i+j/2⎦
 if A[m] = x return true
elseif A[m] < x return BinarySearch(A,m+1,j,x)
else return BinarySearch(A,i,m-1,x) // A[m] > x */


public class Opgave1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] AN = new int[N];
        for (int i = 0; i < N; i++) {
            AN[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] AM = new int[M];
        for (int i = 0; i < M; i++) {
            AM[i] = scanner.nextInt();
        }




        /*   int N = 3;
        int[] AN = {1, 5, 7};
        int M = 2;
        int[] AM = {5, 6};*/

        for (int i = 0; i < M; i++) {
            System.out.println(BinarySearch(AN, 0, N - 1, AM[i]));
        }
    }

/*BinarySearch(A,i,j,x)
 if j < i return false
 m = ⎣i+j/2⎦
 if A[m] = x return true
elseif A[m] < x return BinarySearch(A,m+1,j,x)
else return BinarySearch(A,i,m-1,x) // A[m] > x */

    public static int BinarySearch(int[] A, int i, int j, int x) {

        if (A.length < 1) {
            return -1;
        }
        if (j < i)
            return -1;

        int m = (i + j) / 2;

        if (m == A.length) {
            return -1;
        }
        if (A[m] == x)
            return m;

    /*    if (m+1 == A.length || m - 1 < 0){
            return -1;
        }*/

        if (A[m] < x)
            return BinarySearch(A, m + 1, j, x);
            // A[m] > x
        else
            return BinarySearch(A, i, m - 1, x);

    }
}


