import java.util.Scanner;

public class FavoriteColor {
    public static String getUsersFavoriteColor() {
        Scanner input = new Scanner(System.in);
        String name, color;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        while (true) {
            System.out.print(name + ", please enter favorite color (Red, Orange, Yellow, Green, Blue, Indigo, Violet) : ");
            color = input.nextLine();

            if (color.equalsIgnoreCase("red")) {
                return "red";
            } else if (color.equalsIgnoreCase("orange")) {
                return "orange";
            } else if (color.equalsIgnoreCase("yellow")) {
                return "yellow";
            } else if (color.equalsIgnoreCase("green")) {
                return "green";
            } else if (color.equalsIgnoreCase("blue")) {
                return "blue";
            } else if (color.equalsIgnoreCase("indigo")) {
                return "indigo";
            } else if (color.equalsIgnoreCase("violet")) {
                return "violet";
            } else {
                System.out.println("Please enter a valid color.");
            }
        }
    }
}

