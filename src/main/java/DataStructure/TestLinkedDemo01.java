package DataStructure;

import DataStructure.Linked.LinkedDemo01;

public class TestLinkedDemo01 {
    public static void main(String[] args) {
        LinkedDemo01<Integer> linked = new LinkedDemo01<>();
        for (int i = 0; i < 5; i++) {
            linked.addHead(i);
            System.out.println(linked);
        }
        linked.insert(2, 666);
        System.out.println(linked);
        linked.remove(2);
        System.out.println(linked);
    }
}
