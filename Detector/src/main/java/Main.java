public class Main {

    public static void main(String[] unused) {
        Solution<Integer> detector = new Solution<>();

        // Some sample lists to test with... customize during your test.
        Node<Integer> list1 = null;
        Node<Integer> list2 = new Node<>(5);
        list2.next = new Node<>(12);
        list2.next.next = new Node<>(7);
        list2.next.next.next = new Node<>(-512);
        // 5 -> 12 -> 7 -> -512 :  This is not a loop
        // 5 -> 12 -> 7 -> -512 -> 7 -> 10:  This is a loop
        // Uncomment and adjust the below to prove the solution
        // list2.next.next.next.next = list2.next;

        if (detector.isLooped(list1)) {
            System.out.println("list1 is looped");
        }

        if (detector.isLooped(list2)) {
            System.out.println("list2 is looped");
        }else{
            System.out.println("list2 is not looped");
        }
    }

}
