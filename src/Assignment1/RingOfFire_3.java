package Assignment1;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Scanner;

public class RingOfFire_3 {


    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int N, C, K;

/*
        N = scanner.nextInt();
        C = scanner.nextInt();
        K = scanner.nextInt();
*/
        scanner.close();
        N = 11;
        C = 2;
        K = 3;
        //Nul-indekseret
        ArrayList<Integer> allStudents = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            allStudents.add(i + 1);
        }

        //Et-indekseret
        //int tæller = N;
        // int mainIndex = 1;
        int tæller = N;
        for (int mainIndex = 1; tæller > K; mainIndex++) {

            if (((mainIndex+1) % C) == 0) {

                allStudents.remove((mainIndex) % allStudents.size());
                --tæller;


                mainIndex -=1;

            }




        }


/*        for (int tæller = N; tæller > K; tæller--) {

            if (mainIndex % C == 0) {
                allStudents.remove(((mainIndex - 1)));
                mainIndex = mainIndex+1;
                --tæller;
            }
            ++mainIndex;
        }*/

        for (int i = 0; i < allStudents.size(); i++) {
            System.out.print(allStudents.get(i) + " ");
        }
    }
}