package LinkedList.Sort.MergeSort;

public class Main {
    //! Reverse LL -
    public ListNode reverse(ListNode head) {
        if(head.next==null) {
            return head;
        }
        ListNode tail = reverse(head.next);
        tail.next = head;
        tail = head;
        tail.next = null;
        return tail;
    }

    //! Inplace Reversal of LL -
    public ListNode revplace(ListNode head) {
        if(size<2) {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while(pres!=null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    // ! Is linked list palindrome -
    public boolean isPalindrome(ListNode head) {
        int size = 1;
        ListNode node = head;
        while(node!=null) {
            node = node.next;
            size++;
        }
        reverseBetween(head, size/2+1, size);
        return true;
    }

    //! In between based reversal -
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;

        for(int i=1; pres!=null && i<left; i++) {
            prev = pres;
            pres = pres.next;
        }

        ListNode last = prev;
        ListNode newEnd = pres;

        ListNode next = pres.next;
        for(int i=0; prev!=null && i<right-left+1; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null) {
                next = next.next;
            }
        }

        if(last!=null) {
            last.next = prev;
        }else {
            head = prev;
        }
        newEnd.next = pres;
        return head;
    }

    //! Merge Sort - 
    public ListNode mergeSort(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(rightHead);

        return Merge(left, right);
   }

    //! Merge List 
    public ListNode Merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while(l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            }else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }
        while(l1!=null) {
            tail.next = l1;
            tail = tail.next;
            l1 = l1.next;
        }
        while(l2!=null) {
            tail.next = l2;
            tail = tail.next;
            l2 = l2.next;
        }
        return head.next;
    }

    //! Middle 
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }
    }
}
