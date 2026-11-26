package LinkedList.Sort.BubbleSort;

public class Main {
    // Bubble Sort -
    public void bubbleSort(ListNode head) {
        bubble(size-1, 0);
    }

    public void bubble(int row, int col) {
        if(row==0) {
            return;
        }
        if(col<row) {
            ListNode first = get(col);
            ListNode second = get(col+1);

            if(first.val < second.val) {
                // Swap -
                if(first==head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second==tail) {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = first;
                }else {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            bubble(row, col+1);
        }else {
            bubble(row-1, 0);
        }
    }

    public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }
}
