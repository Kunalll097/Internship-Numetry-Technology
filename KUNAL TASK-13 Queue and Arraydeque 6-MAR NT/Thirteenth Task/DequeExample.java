import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Inserting elements at front
        deque.offerFirst(4);
        deque.offerFirst(5); // (4,5,6)  -->front [ 6  5  4 ] <-- rear
        deque.offerFirst(6);

        // Inserting elements at rear
        deque.offerLast(7);
        deque.offerLast(8); // -->front [ 6  5  4  7  8  9 ] <-- rear (7,8,9)
        deque.offerLast(9);

        System.out.print("Queue:- ");
        while (!deque.isEmpty()) {
            System.out.print(" " +deque.pollFirst());
        }
    }
}
