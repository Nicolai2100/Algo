package Uge2;
/*Implement merge sort. Given a list of integers, you have to print the integers
in non-decreasing order. Do not use the built-in sorting functions here.

Input format
Line 1: The number N of integers in the array (0 ≤ N).
Line 2: NN integers separated by a space (in the interval [-1.000.000.000;
1.000.000.000][−1.000.000.000;1.000.000.000]).
Output format
Line i: The N integers from the input in non-decreasing order separated by space.
*/

import java.util.Arrays;
import java.util.Scanner;

/*MERGESORT(A,i,j)
if i < j
m =⎣i+j/2⎦
MERGESORT(A,i,m)
MERGESORT(A,m+1,j)
MERGE(A, i, m, j)*/
public class Opgave3MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] AN = new int[N];
        for (int i = 0; i < N; i++) {
            AN[i] = scanner.nextInt();
        }
        for (int i : mergeSort2(AN)) {
            System.out.println(i + " ");
        }
    }

    public static int[] mergeSort2(int[] A) {

        if (A.length > 1) {
            int m = (A.length) / 2;

            int[] left = mergeSort2(Arrays.copyOfRange(A, 0, m));
            int[] right = mergeSort2(Arrays.copyOfRange(A, m, A.length));
            return merge2(left, right);
        }
        return A;
    }

    public static int[] merge2(int[] AN, int[] AM) {

     /*   if (AN.length < 1)
            return -1;
*/
        int[] newArray = new int[AN.length + AM.length];
        int ANPointer = 0;
        int AMPointer = 0;
        int newArrayPointer = 0;

        while (newArrayPointer < (newArray.length)) {
            if (ANPointer == AN.length) {
                newArray[newArrayPointer] = AM[AMPointer];
                ++newArrayPointer;
                ++AMPointer;
            } else if (AMPointer == AM.length) {
                newArray[newArrayPointer] = AN[ANPointer];
                ++newArrayPointer;
                ++ANPointer;
            } else if (AN[ANPointer] == AM[AMPointer]) {
                newArray[newArrayPointer] = AN[ANPointer];
                ++newArrayPointer;
                ++ANPointer;
                newArray[newArrayPointer] = AM[AMPointer];
                ++newArrayPointer;
                ++AMPointer;
            } else if (AN[ANPointer] > AM[AMPointer]) {
                newArray[newArrayPointer] = AM[AMPointer];
                ++newArrayPointer;
                ++AMPointer;
            }
            //Hvis det er omvendt
            else if ((AN[ANPointer] < AM[AMPointer])) {
                newArray[newArrayPointer] = AN[ANPointer];
                ++newArrayPointer;
                ++ANPointer;
            }
        }
        return newArray;
    }
}

