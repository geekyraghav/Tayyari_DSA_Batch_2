package OOPS;
class Students{
    private String teacherName = "Raghav";
    String name;
    int rno;
    double cgpa;
    String getTeacherName(){ // getter
        return teacherName;
    }
    void setTeacherName(String n){ // setter
        teacherName = n;
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.getTeacherName());
        s1.setTeacherName("Ranjan");
        System.out.println(s1.getTeacherName());
    }
}
