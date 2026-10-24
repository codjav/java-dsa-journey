package OOPS.Generics;

import java.util.Arrays;

public class WildCard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    WildCard() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        
        for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustumArrayList{" + "data=" + Arrays.toString(data) +", size=" +size + "}";
    }


    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>(); 
        WildCard<Integer> list = new WildCard<>();
        list.add(45);
        list.add(5);
        list.add(9);
        System.out.println(list);

        // WildCard<String> list2 = new WildCard<>();
    }
}
