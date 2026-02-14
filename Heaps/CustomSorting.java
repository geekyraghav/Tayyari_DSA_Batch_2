package Heaps;
import java.util.Arrays;
//class Student implements Comparable<Student>{
//    String name;
//    int rno;
//    double cgpa;
//    Student(String name, int rno, double cgpa){
//        this.name = name;
//        this.rno = rno;
//        this.cgpa = cgpa;
//    }
//    public int compareTo(Student s) {
//        if((this.name).equals(s.name)) return Integer.compare(s.rno,this.rno);
//        return (s.name).compareTo(this.name);
//    }
//}
class Student{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
}
public class CustomSorting {
    static void main() {
        Student s1 = new Student("Raghav",76,7.1);
        Student s2 = new Student("Satyam",65,7.85);
        Student s3 = new Student("Deepika",73,9.4);
        Student s4 = new Student("Vedik",45,8.6);
        Student s5 = new Student("Raghav",67,9.9);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr,(x,y)->Double.compare(x.cgpa,y.cgpa));
        for(Student s : arr){
            System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        }
    }
}
