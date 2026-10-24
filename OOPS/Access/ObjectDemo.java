package OOPS.Access;

public class ObjectDemo {
    int num;

    ObjectDemo(int num) {
        this.num = num;
    }

    // It is unique representation of object via number
    @Override 
    public int hashCode() {
        return num;
    }

    @Override 
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override 
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(10);
        ObjectDemo obj1 = new ObjectDemo(10);
        System.out.println(obj.hashCode());
        if(obj.equals(obj1)) {
            System.out.println("Both are same and equal");
        }else {
            System.out.println("Both are different and not equal");
        }

        System.out.println(obj1 instanceof ObjectDemo);
        System.out.println(obj1.getClass().getName());
    }
}
