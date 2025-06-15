package questions.leetcode;

public class sort_linkedlist_0_1_2 {
    /* Definition of singly Linked List:
class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/


    public ListNode sortLi(ListNode head) {
        int c0 = 0, c1 = 0, c2 = 0;

        ListNode temp = head;
        while (temp != null) {
            if (temp.val == 0) {
                c0++;
            } else if (temp.val == 1) {
                c1++;
            } else {
                c2++;
            }
            temp = temp.next;
        }

        temp = head;


        while (c0 >= 0) {
            temp.val = 0;
            c0--;
            temp = temp.next;
        }

        while (c1 >= 0) {
            temp.val = 1;
            c1--;
            temp = temp.next;
        }


        while (c2 >= 0) {
            temp.val = 2;
            c2--;
            temp = temp.next;
        }
        return head;
    }


    public ListNode sortList(ListNode head) {
        ListNode zerod = new ListNode(0);
        ListNode oned = new ListNode(1);
        ListNode twod = new ListNode(2);

        ListNode zero = zerod, one = oned, two = twod;

        ListNode cur = head;

        while (cur != null) {
            if (cur.val == 0) {
                zero.next = cur;
                zero = zero.next;
            } else if (cur.val == 1) {
                one.next = cur;
                one = one.next;
            } else {
                two.next = cur;
                two = two.next;
            }
            cur = cur.next;
        }

        zero.next = (oned.next != null) ? oned.next : twod.next;
        one.next = twod.next;
        two.next = null;

        return zerod.next;

    }
}

}
