package LinkedList.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertIndex(3, 111);
        list.insertLast(99);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(1));
        list.display();
        list.insertRec(786, 2);
        list.display();
        // Node n = list.find(111);
        // System.out.println(list.find(111).value);
        list.size();
    }
}
