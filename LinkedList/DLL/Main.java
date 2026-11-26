package LinkedList.DLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();
        list.displayReverse();
        list.insertLast(111);
        list.display();
        list.insert(10, 121);
        list.display();
    }
}
