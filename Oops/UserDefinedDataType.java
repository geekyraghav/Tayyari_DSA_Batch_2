package OOPS;
class Student{ // khud ka ek data type bana liya
    String name; // null
    int rno; // 0
    double cgpa; // 0.0
    void print(){
        System.out.println(name + " " + rno + " " + cgpa);
    }
}
public class UserDefinedDataType {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Sanskar";
        x.rno = 181;
        x.cgpa = 8.0;
        x.print();

        Student y = new Student();
        y.name = "Satyam";
        y.rno = 66;
        y.cgpa = 8.4;
        y.print();

        Student z = new Student();
        z.name = "Sreekanth";
        z.rno = 20;
        z.cgpa = 8.1;
        z.print();

        Student[] arr = {x,y,z};
        for(Student s : arr){
            s.print();
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i].name);
//        }
    }
}
