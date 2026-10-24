package OOPS.Generics.Comparing;
import java.util.Arrays;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public int compareTo(Student o) {
        return (int)(this.marks-o.marks);
    }

    @Override
    public String toString() {
        return (this.rollno) + ",  " + (this.marks) + "";
    }

    public static void main(String[] args) {
        Student Kunal = new Student(221, 98.57f);
        Student Javed = new Student(222, 92.97f);
        Student Imran = new Student(223, 99.97f);
        Student Sameer = new Student(224, 23.97f);
        Student Jishan = new Student(225, 56.97f);
        Student Anas = new Student(226, 83.97f);

        Student[] list = {Kunal, Javed, Imran, Sameer, Jishan, Anas};
        Arrays.sort(list);
        Arrays.sort(list, (o1, o2)-> -(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

        if(Javed.compareTo(Kunal) > 0) {
            System.out.println("Javed has more marks");
        }else if(Javed.compareTo(Kunal) == 0) {
            System.out.println("Both have equal marks");
        }else {
            System.out.println("Kunal has more marks"+ Javed.compareTo(Kunal));
        }
    }
}
