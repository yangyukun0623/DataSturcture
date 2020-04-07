package DataStructure.LeetCode;


public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    //������Ĺ��캯��
    //ʹ��arrΪ����������һ��������ǰListNodeΪͷ���
    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("empty array");
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    //�Ե�ǰ���Ϊͷ����������Ϣ
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + " -> ");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }
}
