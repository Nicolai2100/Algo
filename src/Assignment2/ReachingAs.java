package Assignment2;

import java.util.Scanner;

public class ReachingAs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int N = Integer.parseInt(scan.nextLine());

        int N = 5;
        int[] nums = new int[N];
        boolean[] bools = new boolean[N];
        for (int i = 0; i < N; i++) {
            nums[i] = i;
            bools[i] = true;
        }
        worstPeaks(nums, bools,0, N - 1);

        for (boolean bool:bools) {
            System.out.println(bool);
        }


        //out
        //A space-separated list of indices in increasing order, denoting all possible worst-case indices.
    }

    // Print alle tal der aldrig bliver m
    public static int worstPeaks(int[] A, boolean[] B, int i, int j) {
        int m = (i + j) / 2;
        B[m] = false;

        try {
            if (A[m] >= A[m - 1] && A[m] >= A[m + 1])
                return m;
            if (A[m] < A[m - 1]) {
                return worstPeaks(A, B, i, m - 1);
            } else if (A[m] < A[m + 1])
                return worstPeaks(A, B, m + 1, j);
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
        return m;
    }
}



/*PEAK3(A,i,j)
m = ⎣(i+j)/2)⎦
if A[m] ≥ neighbors return m
elseif A[m-1] > A[m]
return PEAK3(A,i,m-1)
elseif A[m] < A[m+1]
return PEAK3(A,m+1,j) */

