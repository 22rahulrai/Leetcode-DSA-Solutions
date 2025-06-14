package questions.leetcode;
import java.util.HashSet;

public class Intersxn_two_linkedlist_160 {
    //brute force TC= O(N*M)
    public static ListNode method1(ListNode headA, ListNode headB) {
        ListNode temp1=headA;

        while(temp1!=null){
            ListNode temp2=headB;
            while(temp2!=null){
                if(temp1==temp2){
                    return temp1;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return null;

    }

    //better approach tc= o(m+n) space =O(m) or O(n)
    public static ListNode method2(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        HashSet<ListNode> set=new HashSet<>();

        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }

        temp=headB;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    // optimal solution TC = O(n+m) space =O(1)
    public static ListNode method3(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }

        ListNode t1=headA;
        ListNode t2=headB;

        while(t1!=t2){
            if(t1!=null){
                t1=t1.next;
            }
            else{
                t1=headB;
            }

            if(t2!=null){
                t2=t2.next;
            }
            else{
                t2=headA;
            }
        }

        return t1;
    }

}
