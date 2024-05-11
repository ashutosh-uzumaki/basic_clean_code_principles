public class FactorialCalculatorGoodComments {

    //calculates the factorial of given n
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
    //TODO: Implement this function later when required
    public static void findNthFibonacci(){

    }

    public static void main(String[] args) {
        int number = 5; //change this to calculate factorial of your number.
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
