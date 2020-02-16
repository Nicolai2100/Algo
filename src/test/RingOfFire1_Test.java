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
        assertTrue(bools[3-1]);

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
}