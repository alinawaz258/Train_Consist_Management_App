import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase7TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 7: Sort Bogies by Capacity
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted results
 *
 * This maps custom ordering using Comparator.
 *
 * @author Devloper
 * @version 7.0
 * **/

import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * =============================================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Developer
 * @version 7.0
 * **/

public class Sort_Bogies_by_Capacity {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    ===   UC7 - Sort Bogies by Capacity   ===      ");
        System.out.println("==================================================");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // Sort the list based on capacity using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed...");
    }
}
