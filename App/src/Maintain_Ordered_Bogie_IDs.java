import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase4TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 3: Maintain Ordered Bogie IDs
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Display updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Devloper
 * @version 1.0
 * **/

public class Maintain_Ordered_Bogie_IDs {
    public static void main(String[] args){
        System.out.println("=============================================");
        System.out.println("===  UC4 - Maintain Ordered Bogie IDs   ===  ");
        System.out.println("=============================================");

        //Create a LinkedList
        //LinkedList maintains insertion order and allows fast insertion
        List<String> trainConsist = new LinkedList<>();

        //inserting the elements
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        System.out.println("After Inserting 'Pantry car' at position 2");
        trainConsist.add(2,"Pantry Car");
        System.out.println(trainConsist + "\n");

        System.out.println("After Removing First and Last Bogie");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed....");

    }
}