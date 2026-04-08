import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase2TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 1: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogies availability
 * - Display the final consist
 *
 * This maps CRUD operation using ArrayList.
 *
 * @author Devloper
 * @version 1.0
 * **/

public class Add_Passenger_Bogies_to_Train {
    public static void main(String[] args){
        System.out.println("=============================================");
        System.out.println("=== UC2 - Add Passenger Bogies to Train ===  ");
        System.out.println("=============================================");

        List<String> trainConsist = new ArrayList<>();

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("After Adding Bogies");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        System.out.println("Checking if 'Sleeper' exists");
        System.out.println("Contains Sleeper? : " +trainConsist.contains("Sleeper") + "\n");

        System.out.println("UC2 operations completed successfully");

    }
}