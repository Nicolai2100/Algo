package Uge5;

import java.awt.*;
import java.util.Scanner;

public class As1 {
    public static int[][] inputList;
    static int numOfNodes, numOfEdges, numOfNeighbourQueri, node;
    /*4
    3
    0 1
    1 2
    2 3
    2
    0 3
    1 0
    1
    2*/

    /*Expected Output
    NO
    YES
    1 3*/
    public static void main(String[] args) {
        numOfNodes = 4;
        numOfEdges = 3;

        Scanner scan = new Scanner(System.in);
        int[][] inputList = new int[numOfEdges][2];

        // instaList();
        int[] inputs;
        /*for (int i = 0; i < numOfEdges; i++) {
            inputs = new int[2];
            inputs[0] = scan.nextInt();
            inputs[1] = scan.nextInt();
            inputList[i] = inputs;
        }*/

        for (int i = 0; i < numOfEdges; i++) {
            inputs = new int[2];
            inputs[0] = i;
            inputs[1] = i + 1;
            inputList[i] = inputs;
        }
        numOfNeighbourQueri = 2;
        Point[] neighborQueris = new Point[numOfNeighbourQueri];
       /* Point point;
        for (int i = 0; i < numOfNeighbourQueri; i++) {
            point = new Point();
            point.x = 0;
            point.y = 3;
        }*/
        Point point = new Point();
        point.x = 0;
        point.y = 3;
        neighborQueris[0] = point;
        point = new Point();
        point.x = 0;
        point.y = 1;
        neighborQueris[1] = point;


        for (Point p : neighborQueris) {

            for (int i = 0; i < inputList.length; i++) {
                if (inputList[i][0] == p.x && inputList[i][1] != p.y) {
                    System.out.println("NO");
                } else if (inputList[i][0] == p.x && inputList[i][1] == p.y) {
                    System.out.println("YES");
                }
            }
        }

        //Next Q_2 lines: The node v which neighbours must be printed
        node = 2;

        // er disse naboer
        // 0 3
        // 1 0

        //Print naboer
        int[] neighbors = new int[2];
        for (
                int i = 0;
                i < inputList.length; i++) {
            if (i != node && inputList[i][1] == node) {
                neighbors[0] = inputList[i][0];
            }
        }

        neighbors[1] = inputList[node][1];
        for (
                int snaps : neighbors) {
            System.out.print(snaps + " ");

        }
        System.out.println();


        /*
        for (int[] snaps : inputList) {
            for (int i = 0; i < snaps.length; i++) {
                System.out.print(snaps[i] + " ");
            }
            System.out.println();
        }*/



     /*   int[][] adjecencyList = new int[numOfNodes][2];

        for (int i = 0; i < numOfNodes; i++) {
            adjecencyList[i][0] = i;
            adjecencyList[i][1] = 0;
        }

        for (int[] snaps : adjecencyList) {
            for (int i = 0; i < snaps.length; i++) {
                System.out.println(snaps[i]);
            }
        }
*/
/*        for (int i = 0; i < numOfNodes; i++) {
            adjecencyList.get(i)[1] =
        }

                ArrayList<int[]> adjecencyList = new ArrayList<>();

        for (int i = 0; i < numOfNodes; i++) {
            int[] edges = new int[2];
            edges[0] = i;
            adjecencyList.add(edges);
        }

        */


    }

    public static void instaList() {


    }
}
