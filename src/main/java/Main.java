import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//prompt user to input a number
//printing the sum of the numbers 1 to n

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");

        int userInput = input.nextInt();
        int sum = 0;

        for (int n = 1; n <= userInput; n++) {

            sum += n;
        }
        System.out.println(sum);
    }
}

