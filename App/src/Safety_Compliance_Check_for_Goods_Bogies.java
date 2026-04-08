import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - Safety_Compliance_Check_for_Goods_Bogies
 * =============================================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies using
 * Java Streams and lambda expressions.
 *
 * At this stage, the application:
 * - Creates goods bogie List
 * - Converts List into stream
 * - Applies safety validation rule (Cylindrical -> Petroleum)
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * @author Developer
 * @version 12.0
 * **/

public class Safety_Compliance_Check_for_Goods_Bogies {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    ===   UC12 - Safety Compliance Check for Goods Bogies   ===      ");
        System.out.println("==================================================");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // Rule violation: Cylindrical must be Petroleum

        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(System.out::println);

        // ---- SAFETY VALIDATION USING ALLMATCH ----
        // Rule: If type is Cylindrical, cargo MUST be Petroleum
        boolean isSafe = goodsBogies.stream().allMatch(b -> {
            if (b.type.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Other bogie types are flexible
        });

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}
