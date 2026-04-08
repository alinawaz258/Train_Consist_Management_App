import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =============================================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =============================================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 * **/

public class Validate_Train_ID_Cargo_Codes {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    ===   UC11 - Validate Train ID and Cargo Code   ===      ");
        System.out.println("==================================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ----
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile and Match Train ID
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Matcher trainMatcher = trainPattern.matcher(trainId);
        boolean isTrainIdValid = trainMatcher.matches();

        // Compile and Match Cargo Code
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        boolean isCargoCodeValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}
