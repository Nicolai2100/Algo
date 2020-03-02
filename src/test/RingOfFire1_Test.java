package test;

import Assignment1.RingOfFire_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RingOfFire1_Test {

    /*  /*   N = 3;
        C = 2;
        K = 1;*/
    //virker
      /*  N = 11;
        C = 2;
        K = 3;

    N =5;
    C =2;
    K =3;*/


    @Test
    void main() {
        int[] args = {3, 2, 1};
        boolean[] bools = RingOfFire_1.method(args);
        assertTrue(bools[3 - 1]);

        args[0] = 5;
        args[1] = 2;
        args[2] = 3;
        bools = RingOfFire_1.method(args);
        assertTrue(bools[1 - 1]);
        assertTrue(bools[3 - 1]);
        assertTrue(bools[5 - 1]);

        args[0] = 11;
        args[1] = 2;
        args[2] = 3;
        bools = RingOfFire_1.method(args);
        assertTrue(bools[3 - 1]);
        assertTrue(bools[7 - 1]);
        assertTrue(bools[11 - 1]);

    }

    @Test
    void name() {

        String[] chars = new String[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = Character.toString((char) 65 + i);
        }
        /*int denne = ((251 + 76-65) % 25)-1;
        if (shiftInt + cc > 90) {
            denne = ((shiftInt + cc - 65) % 25) - 1;
        } else {
            denne = ((shiftInt + cc - 65) % 25);
        }*/

//        D 251 L V
//        int denne = ((251 + 76-65) % 25)-1;
        int denne = ((251 + 76 - 66) % 25);
      /*  System.out.println(chars[denne]);
        denne = ((251 + 86 - 66) % 25);
        System.out.println(chars[denne]);


        *//*251 L V 332 S ^ E T*//*

        denne = ((26 + 86 - 66) % 25);
        System.out.println(chars[denne]);
*/

//        E T
        //       (332+69-65) = 336
      /*  denne = ((332 + 68 - 65) % 27);
        char c = (chars[denne]).charAt(0);
        System.out.println(chars[denne]);
        denne = ((251 + Character.valueOf(c) - 66) % 25);
        System.out.println(chars[denne]);
*/

        System.out.println(runner(chars, 332, 68 - 65 + 1));


    }

    String runner(String[] A, int runTime, int initial) {
        String temp = "";
        for (int i = 0; i < runTime; runTime--) {
            temp = A[initial + i];
            if (i == A.length) {
                i = 0;
            }
        }
        return temp;
    }
}