import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase1TrainConsistManagmentApp
 * =============================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application
 *
 * At this stage, the application,
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Display initial bogie count
 * - Print the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Devloper
 * @version 1.0
 * **/

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        //Display welcome banner
        System.out.println("==========================================");
        System.out.println("    === Train Consist Management App ===  ");
        System.out.println("==========================================");

        List<String> trainConsist = new ArrayList<>();

        //Display initial consist information
        System.out.println("Train initialized Successfully....");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : "+ trainConsist );

        System.out.println("System ready for operations....");
    }
}