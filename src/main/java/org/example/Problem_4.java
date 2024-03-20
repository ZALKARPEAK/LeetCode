package org.example;

public class Problem_4 {
    /*public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        HashMap<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for (ListNode current = dummy; current != null; current = current.next) {
            sum += current.val;
            map.put(sum, current);
        }

        sum = 0;
        for (ListNode current = dummy; current != null; current = current.next) {
            sum += current.val;
            current.next = map.get(sum).next;
        }

        return dummy.next;
    }*/
}