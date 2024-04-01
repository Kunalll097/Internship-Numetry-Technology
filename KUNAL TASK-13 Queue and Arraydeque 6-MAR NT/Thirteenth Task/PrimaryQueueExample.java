import java.util.*;

class PrimaryQueueExample {

    public static void main(String args[])
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(); // <-- Create Empty queue

        // Adding elements to priority-Queue using add()
        pQueue.add(22);
        pQueue.add(30);
        pQueue.add(45);

        System.out.println("Top element of PriorityQueue :- " + pQueue.peek());  // [ 22  30  45 ]

        // Printing the top element and removing it
        System.out.println("Top element and remove it :- " + pQueue.poll()); // <-- poll() [ 22 <-- remove it  30  45 ]

        System.out.println("Top element again :- " + pQueue.peek()); // [ 30 <-- new top(peek)  45 ]
    }
}