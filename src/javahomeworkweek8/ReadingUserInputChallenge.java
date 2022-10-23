package javahomeworkweek8;
/*
Read 10 numbers from the console entered by the user and print the sum of those
numbers.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        ReadingUserInputChallenge t = new ReadingUserInputChallenge();
        t.total();

    }
    public void total(){
        Scanner scanner = new Scanner(System.in);
        int n, x = 0,i = 0;
        while(x++ <10){
            System.out.println("Enter number " + x + "  ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid number ,enter again ");
                scanner.nextInt();
            }
            n = scanner.nextInt();
            i = i + n;
        }
        System.out.println("Total of 10 number is " + i);
        scanner.close();
    }

}
