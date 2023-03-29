public class Main2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);




        if ( (downPayment / housePrice >= .2 || creditScore > 800)
        || ( downPayment / housePrice >= .1 && creditScore >= 700 ) ){
            System.out.println("You can get a mortgage");
        } else {
            System.out.println("You don't qualify");
        }
    }
}