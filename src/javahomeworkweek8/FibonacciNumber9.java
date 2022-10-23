package javahomeworkweek8;
/*. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class FibonacciNumber9 {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {

        int k, a = 1, b = 1;
        k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("1 1");
        while (k <= 100) {
            k = a + b;
            if (k >= n)
                break;
            System.out.println(k + "  ");
            a = b;
            b = k;

        }
        sc.close();
    }

}



