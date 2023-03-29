import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);




        if ( (downPayment / housePrice >= .2 || creditScore > 800)
                || ( downPayment / housePrice >= .1 && creditScore >= 700 ) ){
            System.out.println("You can get a mortgage");
        } else {
            System.out.println("You don't qualify");
        }
        System.out.println("Enter your score 1-100");
        int score = Integer.parseInt(keyboard.nextLine());

        if ( score >= 94 )  {
            System.out.println("A");
            }else if ( score >= 94 && score >= 90 ){
                System.out.println("A-");
            }else if ( score < 86 && score >= 80 ){
                System.out.println("B+");
            }else if ( score < 80 && score >= 76 ){
                System.out.println("B-");
            }else if ( score < 76 && score >= 70 ){
                System.out.println("C+");
            }else if ( score < 70 && score >= 66 ){
                System.out.println("C");
            }else if ( score > 66 ){
                System.out.println("D");
            }else if ( score >= 94 ){
        }
    }
}
