package Assignment2;

public class CaesarAs2 {

    private static final String LOOKUP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {


        int N = 17;
        String input = "A ^ L G ^ O ^ R ^ I T H M S ^ ^ ^";

        String[] inputs = input.split(" ");

        int countHats = 0;
        int i = N - 1;
        String printString = "";
        while (i > -1) {


            if (inputs[i].equalsIgnoreCase("^")) {
                countHats = 1;
                for (int j = i - 1; j > 0; j--) {
                    if (!inputs[j].equalsIgnoreCase("^")) {
                        break;
                    } else {
                        ++countHats;
                    }
                }
                i = i - countHats * 2;
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
}
