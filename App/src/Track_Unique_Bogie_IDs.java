import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase3TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formating using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogies identifiers
 *
 * This maps Uniqueness validation using Set.
 *
 * @author Devloper
 * @version 1.0
 * **/

public class Track_Unique_Bogie_IDs {
    public static void main(String[] args){
        System.out.println("=============================================");
        System.out.println("===    UC3 - Track Unique Bogie IDs     ===  ");
        System.out.println("=============================================");

        //Create a Set to store unique bogie IDs
        //HashSet Stores only unique values
        Set<String> bogies = new HashSet<>();

        //-------- ADD IDs (including duplicates) --------
        // add() inserts bogie IDs into the set
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        //Duplicate entries will be ignored internally by HashSet
        bogies.add("BG101"); //Duplicate entry
        bogies.add("BG102"); //Duplicate entry

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        System.out.println("Note:");
        System.out.println("Duplicate are automatically ignored by HashSet." + "\n");

        System.out.println("UC3 uniqueness validation completed");


    }
}