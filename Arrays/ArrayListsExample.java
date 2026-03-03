package Arrays;

import java.util.ArrayList;

public class ArrayListsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(78);
        list.add(738);
        list.add(786);
        list.add(785);
        list.add(784);
        list.add(788);
        list.add(7890);

        list.set(0, 982);
        list.add(983);
        list.remove(982);
        list.contains(983);

        System.out.println(list.get(4));

        System.out.println(list);
    }
}
