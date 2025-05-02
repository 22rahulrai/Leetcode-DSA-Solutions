package questions.leetcode;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;

    }
}
public class llcycle_141 {
    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Connect nodes to form: 3 -> 2 -> 0 -> -4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create a cycle: -4 -> 2 (pos = 1)
        node4.next = node2;

        System.out.println("Printing linked list (with cycle):");
        printList(node1);

        // Check for cycle
        boolean result = hasCycle(node1);
        System.out.println("Cycle detected: " + result);  // Output: true
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    public static void printList(ListNode node) {
        int count = 0;
        while (node != null && count < 10) {
            System.out.print(node.val + " -> ");
            node = node.next;
            count++;
        }
        if (count >= 10) {
            System.out.print("... (stopped to avoid infinite loop due to cycle)");
        } else {
            System.out.println("null");
        }
    }
}
