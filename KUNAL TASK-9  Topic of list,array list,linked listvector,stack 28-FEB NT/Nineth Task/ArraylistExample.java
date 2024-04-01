import java.util.*;

public class ArraylistExample {
    public static void main(String[] args) {

        // Scanner si = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(652);
        list.add(62);
        list.add(52);
        list.add(65);
        list.add(12);
        list.add(274);
        list.add(56);

//        list.set(0, 24);
        list.remove(3);

        System.out.println(list);

    }
}
