package Assignment2;

import java.util.Scanner;

public class CaesarAs2_2 {

    private static String printString = "";
    private static String[] inputs;

    public static void main(String[] args) {


        int N = 120;
        String input = "S T O P B U W 19 E 17 J 18 15 19 12 R 13 W 11 ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ K O T B 17 O F X Y G ^ ^ ^ ^ ^ ^ ^ V H D C D H N B P L S 14 20 H 16 R W 17 U 10 14 ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ S C Q 10 15 ^ ^ ^ ^ ^ Q H J M F I 13 19 13 ^ ^ ^ ^ ^ ^ ^ ^ ^ M B Y C Y P A ^ D";

/*
        int N = 30;
        String input = "W E L L D O N E Y O U N G P A D C Z I X 12 ^ ^ ^ ^ ^ O K O B";
*/

       /* int N = 9;
        String input = "A B C 1 ^ ^ A B C";*/
 /*       int N = 17;
        String input = "A ^ L G ^ O ^ R ^ I T H M S ^ ^ ^";
  */ /*     int N = 12;
        String input = "H E L L O 3 ^ T L O I A";
  *//*      int N = 15;
        String input = "A B C 1 ^ A B C 2 A ^ ^ A B C";
*/

        inputs = input.split(" ");
     /*   Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = scan.next();
        }*/

        int countHats;
        int i = N - 1;
        printString = "";
        while (i > -1) {
            if (!inputs[i].equalsIgnoreCase("^") && !isInteger(inputs[i])) {
                printString += inputs[i];
                i--;
            } else if (isInteger(inputs[i])) {
                printString = helpmeth(i);
                i--;
            } else if (inputs[i].equalsIgnoreCase("^")) {
                countHats = 1;
                for (int j = i - 1; j > -1; j--) {
                    if (inputs[j].equalsIgnoreCase("^")) {
                        ++countHats;
                    } else if (isInteger(inputs[j])) {
                        printString = helpmeth(j);
                    } else {
                        for (int k = 0; k < countHats; k++) {
                            i = i - 2;
                        }
                        countHats = -1;
                    }
                }
            }
        }
        for (int ii = printString.length() - 1; ii >= 0; ii--) {
            System.out.print(printString.charAt(ii) + " ");
        }
    }

    static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static String helpmeth(int i) {
        int shiftInt = Integer.parseInt(inputs[i]);
        String tempString = "";
        for (int j = 0; j < printString.length(); j++) {
            int cc = printString.charAt(j);
            cc += shiftInt;
            char c = (char) ((cc % 91));
            if (c < 65) {
                c += 65;
            }
            tempString += c;
        }
        return tempString;
    }
}
