package Uge5;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class As1_4 {
    public static class Vertex {
        public int numInList;
        Set<Integer> edges;

        public Vertex(int num) {
            this.numInList = num;
            edges = new HashSet<>();
        }
    }

    public static int[][] inputList;
    static int numOfNodes, numOfEdges, numOfNeighbourQueriesQ1, numOfNeighbourQueriesQ2, node;
    ;
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Get number of edges and nodes
       /* numOfIngredients = 4;
        numOfPairWise = 3;*/
        numOfNodes = scan.nextInt();
        numOfEdges = scan.nextInt();
        Set<Integer>[] inputList = new HashSet[numOfEdges];

        // get all edges
        Set<Integer> inputs;
        for (int i = 0; i < numOfEdges; i++) {
            inputs = new HashSet();
            inputs.add(scan.nextInt());
            inputs.add(scan.nextInt());
            inputList[i] = inputs;
        }

        Vertex[] adjecencyList = new Vertex[numOfNodes];
        Vertex newVertex;
        //Opretter adjecencylisten
        for (int i = 0; i < numOfNodes; i++) {
            newVertex = new Vertex(i);
            adjecencyList[i] = newVertex;
        }

        for (Set<Integer> inputset : inputList) {
            for (Vertex adjVertex : adjecencyList) {
                if (inputset.contains(adjVertex.numInList)) {
                    Object[] objects = inputset.toArray();
                    for (Object object : objects) {
                        adjVertex.edges.add(Integer.parseInt(object.toString()));
                    }
                }
            }
        }



        // get number og neighbor queries
        //numOfNeighbourQueriesQ1 = 2;
        numOfNeighbourQueriesQ1 = scan.nextInt();
        Point[] neighborQueris = new Point[numOfNeighbourQueriesQ1];

        Point point;
        for (int i = 0; i < numOfNeighbourQueriesQ1; i++) {
            point = new Point();
            point.x = scan.nextInt();
            point.y = scan.nextInt();
            neighborQueris[i] = point;
        }

       /* point = new Point();
        point.x = 0;
        point.y = 3;
        neighborQueris[0] = point;
        point = new Point();
        point.x = 0;
        point.y = 1;
        neighborQueris[1] = point;*/

        //The number of Q2 queries
        //numOfNeighbourQueriesQ2 = 1;
        numOfNeighbourQueriesQ2 = scan.nextInt();

        //Next Q_2 lines:  The node v which neighbours must be printed
        //node = 2;
        ArrayList<Integer> neighbors = new ArrayList<>();

        for (int i = 0; i < numOfNeighbourQueriesQ2; i++) {
            node = scan.nextInt();
            //Liste af naboer
            for (Integer edge : adjecencyList[node].edges) {
                if (edge != node) {
                    neighbors.add(edge);
                }
            }

        }


        for (Point p : neighborQueris) {
            if (!adjecencyList[p.x].edges.contains(p.y)) {
                System.out.println("NO");
            } else if (adjecencyList[p.x].edges.contains(p.y)) {
                System.out.println("YES");
            }
        }

        for (int snaps : neighbors) {
            System.out.print(snaps + " ");
        }
    }
}

/*     // Test print
        for (Vertex vertex : adjecencyList) {
            for (Integer ints : vertex.edges) {
                System.out.print(ints);
            }
            System.out.println();
        }
        System.out.println("snap");*/
