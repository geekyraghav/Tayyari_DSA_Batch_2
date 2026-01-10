package OOPS;
class Flower{
    int petals;
    String color;
    String name;
    Flower(String name, String color, int petals){ // Parameterised Constructor
        this.name = name;
        this.color = color;
        this.petals = petals;
    }
    Flower(){ // Default Constructor

    }
    Flower(Flower f){
        this.name = f.name;
        this.color = f.color;
        this.petals = f.petals;
    }
    void print(){
        int petals = -5;
        System.out.println(name+" "+color+" "+this.petals);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Flower f1 = new Flower("Rose","Red",25);
        f1.print();
//        final int x = 10;
//        System.out.println(x);
//        x = 9;

        Flower f2 = new Flower("Sunflower","Yellow",8);
        f2.print();

        Flower f3 = new Flower();
        f3.name = "Lotus";
        f3.color = "Pink";
        f3.petals = 10;
        f3.print();

        Flower f4 = f1; // f4 is a shallow copy of f1
        f4.name = "Lavendar";
        f1.print();

        Flower f5 = new Flower(f1); // f5 is a deep copy of f1
        f5.petals = 100;
        f5.print();
        f1.print();
    }
}
