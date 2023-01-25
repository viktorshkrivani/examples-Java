import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your total cost");
        double totalCost = Double.parseDouble(keyboard.nextLine());
        if (totalCost >= 5000){
            totalCost *= .7;
            System.out.println("You get a scholarship!");
        } else {
            System.out.println("You don't get a scholarship.");
        }
        System.out.println("Your total cost is: $" + totalCost);
    }
}


