import java.util.Arrays;

public class Program {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change=0;
        int value;
        if (coins.length==0){
            return 1;
        }
        for (int i=0;i<coins.length;i++) {
            value = coins[i];
            if (value<=(change+1)){
                change += value;
            } else {
                return change + 1;
            }
        }


        return change+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(nonConstructibleChange(arr));
    }
}
