import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase6TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - inserts capacity values for each bogie
 * - iterates through map entries
 * - Displays bogie and capacity information
 *
 * This maps lookup-based access using HashMaps.
 *
 * @author Devloper
 * @version 6.0
 * **/

public class Map_Bogie_to_Capacity {
    public static void main(String[] args){
        System.out.println("==================================================");
        System.out.println("    ===   UC6 - Map Bogie to Capacity    ===      ");
        System.out.println("==================================================");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        //Insertion of records
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);


        System.out.println("Bogie Capacity Details:");
        capacityMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        System.out.println("\nUC6 bogie-capacity mapping completed....");


    }
}
