package javahomeworkweek8;
/*Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        MaxMin();

    }

    public static void MaxMin() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int min = 0;
        int max = 0;
        do {
            System.out.print("Type a number (or -1 to stop): ");
            num = scanner.nextInt();
            if (num <= min && num != -1) {
                min = num;
            }
            if (num >= max && num != -1) {
                max = num;
            }

        }
        while (num != -1);

        System.out.println("Maximum was " + max);
        System.out.println("Minimum was " + min);
        scanner.close();

    }

}
