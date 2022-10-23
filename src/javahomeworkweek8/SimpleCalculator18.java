package javahomeworkweek8;

public class SimpleCalculator18 {
    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        SimpleCalculator18 obj = new SimpleCalculator18();
        obj.setFirstNumber(5.0);
        obj.setSecondNumber(4);
        System.out.println("Add = " + obj.getAdditionResult());
        System.out.println("Subtraction = " + obj.getSubtractionResult());

        obj.setFirstNumber(5.25);
        obj.setSecondNumber(0);
        System.out.println("Multiplication = " + obj.getMultiplicationResult());
        System.out.println("Division = " + obj.getDivisionResult());
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double setFirstNumber(double number1) {
        firstNumber = number1;
        return firstNumber;
    }

    public double setSecondNumber(double number2) {
        secondNumber = number2;
        return secondNumber;
    }

    public double getAdditionResult() {
        double Addition;
        Addition = firstNumber + secondNumber;
        return Addition;
    }

    public double getSubtractionResult() {
        double Subtraction;
        Subtraction = firstNumber - secondNumber;
        return Subtraction;
    }

    public double getMultiplicationResult() {
        double Multiplication;
        Multiplication = firstNumber * secondNumber;
        return Multiplication;
    }

    public double getDivisionResult() {
        double Division;
        Division = firstNumber / secondNumber;
        return Division;

    }
}