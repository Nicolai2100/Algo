package Uge4;

import java.util.Scanner;

public class QueueOpgave {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int N = 8;
        int N = Integer.parseInt(scan.nextLine());
        QueueImpl queue = new QueueImpl(N);

        for (int i = 0; i < N; i++) {
            String input = scan.nextLine();
            if (input.substring(0, 1).equalsIgnoreCase("e")) {
                queue.enqueue(Integer.parseInt(input.substring(2)));

            } else if (input.substring(0, 1).equalsIgnoreCase("d")) {
                queue.dequeue();
            }
        }
    }

    static class QueueImpl {
        int length;
        int headIndex = -1;
        int tailIndex = 0;
        int[][] queuen;

        public QueueImpl(int length) {
            this.length = length;
            queuen = new int[length][2];
        }

        void dequeue() {
            System.out.print(queuen[tailIndex][0] + " ");
            tailIndex++;
        }

        void enqueue(int obj) {
            int[] newObj = new int[2];
            newObj[0] = obj;
            newObj[1] = headIndex;
            headIndex++;
            queuen[headIndex] = newObj;
        }
    }
}


