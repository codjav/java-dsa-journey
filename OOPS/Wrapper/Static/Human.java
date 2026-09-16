package OOPS.Wrapper.Static;

public class Human {
    String name;
    int age;
    boolean married;
    int salary;
    static long population;

    public Human(String name, int age, boolean married, int salary) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.salary = salary;
        Human.population += 1;
    }
}
