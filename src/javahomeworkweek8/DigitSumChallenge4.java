package javahomeworkweek8;

public class DigitSumChallenge4 {
    public static void main(String[] args) {

        sumDigit(1234);
        sumDigit(77888);
        sumDigit(9);

    }

    public static void sumDigit(int number) {
        int sum = 0;
        int temp = number;
        int r;
        if (number >= 10) {
            while (number > 0) {
                r = number % 10;
                sum = sum + r;
                number = number / 10;
            }
            System.out.println("Sum of the digit " + temp + " is: " + sum);
        } else {
            sum = -1;
            System.out.println(+temp + " is Invalid value Return " + sum);


        }
    }
}