import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hi there computer!");
        System.out.println("I could write a novel");
        System.out.println("Java cares about order of operations! YAY");
        System.out.println((2 + 2) * 3);

        int length = 20;
        int width = 10;
        System.out.println(length * width);
        //this is a comment, just ignore it.
        int length1 = 20;
        int width1 = 10;
        System.out.println("The area of your carpet is " + length1 * width1 + "square ft");
        System.out.println("5/2 == " + 5 / 2);
        System.out.println("5.0/2 == " + 5.0 / 2);
        float it_is_a_float = 1.7f;
        double it_is_a_double = 1.7;
        char singleCharacter = 'E';
        String myFirstName = "Viktor";
        System.out.println("The number letters in my name is " + myFirstName.length());
        System.out.println(Math.PI);
        System.out.println(
                """
                        Enter the number for what you want to buy
                        1- Pepsi
                        2- Coce
                        3- Sprite
                        4- Dew
                   
                        """
        );
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        int choiceNumber = Integer.parseInt(choice);
        double choiceNumberWithDecimal = Double.parseDouble(choice);
        System.out.println("You picked option "+ choice);
        System.out.println("That cost $" + choice);
        System.out.println("With tax, it actually costs" + choiceNumber * 1.06);
        System.out.println("Enter another choice");
        int anotherChoice = Integer.parseInt( keyboard.nextLine() );

        System.out.println("Please Enter the length of your carpet");
        length1 = Integer.parseInt( keyboard.nextLine() );
        System.out.println("Please Enter the width of your carpet");
        width1 = Integer.parseInt( keyboard.nextLine() );

        System.out.println("The area of my carpet is"
        + length1 * width1
        + " square ft");

        System.out.println("5 / 2 == " + 5 / 2 + " remainder " + 5 % 2);

    }
}
