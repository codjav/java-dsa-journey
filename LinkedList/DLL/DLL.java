package LinkedList.DLL;

public class DLL {
    private Node head;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        if(tail==null) {
            tail = head;
        }
        head = node;
        return;
    }

    public void insertLast(int value) {
        if(head==null) {
            insertFirst(value);
            return;
        }
        Node prev = head;
        while(prev.next!=null) {
            prev = prev.next;
        }
        Node node = new Node(value, prev, null);
        prev.next = node;
    }

    public void insert(int after, int value) {
        Node p = find(after);
        if(p==null) {
            System.out.println("Node does not exit.");
            return;
        }
        Node node = new Node(value, p, p.next);
        p.next = node;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while(node!=null) {
            if(node.value==value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public void display() {
        Node node = head;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node node = tail;
        while(node!=null) {
            System.out.print(node.value+"->");
            node = node.prev;
        }
        System.out.println("END");
    }

    public class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
