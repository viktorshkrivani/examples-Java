public class Main {
    //Write a program that ensures we have enough pizza to feed our friends at the party
//Ask the user how many friends are coming to the party
//Ask the user how many slices of pizza their friends eat on average
//Ask the user how many slices of pizza are in each pizza
//Ask the user how many pizzas they are buying
//Calculate the estimated number of pizzas required and compare with how many pizzas they are buying,
//tell them if they will have enough or if they need to buy more

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner pizza = new Scanner(System.in);

            // System.out.println("Press Enter to Start calculating the food needed for the party.");
            // pizza.nextLine();

            System.out.println("How many friends are coming to the party? ");
            int FriendsInvited = pizza.nextInt();

            System.out.println("How many slices of pizza your friends eat on average? ");
            int AveragePerPerson = pizza.nextInt();

            System.out.println("How many slices of pizza are in each pizza? ");
            int SlicesPerPizza = pizza.nextInt();

            System.out.println("How many pizzas are you buying?" );
            int TotalPizza = pizza.nextInt();

            int TotalSlices = FriendsInvited * AveragePerPerson;
            int PizzaRequired = TotalSlices / SlicesPerPizza;

            if (PizzaRequired > TotalPizza) {
                System.out.println("There's is not enough pizzas. You need to buy " + (PizzaRequired - TotalPizza) + " more.");
            }else {
                System.out.println("You have enough pizzas for your friends.");
            }


        }
    }

}