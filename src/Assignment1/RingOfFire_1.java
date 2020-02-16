package Assignment1;

import java.util.Scanner;

public class RingOfFire_1 {


    public static void main(String[] args) {
        method(null);
    }

    public static boolean[] method(int[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, C, K;
/*
        N = args[0];
        C = args[1];
        K = args[2];*/

        N = scanner.nextInt();
        C = scanner.nextInt();
        K = scanner.nextInt();

        //Nul-indekseret
        boolean[] allStudents = new boolean[N];
        for (int i = 0; i < N; i++) {
            allStudents[i] = true;
        }
        //Et-indekseret
        int tæller = N;
        int mainIndex = 1;
        int medTæller = 1;

        while (tæller > K) {
            if (allStudents[((mainIndex - 1) % N)]) {
                if (medTæller % C == 0) {
                    allStudents[(mainIndex - 1) % N] = false;
                    --tæller;
                }
                ++medTæller;
            }
            ++mainIndex;
        }

        //Nul-indekseret
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i])
                System.out.print(i + 1 + " ");
        }
        System.out.println("\n");

        return allStudents;
    }
}

/*  if (!allStudents[((mainIndex - 1) % N)]) {
//fejlen er at den ikke tæller hver anden - der er true - men også hver anden der er false
            }*/