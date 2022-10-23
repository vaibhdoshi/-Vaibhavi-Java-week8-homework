package javahomeworkweek8;
/*Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel or Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        VowelOrConsonant t = new VowelOrConsonant();
        t.vowel();


    }

    public void vowel() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Entered Character" + ch + " is vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered character " + ch + " is Consonant");
        } else {
            System.out.println("Not an alphabet");
            scanner.close();
        }


    }


}












