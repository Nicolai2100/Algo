package Assignment3;

import java.util.*;

public class CombustingConcoctions {

    public static int numOfIngredients, numOfPairWise;

    public static void main(String[] args) {
    /*    numOfIngredients = 6;
        numOfPairWise = 6;*/

/*        int[][] ingredients = new int[numOfIngredients * 2][2];
        ingredients[0][0] = 0;
        ingredients[0][1] = 1;
        ingredients[1][0] = 1;
        ingredients[1][1] = 2;
        ingredients[2][0] = 2;
        ingredients[2][1] = 3;
        ingredients[3][0] = 3;
        ingredients[3][1] = 4;
        ingredients[4][0] = 1;
        ingredients[4][1] = 5;
        ingredients[5][0] = 3;
        ingredients[5][1] = 5;*/


        /*int[][] ingredients = new int[numOfIngredients * 2][2];
        numOfIngredients = 5;
        numOfPairWise = 5;
        ingredients[0][0] = 0;
        ingredients[0][1] = 1;
        ingredients[1][0] = 1;
        ingredients[1][1] = 2;
        ingredients[2][0] = 2;
        ingredients[2][1] = 3;
        ingredients[3][0] = 3;
        ingredients[3][1] = 4;
        ingredients[4][0] = 2;
        ingredients[4][1] = 4;*/


        Scanner scan = new Scanner(System.in);
        numOfIngredients = scan.nextInt();
        numOfPairWise = scan.nextInt();

        int[][] ingredients = new int[numOfIngredients * 2][2];
        Graph graph = new Graph(numOfIngredients);

        for (int i = 0; i < numOfIngredients; i++) {
            graph.addEdge(scan.nextInt(), scan.nextInt());
        }
        /*
        for (int i = 0; i < numOfIngredients; i++) {
            graph.addEdge(ingredients[i][0], ingredients[i][1]);
        }*/

        graph.addVertex();
        graph.addVertex();

     /*   for (Vertex vert : graph.vertices) {
            System.out.println(vert.numInList + " " + vert.edges);
        }*/
        boolean boom = false;

        for (int i = 0; i < graph.vertices.size() - 2; i++) {
            if (!graph.vertices.get(graph.vertices.size() - 2).vertexContainsEdges(graph.vertices.get(i).edges)) {
                graph.addEdge(graph.vertices.get(i).numInList, graph.vertices.get(graph.vertices.size() - 2).numInList);
            } else if (!graph.vertices.get(graph.vertices.size() - 1).vertexContainsEdges(graph.vertices.get(i).edges))
                graph.addEdge(graph.vertices.get(i).numInList, graph.vertices.get(graph.vertices.size() - 1).numInList);
            else {
                System.out.println("BOOM!");
                boom = true;
                break;
            }
        }

        if (!boom) {
            graph.numberOfNeighbo(graph.vertices.get(graph.vertices.size() - 2).numInList);
            graph.numberOfNeighbo(graph.vertices.get(graph.vertices.size() - 1).numInList);
        }
    }

    public static class Vertex {
        public int numInList;
        ArrayList<Integer> edges;


        public Vertex(int num) {
            this.numInList = num;
            edges = new ArrayList<>();
        }

        public boolean vertexContainsEdges(ArrayList<Integer> edges2) {
            for (Integer edge2 : edges2) {
                if (edges.contains(edge2))
                    return true;
            }
            return false;
        }
    }

    public static class Graph {
        int numOfNodes;
        int numOfEdges;
        List<Vertex> vertices;
        int[][] adjacencyMatrix;


        private Graph(int nodes) {
            this.numOfNodes = nodes;
            vertices = new ArrayList<>();
/*
            adjacencyMatrix = new int[numOfNodes][numOfNodes];
            for (int i = 0; i < numOfNodes; i++) {
                adjacencyMatrix[i][0] = i;
                adjacencyMatrix[0][i] = i;
            }
*/
            Vertex vertex;
            for (int i = 0; i < numOfNodes; i++) {
                vertex = new Vertex(i);
                vertices.add(vertex);
            }
        }

        public void addVertex() {
            vertices.add(new Vertex(vertices.size()));
        }

        public void addEdge(int node1, int node2) {
            if (!vertices.get(node1).edges.contains(node2)) {
                vertices.get(node1).edges.add(node2);
            }
            if (!vertices.get(node2).edges.contains(node1)) {
                vertices.get(node2).edges.add(node1);
            }
                /*
            adjacencyMatrix[node1][node2] = 1;
            adjacencyMatrix[node2][node1] = 1;*/

        }

        public boolean isNeighbours(int node1, int node2) {
            return (vertices.get(node1).edges.contains(node2));

           /* if (adjacencyMatrix[node1][node2] == 1)
                System.out.println("YES");
            else
                System.out.println("NO");*/
        }

        public void numberOfNeighbo(int targetNode) {
            ArrayList<Integer> neighbors = new ArrayList<>();
            for (Integer edge : vertices.get(targetNode).edges) {
                if (edge != targetNode) {
                    System.out.print(edge + " ");
                    // neighbors.add(edge);
                }
            }
            System.out.println();
          /*  for (int i = 0; i < adjacencyMatrix.length; i++) {
                if (adjacencyMatrix[targetNode][i] == 1)
                    System.out.println(i + " ");
            }
            System.out.println();*/
        }
    }

}
