package javahomeworkweek8;
/*Write a program in Java to display the pattern like a triangle with a number.
*/

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Triangle();

    }

    public static void Triangle() {
        int i, j, n;
        System.out.println("Input Number of rows :  ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
        scan.close();
    }

}
