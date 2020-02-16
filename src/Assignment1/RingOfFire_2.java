package Assignment1;

import java.util.Scanner;

public class RingOfFire_2 {


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

/*
        N = 5000;
        C = 10000;
        K = 1000;
*/
        //Nul-indekseret
        boolean[] allStudents = new boolean[N];

        //Et-indekseret
        int tæller = N;
        int mainIndex = 1;
        int countOfFalse = 1;

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

        //Nul-indekseret
        for (int i = 0; i < allStudents.length; i++) {
            if (!allStudents[i])
                System.out.print(i + 1 + " ");
        }
        System.out.println("\n");

        return allStudents;
    }
}

/*  if (!allStudents[((mainIndex - 1) % N)]) {
//fejlen er at den ikke tæller hver anden - der er true - men også hver anden der er false
            }*/