package LinkedList;
class Person{
    String name;
    int age;
}
public class ReferenceOrAddress {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Raghav";
        p.age = 26;

        Person q = p; // q is shallow copy of p
        System.out.println(p);
        System.out.println(q);

        Person r = new Person();
        p = r;
        System.out.println(p+" "+p.name+" "+p.age);
        System.out.println(q+" "+q.name+" "+q.age);
    }
}
