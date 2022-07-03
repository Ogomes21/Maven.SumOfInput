import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//prompt user to input a number
//printing the sum of the numbers 1 to n

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int sum = 0;

        System.out.println("Enter an integer.");

        for (n = 0; n <= userInput.nextInt(); n++) {
            sum += n;
        }

    }
}

