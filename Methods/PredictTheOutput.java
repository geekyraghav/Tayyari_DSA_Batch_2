package Methods;
public class PredictTheOutput {
    public static void alviya() {
        System.out.println("Anushka");
    }
    public static void shyam() {
        System.out.println("Bhumika");
        alviya();
    }
    public static void main(String[] args) {
        ranjan();
        System.out.println("Shreya");
        ravina();
    }
    public static void ravina() {
        System.out.println("Karn");
        shyam();
    }
    public static void ranjan() {
        ravina();
        System.out.println("Pranjal");
        alviya();
    }
    /* OUTPUT
        karn
        bhumika
        anushka
        pranjal
        anushka
        shreya
        karn
        bhumika
        anushka
     */
}
