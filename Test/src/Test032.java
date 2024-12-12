class Person {
    String name;
    int age = 25;
    Person (String name) { // line 1
        setName(name);
    }
    public Person (String name, int age) {
        this.name = name; // line 2
        setAge(age);
    }
    // setter and getter methods go here
    public void setName (String name) { this.name = name; }
    public void setAge (int age) { this.age = age; }
    public String show() {
        return name + " " + age;
    }
}
public class Test032 {
    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}