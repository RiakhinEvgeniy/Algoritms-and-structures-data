package Stacks_and_Queues;

public class MyQueueApp {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);

        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);

        myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        /*myQueue.insert(50);
        myQueue.insert(60);
        myQueue.insert(70);
        myQueue.insert(80);*/

        /*while (!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println(n);
        }*/

        System.out.println("\nPeek " + myQueue.peekFront());
        System.out.println("Rear " + myQueue.peekRear());
        //System.out.println(myQueue.isFull());
        //System.out.println(myQueue.size());
    }
}
