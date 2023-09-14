import java.util.Scanner;



public class Lab_04_Part1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int intOperandA = 10;
        int intOperandB = 5;

        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 10;
        double doubleOperandB = 5;

        double doubleSum;
        double doubleDifference;
        double doubleProduct;
        double doubleQuotient;
        double doubleModulo;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;


        System.out.println("The sum of integers " + intOperandA + " and " + intOperandB + " is " + intSum+ ".");
        System.out.println("The difference of integers " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");
        System.out.println("The product of integers " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");
        System.out.println("The quotient of integers " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");
        System.out.println("The remainder of integers " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum of integers " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum+ ".");
        System.out.println("The difference of integers " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + ".");
        System.out.println("The product of integers " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + ".");
        System.out.println("The quotient of integers " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + ".");
        System.out.println("The remainder of integers " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo + ".");
    }
}