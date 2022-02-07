public class BubbleSort {

    public void sort(int[] arr){

        for (int lastUnsortedIndex = arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i=0;i<lastUnsortedIndex;i++){
                if (arr[i] > arr[i+1]){
                    swap(arr,i, i+1);
                }
            }
        }
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public void swap(int[] arr, int i, int j){
        if (i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
