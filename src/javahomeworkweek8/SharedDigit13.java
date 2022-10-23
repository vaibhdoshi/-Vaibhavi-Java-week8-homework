package javahomeworkweek8;
/*Shared Digit */

public class SharedDigit13 {
    public static void main(String[] args) {
        boolean answer = false;
        answer=hasSharedDigit(12, 23);
        System.out.println("hasSharedDigit(12,23) = " + answer);
        answer =hasSharedDigit(9, 99);
        System.out.println("hasSharedDigit(9,99) = " + answer);
        answer=hasSharedDigit(15, 55);
        System.out.println("hasSharedDigit(15,55) = " + answer);


    }

    public static boolean hasSharedDigit(int num1, int num2) {
        boolean answer = false;
        if (num1 < 10 || num1 > 99) {
            answer = false;
        } else if (num2 < 10 || num2 > 99) {
            answer = false;
        } else {
            int leftnum1 = num1 / 10;
            int rightnum1 = num1 % 10;
            int leftnum2 = num2 / 10;
            int rightnum2 = num2 % 10;
            if (leftnum1 == leftnum2 || leftnum1 == rightnum2 || rightnum1 == leftnum2 || rightnum1 == rightnum2) {
                answer = true;
            }
        }
        return answer;
    }

}

