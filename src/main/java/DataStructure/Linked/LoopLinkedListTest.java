package DataStructure.Linked;

public class LoopLinkedListTest {
    public static void main(String[] args) {
        LoopLinkedList<Integer> list = new LoopLinkedList<>();
        int[] arr = {3, 2, 7, 4, 8, 1, 9, 5, 6};
        for (Integer i : arr) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.display(20));
    }
}
