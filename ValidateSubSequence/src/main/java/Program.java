import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIndex = 0;
        for (int i=0;i< array.size();i++){
            if (seqIndex == sequence.size()){
                break;
            }
            if (sequence.get(seqIndex).equals(array.get(i))){
                seqIndex++;
            }
        }
        return seqIndex == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1,6,-1,10);
        System.out.println(isValidSubsequence(array, sequence));
    }
}
