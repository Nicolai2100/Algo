package Assignment1;

import java.util.Scanner;

public class ComboBreaker_2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int N = scanner.nextInt();
        String moves ComboBreaker_2= "";

        for (int i = 0; i < N; i++) {

            moves += scanner.next() + " ";
        }
        scanner.close();*/

        //System.out.println(moves);

        //String moves = "C L R C S R C L";
        //String moves = "C R L S R L C S L L C R S L R C S";
        //moves = moves.replaceAll("\\s", "").toUpperCase();
        method("C L R C S R C L");
    }

    public static void method(String moves) {
        String[] moves2 = moves.split(" ");
        int lastIndexOfBlock = -1;
        int movesLength = moves2.length;
        String search = "";

        for (int i = 0; i < movesLength; i++) {
          //  if (i + 3 < movesLength) {
            if (i <= movesLength - 4) {
                search = moves2[i] + moves2[i + 1] + moves2[i + 2] + moves2[i + 3];

                if (search.contains("C") && search.contains("L")
                        && search.contains("R") && search.contains("S")) {
                        System.out.print("F ");
                        i = i + 3;
                    }
                 else {
                    doSwitch(moves2[i]);
                }
            } else {
                doSwitch(moves2[i]);
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