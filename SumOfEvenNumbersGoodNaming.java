import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbersGoodNaming {
    public static int calculateEvenNumberSum(List<Integer> numbers){
        int evenSum = 0;
        for(int num: numbers){
            if(num % 2 == 0){
                evenSum += num;
            }
        }
        return evenSum;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvenNumbers = calculateEvenNumberSum(numbers);
        System.out.println(sumOfEvenNumbers);
    }
}
