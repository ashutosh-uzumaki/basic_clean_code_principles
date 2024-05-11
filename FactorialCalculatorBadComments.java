// This is a simple Java program to calculate the factorial of a number

public class FactorialCalculatorBadComments {

    // This method calculates the factorial of a given number
    // It takes an integer parameter 'n' and returns the factorial of 'n'
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursively calculate factorial
        }
    }
    public static void findNthFibonacci(){

    }
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial of a different number
        int factorial = calculateFactorial(number);

        // Output the factorial of the number
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
