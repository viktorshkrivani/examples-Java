import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to divide from the list: ");
        int value = input.nextInt();

        int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] divideArray = getAllNumbersEvenlyDivisibleByValue(array, value);

        System.out.println("Original list: " + Arrays.toString(array));
        System.out.println("Divided from  " + value + ": " + Arrays.toString(divideArray));
    }

    public static int[] getAllNumbersEvenlyDivisibleByValue(int[] array, int value) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % value == 0) {
                result[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}