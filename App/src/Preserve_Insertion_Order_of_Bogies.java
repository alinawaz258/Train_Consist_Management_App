import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase5TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered Uniqueness using LinkedHashSets.
 *
 * @author Devloper
 * @version 1.0
 * **/

public class Preserve_Insertion_Order_of_Bogies {
    public static void main(String[] args){
        System.out.println("==================================================");
        System.out.println("=== UC5 - Preserve Insertion Order of Bogies ===  ");
        System.out.println("==================================================");

        //LinkedHashSet preserves order and ensure uniqueness
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); //duplicate


        System.out.println("Final Train Formation:\n" + formation + "\n");
        System.out.println("Note:\nLinkedHashSet preserves insertion order and removes duplicates automatically\nUC5 formation setup complete");
    }
}