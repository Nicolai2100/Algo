package test;

import Uge1.Opgave2;
import Uge2.Opgave1;
import Uge2.Opgave2Merge;
import Uge2.Opgave3MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opgave1Test {

    @Test
    void BINARYSEARCH() {


        int N = 6;
        int[] AN = {2, 7, 9, 11, 13, 17};
        int M = 21;
        int[] AM = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < M; i++) {

            System.out.println(Uge2.Opgave1.BinarySearch(AN, 0, N, AM[i]));
        }
    }

    @Test
    void mergeSort() {

        int N = 4;
        int[] AN = {1, 3, 2, 4};

//        Opgave3MergeSort.mergeSort2(AN, 0, N - 1);

        for (int index: Opgave3MergeSort.mergeSort2(AN)) {
            System.out.print(""+index);
        }
/*

        for (int index: Opgave3MergeSort.merge(AN, 0, 2, N)) {
            System.out.print(""+index);
        }
*/

/*
        for (int i : Opgave3MergeSort.mergeSort(AN, 0, N - 1)) {
            System.out.print("" + i);
        }
*/
    }

    @Test
    void merge() {
        int N = 3;
        int[] AN = {2, 4, 6};
        int M = 3;
        int[] AM = {1, 3, 5};
        int[] newArr = Opgave2Merge.merge(AN, N, AM, M);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);

        }

        N = 5;
        int[] AN2 = {1, 1, 1, 5, 6};
        M = 5;
        int[] AM2 = {1, 2, 5, 7, 7};
        newArr = Opgave2Merge.merge(AN2, N, AM2, M);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);

        }

    }
}