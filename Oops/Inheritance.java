package OOPS;
class Car{
    static String transport = "Land";
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
    static void print(){
        System.out.println(transport);
    }
}
class Luxurycar extends Car{

}
class Supercar extends Car{
    int turbo;
}
class Hypercar extends Supercar{
    int cornering;
}
public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        Supercar s = new Supercar();
        s.turbo = 1;
        s.name = "BMW M340i";
        s.power = 340;
        Hypercar h = new Hypercar();
        h.cornering = 140;
    }
}
