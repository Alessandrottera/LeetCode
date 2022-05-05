package leetCode.easy;

import leetCode.utils.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode root = new ListNode(1);
        root.next = new ListNode(1);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(3);
        removeDuplicatesFromSortedList.deleteDuplicates(root);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curNode = head, lastNode = head.next;
        while (lastNode != null) {
            if (curNode.val == lastNode.val) {
                curNode.next = lastNode.next;
            } else {
                curNode = curNode.next;
            }
            lastNode = lastNode.next;
        }

        return head;
    }
}
