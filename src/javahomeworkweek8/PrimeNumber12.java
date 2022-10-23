package javahomeworkweek8;
/*Write a programme to input any number and check if it is prime or not.
 */

import java.util.Scanner;

public class PrimeNumber12 {
    public static void main(String[] args) {
        prime1();
    }

    public static void prime1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int x = scanner.nextInt();
        boolean is_p = true;
        for (int y = 2; y <= x / 2; y++) {
            if (x % y == 0) {
                is_p = false;
                break;
            }
        }
        if (is_p == true) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not prime number");
        }
        scanner.close();
    }
}
