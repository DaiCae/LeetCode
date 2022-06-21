import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode p = new ListNode();
        ListNode res = p;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length,
                (a, b) -> {
                    if (a.val > b.val) {
                        return 1;
                    } else if (a.val < b.val) {
                        return -1;
                    } else {
                        return 0;
                    }
                });
        for (ListNode head : lists) {
            if (head != null) pq.add(head);
        }
        while (!pq.isEmpty()) {
            p.next = pq.poll();
            p = p.next;
            if (p.next != null) pq.add(p.next);
        }
        return res.next;
    }

}