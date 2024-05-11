import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbersBadNaming {
    public static int process(List<Integer> numbers){
        int sum = 0;
        for(int num: numbers){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19);

        int output = process(numbers);

        System.out.println(output);
    }
}
