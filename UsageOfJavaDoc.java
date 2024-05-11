import java.util.*;

/**
 * This class demonstrates self-explanatory code with Javadoc comments.
 */
public class UsageOfJavaDoc {

    /**
     * Calculates the sum of even numbers in a list.
     *
     * @param numbers The list of integers to process.
     * @return The sum of even numbers in the list.
     */
    public int sumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * Main method to demonstrate the usage of sumOfEvenNumbers method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        UsageOfJavaDoc example = new UsageOfJavaDoc();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = example.sumOfEvenNumbers(numbers);

        System.out.println("Sum of even numbers: " + result);
    }
}
