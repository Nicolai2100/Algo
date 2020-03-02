package Uge4;

import java.util.Scanner;

public class StackOpgave {

    /*Implement a stack that can contain integers
    using a singly linked list. The stack must
    support the operations push and pop.
    Both operations must run in constant time.
    Do not use the built-in stack.
     */
    public static void main(String[] args) {

        /*8
enqueue 3
enqueue 5
enqueue 1
dequeue
enqueue 4
enqueue 2
dequeue
dequeue*/

        /*1
2
4*/
        Scanner scan = new Scanner(System.in);
        // int N = 8;
        int N = Integer.parseInt(scan.nextLine());
        StackImpl stack = new StackImpl(N);


        for (int i = 0; i < N; i++) {

            String input = scan.nextLine();

            if (input.substring(0, 2).equalsIgnoreCase("enqueue")) {
                stack.PU(Integer.parseInt(input.substring(3)));

            } else if (input.substring(0, 2).equalsIgnoreCase("dequeue")) {
                stack.PO();
            }
        }
    }

    class StackElem {
        int length;
        int head;
        int[] stackken;

        public StackElem(int value) {
            this.length = length;
            stackken = new int[length];

        }

        int PO() {
            return 1;
        }

        void PU(int obj) {
        }

        //headIndex =obj;
    }

    static class StackImpl {
        int length;
        int headIndex = -1;
        int[][] stacken;

        public StackImpl(int length) {
            this.length = length;
            stacken = new int[length][2];
        }

        void PO() {
            System.out.print(stacken[headIndex][0] + " ");
            headIndex--;
        }

        void PU(int obj) {
            int[] newObj = new int[2];
            newObj[0] = obj;
            newObj[1] = headIndex;
            headIndex++;
            stacken[headIndex] = newObj;

            //queuen[headIndex] = obj;
        }
    }
}
