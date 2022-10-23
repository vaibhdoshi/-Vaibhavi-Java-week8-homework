package javahomeworkweek8;
/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=15
 */
import java.util.Scanner;

public class ArmstrongNumber10 {

    public static void main(String[] args) {
        armstrong();
    }

    public static void armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int temp = n;
        int res = 0;
        while (temp > 0) {
            int ld = temp % 10;
            res = res + ld * ld * ld;
            temp = temp / 10;
            //153%10
        }
        if (res == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}
