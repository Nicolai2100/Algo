package Uge1;

import java.util.Scanner;

public class Opgave5_4 {

    /*5.4 [BEng∗†] Write pseudo code for an iterative variant of the recursive algorithm for finding peaks. Implement it and
    test it.*/

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        */
        int A[] = {10, 2, 4, 3, 5, 20};

        System.out.println(Peak3(A, 0, A.length));
    }

    public static int Peak3(int[] A, int i, int j) {
        int m = (i + j) / 2;
        try {
            //Opgave 5.4 så længe A[m] ikke er top punkt
            while (true) {
                if (A[m] >= A[m - 1] && A[m] >= A[m + 1])
                    return m;
                if (A[m] < A[m - 1]) {
                    m -= 1;
                } else if (A[m] < A[m + 1]) {
                    m += 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return m;
        }
    }
}