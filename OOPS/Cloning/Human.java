package OOPS.Cloning;

public class Human implements Cloneable {
    int age;
    String name;

    Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        // Swallow Copy
        return super.clone();

        // Deep Copy
        // Human Imran = (Human)(super.clone());
        // Imran.arr = new int[Imran.arr.length];
        // for(int i=0; i<Imran.arr.length; i++) {
        //     Imran.arr[i] = this.arr[i];
        // }
        // return Imran;
    }
}
