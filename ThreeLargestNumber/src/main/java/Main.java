import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ThreeLargestNumbers threeLargestNumbers = new ThreeLargestNumbers();
        int[] array = new int[]{141,1,17,-7,-17,-27,18,541,8,7,7};
        int[] result = threeLargestNumbers.findLargestNumbers(array);
        Arrays.stream(result).forEach(System.out::println);
    }
}
