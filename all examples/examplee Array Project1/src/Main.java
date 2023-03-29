import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        // Define valid options and escape word
        String[] validOptions = {"north", "south", "east", "west", "attack", "sleep", "heal", "escape"};
        String escapeWord = "abracadabra";

        // Initialize game state variables
        boolean isWounded = false;
        int turns = 0;

        while (true) {
            // Display prompt to user based on game state
            if (isWounded) {
                System.out.println("You are wounded and can't do anything other than sleep.");
                System.out.println("What do you want to do? (sleep)");
            } else {
                System.out.println("What do you want to do? (north, south, east, west, attack, sleep, escape)");
            }

            // Get user input
            String input = keybord.nextLine().toLowerCase();

            // Check if user input is valid
            if (!isValidOption(validOptions, input)) {
                System.out.println("Invalid option. Valid options are: " + String.join(", ", validOptions));
                continue; // Ask for input again
            }

            // Check if user entered the escape word
            if (input.equals("escape")) {
                System.out.println("Congratulations, you escaped the game in " + turns + " turns. Thanks for playing!");
                break; // End game loop
            }

            // Check if user chose to sleep
            if (input.equals("sleep")) {
                System.out.println("You sleep and heal your wounds.");
                isWounded = false; // Reset wounded flag
                turns++;
                continue; // Ask for input again
            }

            // Check if user is wounded and can't do anything other than sleep
            if (isWounded) {
                System.out.println("You can't do anything other than sleep.");
                continue; // Ask for input again
            }

            // User input is valid and not sleep or escape, perform action and increment turn counter
            System.out.println("You chose to " + input);
            performAction(input);
            turns++;

            // Check if user was wounded in attack and set wounded flag
            if (input.equals("attack")) {
                System.out.println("You were wounded in the attack!");
                isWounded = true;
            }
        }
    }

    // Method to check if user input is valid
    private static boolean isValidOption(String[] validOptions, String input) {
        for (String option : validOptions) {
            if (option.equals(input)) {
                return true;
            }
        }
        return false;
    }

    // Method to perform action based on user input
    private static void performAction(String action) {
        switch (action) {
            case "north":
                System.out.println("You go north.");
                break;
            case "south":
                System.out.println("You go south.");
                break;
            case "east":
                System.out.println("You go east.");
                break;
            case "west":
                System.out.println("You go west.");
                break;
            case "attack":
                System.out.println("You attack the enemy!");
                break;
            default:
                System.out.println("You do " + action + ".");
                break;
        }
    }
}