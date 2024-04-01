import java.util.*;
class Sortedset{

    public static void main(String[] args)
    {
        SortedSet<String> ts
                = new TreeSet<String>();

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("B");
        ts.add("D");
        ts.add("E");

        System.out.println("Initial TreeSet " + ts);

        ts.remove("B");

        System.out.println("After removing element " + ts);
    }
}