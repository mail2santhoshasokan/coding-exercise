public class SelectionSort {


    public void sort(int[] array){
        int largest;

        for (int lastUnsortedIndex = array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            largest =0;
            for (int i=1;i<=lastUnsortedIndex;i++){
                if (array[i]>array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
        printArray(array);

    }

    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
