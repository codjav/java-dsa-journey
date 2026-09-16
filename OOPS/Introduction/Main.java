package OOPS.Introduction;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student javed = new Student();
        // javed.name="Mohammad Javed Ali";
        // javed.rno = 100;
        // javed.marks = 99.99f;
        // System.out.println(javed);
        System.out.println(javed.name);
        javed.changeName("Muhammad Javed Ali");
        javed.getName();
        System.out.println(javed.rno);
        System.out.println(javed.marks);

        Student Kunal = new Student(8, 90.9f, "Kunal Kushwaha");
        Kunal.getName();
        Kunal.changeName("wemakedevs");
        Kunal.getName();

        Student imran = new Student(Kunal);
        imran.getName();
    }

}
class Student {
    int rno;
    String name;
    final String religion = "islam";
    float marks=90;

    void getName() {
        System.out.println("Your name is "+ this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Student() {
    //     this.rno = 9;
    //     this.name = "javed";
    //     this.marks = 90.9f;
    // }
    Student() {
        this (1, 89.90f, "imran");
    }

    Student(int rno, float marks, String name) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
}