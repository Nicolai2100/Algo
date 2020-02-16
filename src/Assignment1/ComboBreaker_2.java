package Assignment1;

import java.util.Scanner;

public class ComboBreaker_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String moves = "";

        for (int i = 0; i < N; i++) {
            moves += scanner.next();
        }
        scanner.close();
        //System.out.println(moves);
        //System.out.println(moves);
        method(moves);
    }

    public static void method(String moves) {
        //String moves = "C L R C S R C L";
        //String moves = "C R L S R L C S L L C R S L R C S";
        moves = moves.replaceAll("\\s", "").toUpperCase();
        //   System.out.println(moves);
        int lastIndexOfBlock = -1;
        int movesLength = moves.length();
        for (int i = 0; i < movesLength; i++) {
            //i + 4 eller 3?
            if (i + 3 < movesLength) {
                if (moves.substring(i, i + 4).contains("C") && moves.substring(i, i + 4).contains("L")
                        && moves.substring(i, i + 4).contains("R") && moves.substring(i, i + 4).contains("S")) {
                    if (i > lastIndexOfBlock) {
                        System.out.print("F ");
                        lastIndexOfBlock = i + 3;
                    } else {
                        //tilhører tidligere F blok
                    }
                } else if (i > lastIndexOfBlock) {
                    doSwitch(moves.substring(i, i + 1));
                }
            } else if (i > lastIndexOfBlock) {
                doSwitch(moves.substring(i, i + 1));
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
