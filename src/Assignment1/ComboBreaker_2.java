package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ComboBreaker_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] moves = new String[N];

        for (int i = 0; i < N; i++) {
            moves[i] = scanner.next();
        }
        scanner.close();
        method(moves);
    }


    public static void method(String[] moves) {
        String search = "";

        for (int i = 0; i < moves.length; i++) {
            if (i <= moves.length - 4) {
                search = moves[i] + moves[i + 1] + moves[i + 2] + moves[i + 3];

                if (search.contains("C") && search.contains("L")
                        && search.contains("R") && search.contains("S")) {
                    System.out.print("F ");
                    i = i + 3;
                } else {
                    doSwitch(moves[i]);
                }
            } else {
                doSwitch(moves[i]);
            }
        }
    }

    private static void doSwitch(String letter) {
        switch (letter) {
            case "C":
                System.out.print("M ");
                break;
            case "L":
                System.out.print("E ");
                break;
            case "R":
                System.out.print("C ");
                break;
            case "S":
                System.out.print("S ");
        }
    }
}
