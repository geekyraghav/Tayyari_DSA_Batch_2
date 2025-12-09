package OOPS;
class Car{
    String name; // null
    int power; // 0
    Car(String n, int p){
        name = n;
        power = p;
    }
    Car(int p, String n){
        name = n;
        power = p;
    }
    Car(){

    }
}
public class PassingObjectsToMethods {
    public static void change(Car c){ // Pass by reference
        c.power = 140;
    }
    public static void main(String[] args) {
        Car c1 = new Car("Kia Sonet",118);

        System.out.println(c1.name+" "+c1.power);
        change(c1);
        System.out.println(c1.name+" "+c1.power);

        Car c2 = new Car(530,"BYD Seal");
        System.out.println(c2.name+" "+c2.power);

        Car c3 = new Car();
    }
}
