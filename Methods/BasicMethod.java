package Methods;
public class BasicMethod {
    public static void supriya(){
        System.out.println("Hello Simran");
    }
    public static void main(String[] args) {
        nitish(); // call lagana
        System.out.println("Hello Gursewak");
        supriya();
        nitish();
    }
    public static void nitish(){
        System.out.println("Hello Sarthak");
        supriya();
    }
    /* OUTPUT
    Hello Sarthak
    Hello Simran
    Hello Gursewak
    Hello Simran
    Hello Sarthak
    Hello Simran
     */
}
