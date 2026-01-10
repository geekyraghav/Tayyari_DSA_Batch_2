package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Car c1 = new Car("Sierra",160);
        Car c2 = new Car("XEV9s",282);
        c1.print();
        c1.transport = "Air";
        c2.transport = "Water";
        System.out.println(c1.transport);
        System.out.println(c2.transport);
        System.out.println(Car.transport);
    }
}
