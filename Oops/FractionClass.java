package OOPS;
class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        if(den==1) System.out.println(num);
        else System.out.println(num+"/"+den);
    }
    private int hcf(int a, int b) {
        if(a==0) return b;
        return hcf(b%a,a);
    }
    void simplify(){
        int h = hcf(num,den);
        num /= h;
        den /= h;
        if(den<0 && num>0){
            den = -den;
            num = -num;
        }
    }
    void multiply(Fraction f){
        num = num * f.num;
        den = den * f.den;
        simplify();
    }
    void divide(Fraction f){
        num = num * f.den;
        den = den * f.num;
        simplify();
    }

    void add(Fraction f) {
        num = num*f.den + den*f.num;
        den = den*f.den;
        simplify();
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(-4,-12);
        f1.print();
        Fraction f2 = new Fraction(2,-3);
        f2.print();
        f1.add(f2);
        f1.print();
        f1.multiply(f2); // f1 me change hoga
        f1.print();
    }
}
