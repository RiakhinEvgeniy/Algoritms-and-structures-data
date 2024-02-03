package Stacks_and_Queues;

public class PriorityQueueApp {
    public static void main(String[] args) {
        int size = 10;
        PriorityQueue priorityQueue = new PriorityQueue(size);

        for (int i = 0; i < 5; i++) {
            if (!priorityQueue.isFull())
            priorityQueue.insert((int)(Math.random() * 10));
        }
        while (!priorityQueue.isEmpty()) {
            int n = priorityQueue.remove();
            System.out.print(n + " ");
        }
    }
}
