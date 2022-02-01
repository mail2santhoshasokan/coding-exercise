import java.util.LinkedList;
import java.util.HashSet;

public class Solution<T> {

    /**
     * The method indicates whether or not a linked list contains a circular
     * reference.
     *
     * @param List to check
     * @return true if the list contains a circular reference, false otherwise
     */
    public boolean isLooped(Node<Integer> head) {

        LinkedList<Integer> list = new LinkedList<>();

        HashSet<Integer> unique = new HashSet<>();

        boolean isLoop = false;

        Node<Integer> node = head;
        while (node != null) {
            list.add(node.value);
            node = node.next;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            Integer c = list.get(i);
            boolean present = unique.add(c);
            if (present) {
                isLoop = true;
            }
        }

        return isLoop;
    }


}