import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(multiplyFive());
    }

    public static float multiplyFive(){
        return multiplyNumbers(0, 1);
    }

    public static float multiplyNumbers(int depth, float previousTotal){
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Base case when the depth is 5
        if (depth == 5){
            return previousTotal;
        }

        // Read the console for a number
        float num = 1;
        boolean validInput = false;
        while (validInput == false) {
            try {
                System.out.println("Please input a number.");
                num = scanner.nextFloat();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }
        }

        // Return the next iteration with a depth increase
        return multiplyNumbers(depth + 1, previousTotal * num);
    }
}