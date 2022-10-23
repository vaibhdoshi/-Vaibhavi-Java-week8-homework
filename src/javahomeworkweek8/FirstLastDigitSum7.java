package javahomeworkweek8;
/* First And Last Digit Sum
 */

import java.util.Scanner;

public class FirstLastDigitSum7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = obj.nextInt();
        sumFirstAndLastDigit(num);

    }

    public static int sumFirstAndLastDigit(int num) {
        //last digit we will use %
        int lastDigit = num % 10;
        int firstDigit = num;
        int sum = firstDigit + lastDigit;
        //using while loop to get first digit

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            sum = firstDigit + lastDigit;
        }
        System.out.println("first digit :" + firstDigit);
        System.out.println("last digit:" + lastDigit);
        System.out.println("sum =" + sum);
        return sum;


    }

}
