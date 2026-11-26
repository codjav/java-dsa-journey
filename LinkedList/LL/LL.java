package LinkedList.LL;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    public void size() {
        System.out.println(size);
    }

    // * Insertion through Recursion -
    public void insertRec(int val, int idx) {
        head = insertRec(val, idx, head);
    }

    private Node insertRec(int val, int idx, Node node) {
        if(idx==0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, idx-1, node.next);
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null) {
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if(tail==null) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insertIndex(int idx, int value) {
        if(idx==0) {
            insertFirst(value);
            return;
        }else if(idx==size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<idx; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head==null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node getIndex(int idx) {
        Node node = head;
        for(int i=0; i<idx; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if(size<=1) {
            return deleteFirst();
        }
        Node secondLast = getIndex(size-2);
        int val = tail.value;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }

    public int deleteIndex(int idx) {
        if(idx<=1) {
            return deleteFirst();
        }else if(idx==size) {
            return deleteLast();
        }
        Node prevIndex = getIndex(idx-2);
        int val = prevIndex.next.value;
        prevIndex.next = prevIndex.next.next;
        size--;
        return val;
    }

    public Node find(int val) {
        Node node = head;
        while(node!=null) {
            if(node.value==val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //! Quesitons -
    //! Quesitons -
    //! Quesitons -

    public void RemoveDuplicate() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }
}
