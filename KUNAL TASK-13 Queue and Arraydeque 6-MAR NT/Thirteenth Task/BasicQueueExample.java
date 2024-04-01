import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueExample {

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 7; i++) //Elements of queue [0, 1, 2, 3, 4, 5, 6]
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements in queue = "
                + q);


        int remainingelement = q.remove(); //removed element-0
        System.out.println("Removed element = "
                + remainingelement);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("Head of queue = "
                + head);

        int size = q.size();
        System.out.println("Size of queue = "
                + size);
    }
}