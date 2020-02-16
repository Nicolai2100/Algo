package Uge2;

import java.util.Scanner;

public class Opgave2Merge {


    public static void main(String[] args) {

        /*  Line 1: The number N of integers in the first array.
                Line 2: N sorted integers separated by space (corresponding to the first list)
        Line 3: The number M of integers in the second array.
                Line 4: M sorted integers separated by space (corresponding to the second list)*/

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

        for (int i : merge(AN, N, AM, M)) {
            System.out.print(i + " ");
        }
    }

    /*Scan both arrays left-to-right. In each step:
• Insert smallest of the two entries in new array.
• Move forward in array with smallest entry.
• Repeat until input array exhausted.*/
    public static int[] merge(int[] AN, int N, int[] AM, int M) {

     /*   if (AN.length < 1)
            return -1;
*/
        int[] newArray = new int[N + M];
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