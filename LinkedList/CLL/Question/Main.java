package LinkedList.CLL.Question;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Main {
    public static void main(String[] args) {
    }
    //! Find if there is cycle -
    // public boolean hasCycle(ListNode head) {
    //     ListNode fast = head;
    //     ListNode slow = head;

    //     while(fast!=null && fast.next!=null) {
    //         fast = fast.next.next;
    //         slow = slow.next;
    //         if(fast==slow) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //! Find length of the cycle -
    // public int lenCycle(ListNode head) {
    //     ListNode fast = head;
    //     ListNode slow = head;

    //     while(fast!=null && fast.next!=null) {
    //         fast = fast.next.next;
    //         slow = slow.next;
    //         if(fast==slow) {
    //             int count = 1;
    //             slow = slow.next;
    //             while(slow!=fast) {
    //                 slow = slow.next;
    //                 count++;
    //             }
    //             return count;
    //         }
    //     }
    //     return 0;
    // }

    //! Find first node of cycle
    // public ListNode detectCycle(ListNode head) {
    //     ListNode fast = head;
    //     ListNode slow = head;
        
    //     while(fast!=null && fast.next!=null) {
    //         fast = fast.next.next;
    //         slow = slow.next;
    //         if(fast==slow) {
    //             int count = 1;
    //             slow = slow.next;
    //             while(slow!=fast) {
    //                 slow=slow.next;
    //                 count++;
    //             }

    //             slow = head;
    //             fast = head;
    //             for(int i=0; i<count; i++) {
    //                 slow = slow.next;
    //             }

    //             while(slow!=fast) {
    //                 fast = fast.next;
    //                 slow = slow.next;
    //             }
    //             return slow;
    //         }
    //     }
    //     return null;
    // }
}
