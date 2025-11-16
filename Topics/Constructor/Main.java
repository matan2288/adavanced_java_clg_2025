class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        System.out.println(p.name); // Alice
    }
}