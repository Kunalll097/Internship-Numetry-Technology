import java.util.*;

public class Queue {
    static class Node {
         int data;
         Node next;

         Node(int data) {
          this.data = data;
          next = null;
         }
    }
    static class QueueA {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

//        public static boolean isFull() {
//            return (rear+1) % size == front;
//        }
//        Enqueue
        public void add(int data) {
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

//        Deque
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            if(head == tail) {
                tail = null;
            }
            head = head.next;

            return front;
        }

//        peek
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }

    }
 public static class QueueB{
     static Stack<Integer> s1 = new Stack<>();
     static Stack<Integer> s2 = new Stack<>();

     public static boolean isEmpty() {
         return s1.isEmpty();
     }

     public static void add(int data){
         while(!s1.isEmpty()) {
             s2.push(s1.pop());
         }

         s1.push(data);

         while(!s2.isEmpty()) {
             s1.push(s2.pop());
         }
     }

     public static int remove() {
         if(isEmpty()) {
             System.out.println("empty queue");
             return -1;
         }
         return s1.pop();
     }

     public static int peek() {
         if(isEmpty()) {
             System.out.println("empty queue");
             return -1;
         }
         return s1.peek();
     }
}
    @SuppressWarnings("static-access")
    public static void main(String[] args){
        QueueA q = new QueueA();
//        QueueA<Integer> q = new LinkedList<E>();
//        QueueB q = new QueueB();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }


}
