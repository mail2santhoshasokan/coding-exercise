import java.util.Arrays;

public class MinimumWaitingTime {

    public int waitingTime(int[] array) {
        int total = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int duration = array[i];
            int queriesLeft = array.length - (i + 1);
            total += duration * queriesLeft;
        }

        return total;
    }
}
