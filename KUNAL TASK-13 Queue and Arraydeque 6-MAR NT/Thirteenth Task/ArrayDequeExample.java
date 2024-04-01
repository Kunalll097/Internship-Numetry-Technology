import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Inserting elements at front  --> front (11,12,13)   [13  12  11    ] rear <--
        arrayDeque.offerFirst(11);
        arrayDeque.offerFirst(12);
        arrayDeque.offerFirst(13);

        // Inserting elements at rear  --> front [13  12  11  14  15  16] rear <-- (14,15,16)
        arrayDeque.offerLast(14);
        arrayDeque.offerLast(15);
        arrayDeque.offerLast(16);

        // Removing elements from front
        while (!arrayDeque.isEmpty()) {
            System.out.print(" " + arrayDeque.pollFirst());
        }
    }
}
