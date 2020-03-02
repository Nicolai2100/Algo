package Assignment2;

public class CaesarAs2_5 {

    private static String printString = "";
    private static String printStringArr[];
    private static String[] inputs;
    private static String[] chars;
    private static int head = 0;

    public static void main(String[] args) {

        chars = new String[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = Character.toString((char) 65 + i);
        }

       String input = "D 251 L V 332 S ^ E T 659 T A L 934 Z N ^ Q K 227 V 693 ^ 524 903 ^ M 677 B ^ 249 J Q 674 308 C U 168 U 262 F B ^ 282 W 182 Q 155 153 Q X 823 J 350 925 R 389 832 959 F ^ 870 927 T 205 713 821 R 826 589 472 829 C Y I 531 W ^ H 538 A 436 X 251 S 537 Z N P 313 T Z ^ K M 668 272 T B O 972 X 246 R ^ A 544 ^ 534 ^ 857 M F 310 681 500 922 G N 137 O V M Q 564 ^ S C Q A ^ U 840 530 R O 524 G 920 252 912 A 168 812 298 P ^ C 219 ^ M F 157 M X O K 743 Y 243 S Z Z C N F 523 416 889 D O 787 F 837 G T Z A S 438 551 ^ 202 999 128 ^ D C V F P O A 833 ^ R L ^ 519 C K 687 497 V 862 N P 691 J ^ 302 799 ^ P G T V 408 A Q 916 902 N ^ 799 B 270 Y M 987 P 198 272 ^ 464 T Q A ^ Y C X 206 503 401 361 ^ 765 544 351 311 323 193 L 294 K 797 521 531 177 523 I 807 659 ^ 961 ^ W U 527 N M D X U D G 968 N 632 M I 549 ^ J 381 L X 984 F ^ Y 337 I S 589 ^ O 525 ^ F Z ^ A 343 308 859 W 654 Q ^ 726 Z ^ C S 309 P C 979 755 474 961 T 579 N I 430 R ^ 943 925 Y L 308 765 Y 618 S Y I J ^ 664 ^ V G ^ 231 314 ^ 287 Q 975 851 V 807 403 999 ^ ^ 748 Q 288 787 R B 267 749 M 314 330 178 989 ^ G V P B ^ W ^ 584 ^ W L 704 ^ K J 493 528 515 164 578 629 E T 433 759 204 S O Q A 695 N M 627 B W 962 158 841 W 228 N 691 951 863 Y A ^ 578 X 553 640 785 937 754 I V 429 O 957 812 U 299 280 449 764 ^ 921 821 M T P ^ D W 199 145 ^ C 537 D ^ G 742 R 442 Z F R M 280 X F 697 P 367 212 470 ^ H ^ K A R Z ^ ^ 145 O 792 ^ C U K G K 658 ^ 977 P A B 558 195 ^ 793 409 762 Z 780 L D 789 564 L O P 690 H 593 O H Q J 424 L H Z Z ^ G 314 D 717 Z 861 R 381 J 489 M 947 439 ^ ^ P D 998 M 354 F D 493 P 644 367 F ^ 497 K O X O 936 E 929 J C F T 720 768 632 P E T L O N 698 M 618 797 ^ 896 O O 971 T A 167 266 E 796 B 505 O L 129 M 726 989 L D F ^ N Q H 436 D J H T ^ 360 ^ 485 F X 592 559 B O 923 D ^ ^ J Y M B K 703 J 627 O 703 155 H S 451 V P 120 T 978 453 578 812 617 637 G 196 S 739 T M I P X 379 C 172 630 H Q O R ^ 199 912 H Y 100 J Z D 814 831 619 D 672 ^ X ^ 718 262 675 231 933 F T H M 705 974 120 N 313 966 ^ 774 L 252 H 381 745 U ^ Q K ^ Q 256 A 206 816 ^ 395 M I ^ 483 ^ P S W N 161 L 422 M N A 559 F 449 ^ 505 940 V H B S ^ P D H E C 255 848 L 504 E 680 520 O 755 ^ W Z O K 625 C 394 J 694 M H 525 O ^ S N 230 P D 602 C Z P D T 877 859 715 A Y 863 361 W G X J 737 J ^ O B 905 463 Z Q 929 A 533 791 H ^ H Z 510 668 666 L Z V 149 325 436 657 365 ^ D 475 X C 223 894 810 167 L P C 480 ^ C 224 571 363 264 N 912 Z 273 Y 256 708 K V 964 ^ G Z V S 442 240 R 631 946 689 953 F Q Z U F D 551 750 856 843 E Y N M C 403 V 443 539 ^ ^ 991 K 445 F 710 636 304 223 420 I 393 588 364 ^ U Y E 806 238 123 S Q B X 967 846 R T 986 O U U X 806 Y ^ O O E P F 419 628 ^ G 516 954 730 E 858 572 444 751 315 107 W B 454 A 757 O J 859 X 829 F N J 251 925 K 604 816 J 739 ^ I W ^ P 548 ^ Y H 670 543 R 333 ^ T C D 318 U S P I 502 D 612 U 784 273 962 J 634 231 N P 663 G ^ B ^ 498 W O ^ ";
        // String input = "K T ^ N 9";
        // String input = "O N L 380 207 1786 730 895 811 839 1298 N ^ ^ ^ ^ ^ ^ ^ ^ ^ 1745 441 R A V 1080 C 1742 B ^ ^ ^ ^ ^ ^ ^ ^ ^ E K D V U T K T Z O Y R 405 ^ ^ ^ R C F ^ R 286 Z F V J B 731 893 648 406 107 R ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ Z U C F W H V A G O Z Z C K G 1954 1781 E 1306 265 P ^ ^ ^ ^ ^ ^ ^ Q P U A A V 1819 U 1125 1637 1096 292 1186 S ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ";
        //String input = "S T O P B U W 19 E 17 J 18 15 19 12 R 13 W 11 ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ K O T B 17 O F X Y G ^ ^ ^ ^ ^ ^ ^ V H D C D H N B P L S 14 20 H 16 R W 17 U 10 14 ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ S C Q 10 15 ^ ^ ^ ^ ^ Q H J M F I 13 19 13 ^ ^ ^ ^ ^ ^ ^ ^ ^ M B Y C Y P A ^ D";
        //String input = "S T O P B U W 19 E 17 J 18 15 19 12 R 13 W 11 ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ K O T B 17 O F X Y G ^ ^ ^ ^ ^ ^ ^ ";
        //   String input = "19 17 18 15 19 12 13 11 17 14 2016 17 10 14 10 15 Q H J M F I 13 19 13 ^ ^ ^ M B Y C Y P D ";

      /*  int N = 30;
        String input = "W E L L D O N E Y O U N G P A D C Z I X 12 ^ ^ ^ ^ ^ O K O B";*/
       /* int N = 9;
        String input = "A B C 1 ^ ^ A B C";*/
 /*       int N = 17;
        String input = "A ^ L G ^ O ^ R ^ I T H M S ^ ^ ^";
  */ /*     int N = 12;
        String input = "H E L L O 3 ^ T L O I A";
  *//*      int N = 15;
        String input = "A B C 1 ^ A B C 2 A ^ ^ A B C";
*/
        inputs = input.split(" ", 0);
        int N = inputs.length;



        /*Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = scan.next();
        }*/

        printStringArr = new String[inputs.length];

        int countHats;
        int i = N - 1;
        printString = "";
        while (i > -1) {
            if (!inputs[i].equalsIgnoreCase("^") && !isInteger(inputs[i])) {
                printString = printString + inputs[i] + " ";
                i--;
            } else if (isInteger(inputs[i])) {
                printString = aschiiShift(i);
                i--;
                printString = printString + inputs[i + 1] + " ";
            } else if (inputs[i].equalsIgnoreCase("^")) {
                countHats = 1;
                for (int j = i - 1; j > -1; j--) {
                    if (inputs[j].equalsIgnoreCase("^")) {
                        ++countHats;
                    } else {
                        break;
                    }
                }
                i -= countHats;
                for (int k = 0; k < countHats; k++) {
                    if (isInteger(inputs[i])) {
                        printString = aschiiShift(i);
                    }
                    --i;
                }
            }
        }
     /*   for (int ii = printString.length() - 1; ii >= 0; ii--) {
            System.out.print(printString.charAt(ii));
        }*/
        String[] outs = printString.split(" ");
        for (int j = outs.length - 1; j > 0; j--) {
            System.out.print(outs[j] + " ");
        }
        System.out.println();
    }

    static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static String aschiiShift(int i) {
        int shiftInt = Integer.parseInt(inputs[i]);
        String tempString = "";
        for (int j = 0; j < printString.length(); j++) {
            if (!isInteger(String.valueOf(printString.charAt(j))) && printString.charAt(j) > 64 && printString.charAt(j) < 91) {
                int cc = printString.charAt(j);
                cc += shiftInt;
                tempString += chars[(cc - 65) % 26] + " ";
            } else if (printString.charAt(j) != 32) {
                try {
                    tempString = tempString + printString.charAt(j);

                } catch (Exception e) {

                }
            }
        }
        return tempString;
    }

    void addTo(String obj) {
        printStringArr[head] = obj;
        head++;
    }
}


