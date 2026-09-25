public class Main {
    public void main() {
        // intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo

        //intializing all the variables
        int intOperandA = 1;
        int intOperandB = 13;
        int intSum = 10;
        int intProduct = 34;
        int intDifference = 0;
        int intQuotient = 892;
        int intModulo = 12;

        double doubleOperandA = 2.50;
        double doubleOperandB = 23.12;
        double doubleSum = 98.21;
        double doubleProduct = 32.123;
        double doubleDifference = 849.239;
        double doubleQuotient = 257.93;

        //performing arithmetic operations
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        //printing out results of operations
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        System.out.println("\nThe sum using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleDifference);
        System.out.println("The product using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleQuotient);

        System.out.println("\n*********\n");

        //initializing PII variables
        double myLunchCost = 10.50;
        int numberOfKidsInMyFamily = 2;
        boolean isRainingStatus = false;
        int myFavNum = 84;
        double myShoeSize = 12.5;
        String myBirthMonth = "May";
        String myFullName = ("Carter Jackson Wiesner");

        //printing out full statements based on PII
        System.out.println("The cost of my lunch is " + myLunchCost);
        System.out.println("The number of kids in my family is " + numberOfKidsInMyFamily);
        System.out.println("Is it raining: " + isRainingStatus);
        System.out.println("My favorite number is " + myFavNum);
        System.out.println("I wear a shoe size of " + myShoeSize);
        System.out.println("I was born in the month of " + myBirthMonth);
        System.out.println("Hi, my full name is " + myFullName);
    }
}
