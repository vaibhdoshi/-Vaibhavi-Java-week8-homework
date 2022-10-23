package javahomeworkweek8;
/*Even Digit Sum
*/
public class EvenDigitSum11 {
    public static void main(String[] args) {
        getEvenDigitSum(252);
        getEvenDigitSum(123456789);
        getEvenDigitSum(-22);
        
    }
    public static void getEvenDigitSum(int number){
        int sum = 0,digit;
        int originalnumber = number;
        if (number<0){
            System.out.println("Invalid number return -1 ");
        }else {
            while (number!=0){
                digit = number%10;
                if(digit%2==0)
                    sum=sum+ digit;
                number=number/10;
            }
            System.out.println("sum of even digit number " + originalnumber +" is " + sum);
        }

    }
}
