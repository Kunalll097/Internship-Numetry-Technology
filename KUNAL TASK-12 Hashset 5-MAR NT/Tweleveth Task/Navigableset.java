import java.util.*;

public class Navigableset {

    public static void main(String[] args) {

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(3);
        navigableSet.add(1);
        navigableSet.add(2);
        navigableSet.add(3);
        System.out.println("NavigableSet: " + navigableSet);

        // Additional operations specific to NavigableSet
        System.out.println("Ceiling(2): " + navigableSet.ceiling(2)); // Least element greater than or equal to 2
        System.out.println("Floor(2): " + navigableSet.floor(2)); // Greatest element less than or equal to 2
        System.out.println("Higher(2): " + navigableSet.higher(2)); // Least element strictly greater than 2
        System.out.println("Lower(2): " + navigableSet.lower(2)); // Greatest element strictly less than 2
    }
}
