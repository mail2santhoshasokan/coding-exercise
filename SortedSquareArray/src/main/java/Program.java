import java.util.Arrays;

class Program {

    public static int[] sortedSquaredArray(int[] array) {
        int[] squared = new int[array.length];
        for (int i=0;i< array.length;i++){
            squared[i] = array[i] * array[i];
        }
        Arrays.sort(squared);
        return squared;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{-5,-4,-3,-2,-1};
       int[] sorted = sortedSquaredArray(arrays);
       Arrays.stream(sorted).forEach(value -> System.out.println(value));
    }
}
