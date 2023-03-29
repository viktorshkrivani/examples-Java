import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean YouAreWounded= false;
        int turns = 0;
        String escapeWord = "run";

        while(true){
            if(YouAreWounded) {
                System.out.println("You are wounded and there's nothing you can do other than sleep.");
                System.out.println("What do you want to do? (sleep)");
            } else {
                System.out.println("What do you want to do? (north, south, east, west, attack, sleep, escape)");
            }
            String action = input.nextLine().toLowerCase();

            if (!ValidOpt(action)){
                System.out.println("INVALID OPTION. Use: north, south, east, west, attack, sleep, escape");
                continue;
            }
            if (action.equals(escapeWord)) {
                System.out.println("Congratulations, you escaped the game in " + turns + " turns. Thanks for playing!");
                break;
            }
            if(action.equals("escape")) {
                System.out.println("CONGRATULATIONS, you escaped the game in " + turns + " turns. Thanks for playing the game!");
                break;
            }
            if (action.equals("sleep")) {
                System.out.println("You are sleeping and healing your wounds");
                YouAreWounded = false;
                turns++;
                continue;
            }
            if (YouAreWounded){
                System.out.println("You can't do anything other than sleep.");
                continue;
            }
            System.out.println("You chose " +action);
            performAction(action);
            turns++;
            if (action.equals("attack")){
                System.out.println("You were wounded in the attack!");
                YouAreWounded = true;
            }
        }
    }

    private static boolean ValidOpt (String action) {
        return action.equals("north") || action.equals("south") || action.equals("east") ||
                action.equals("west")  || action.equals("attack") || action.equals("sleep") || action.equals("escape")
                || action.equals("run");
    }

    private static void performAction (String move) {
        switch (move) {
            case "north":
                System.out.println("You are going north.");
                break;
            case "south":
                System.out.println("You are going south.");
                break;
            case "east":
                System.out.println("You are going east.");
                break;
            case "west":
                System.out.println("You are going west.");
                break;
            case "attack":
                System.out.println("You are going attack.");
                break;
            default:
                System.out.println("You do " + move + ".");
                break;

        }
    }

}