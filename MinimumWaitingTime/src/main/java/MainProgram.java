public class MainProgram {
    public static void main(String[] args) {
        MinimumWaitingTime minimumWaitingTime = new MinimumWaitingTime();
        int[] array = new int[]{3,2,1,2,6};
        System.out.println(minimumWaitingTime.waitingTime(array));
    }
}
