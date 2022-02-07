public class ThreeLargestNumbers {
    public int[] findLargestNumbers(int[] array){
        for (int lastUnsortedIndex = array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i=0;i<lastUnsortedIndex;i++){
                if (array[i] > array[i+1]){
                    swap(array, i,i+1);
                }
            }
        }
        return new int[]{array[array.length-3],array[array.length-2], array[array.length-1]};
    }

    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
