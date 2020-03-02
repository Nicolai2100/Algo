package Assignment1;

import java.util.Scanner;

public class RingOfFire_2 {


    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int N, C, K;

        N = scanner.nextInt();
        C = scanner.nextInt();
        K = scanner.nextInt();
        scanner.close();
       /* N = 11;
        C = 2;
        K = 0;*/
        //Nul-indekseret
        boolean[] allStudents = new boolean[N];

        //Et-indekseret
        int tæller = N;
        int mainIndex = 1;
        int countOfFalse = 1;

        if (C == 0) {
            for (int i = 0; i < N - K; i++) {
                allStudents[i] = true;
                System.out.println("0");
            }
        } else if (K == 0) {
            for (int i = 0; i < N; i++) {
                allStudents[i] = true;
                System.out.println("0");
            }
        } else if (N == 0) {
            System.out.println("0");
        } else {
            while (tæller > K) {
                if (!allStudents[((mainIndex - 1) % N)]) {
                    if (countOfFalse % C == 0) {
                        allStudents[(mainIndex - 1) % N] = true;
                        --tæller;
                    }
                    ++countOfFalse;
                }
                ++mainIndex;
            }
        }

        for (int i = 0; i < allStudents.length; i++) {
            if (!allStudents[i])
                System.out.print(i + 1 + " ");
        }
    }
}