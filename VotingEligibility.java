public class VotingEligibility {
    public static void main(String[] args) {

        int age1 = 19; 
        int age2 = 17;
        int age3 = 13;

        // Test cases: Best, Worst, and Average
        System.out.println("=== Voting Eligibility Test ===");

        // Best case: Eligible to vote
        System.out.println("\nBest Case: Eligible to vote.");
        if (age1 >= 18 ) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Worst case: Not eligible to vote (far below voting age)
        System.out.println("\nAverage Case: Not eligible to vote (too young).");
        if (age2 > 18 ) {
            System.out.println("You are eligible to vote.");
        } else if (age2 == 18) {
            System.out.println("You are eligible to vote.");
        } else {
                System.out.println("You are not eligible to vote.");
        }
        
        // Average case: Close to being eligible but not yet
        System.out.println("\nWorst Case: Close to being eligible.");
        switch (getAgeCategory(age3)) {
            case "eligible":
                System.out.println("You are eligible to vote.");
                break;

            case "ineligible":
                System.out.println("You are not eligible to vote.");
                break;

            case "invalid":
                System.out.println("Invalid age. Age cannot be negative.");
                break;

            default:
                System.out.println("Unexpected error.");
                break;
        }
    }

    // Method to check voting eligibility
    public static String getAgeCategory(int age) {
        if (age >= 18) {
            return "eligible";
        } else if (age >= 0) {
            return "ineligible";
        } else {
            return "invalid";
        }
    }
}