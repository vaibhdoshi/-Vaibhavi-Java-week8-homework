package javahomeworkweek8;
/*Palindrome Number
* */

import java.util.Scanner;

public class NumberPalidrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        isPalindrome(num);

    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int realnumber = num;
        boolean result = false;

        while (num != 0) {//reversing the integer value
            rev = rev * 10 + num % 10;
            num = num / 10;
            if (realnumber == rev)
                result = true;}
            System.out.println("reverse number : " + rev + " " + result);


        return false;

    }


}
