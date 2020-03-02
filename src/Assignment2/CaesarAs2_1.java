package Assignment2;

public class CaesarAs2_1 {

    private static final String LOOKUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {


        /*int N = 17;
        String input = "A ^ L G ^ O ^ R ^ I T H M S ^ ^ ^";
        */
        int N = 12;
        String input = "H E L L O 3 ^ T L O I A";

        String[] inputs = input.split(" ");

        int countHats = 0;
        int i = N - 1;
        String printString = "";
        while (i > -1) {

            if (isInteger(inputs[i])) {
                System.out.println("snap");
            }

            if (inputs[i].equalsIgnoreCase("^")) {
                countHats = 1;
                for (int j = i - 1; j > -1; j--) {
                    if (inputs[j].equalsIgnoreCase("^")) {
                        ++countHats;
                    } else if (isInteger(inputs[j])) {
                        countHats = 0;
                        i --;
                        break;
                    } else {
                        // If string
                        i = i - countHats * 2;
                        break;
                    }
                }
            }

            if (i > -1 && !inputs[i].equalsIgnoreCase("^")) {
                // System.out.print(inputs[i] + " ");
                printString += inputs[i] + " ";
                i--;
            }

        }
        for (int ii = printString.length() - 1; ii >= 0; ii--) {
            System.out.print(printString.charAt(ii));
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
