package classes.studentApp;


public class Student {
    private int stu_id;
    private String stu_name;
    private int stu_mark1;
    private int stu_mark2;
    private int stu_mark3;

    public Student() {
    }

    public Student(int stu_id, String stu_name, int stu_mark1, int stu_mark2, int stu_mark3) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_mark1 = stu_mark1;
        this.stu_mark2 = stu_mark2;
        this.stu_mark3 = stu_mark3;
    }

    public Student(int stu_id, String stu_name) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {      // private,public,default,protected----- In default access specifier we cannot use other packages..//
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_mark1() {
        return stu_mark1;
    }

    public void setStu_mark1(int stu_mark1) {
        this.stu_mark1 = stu_mark1;
    }

    public int getStu_mark2() {
        return stu_mark2;
    }

    public void setStu_mark2(int stu_mark2) {
        this.stu_mark2 = stu_mark2;
    }

    public int getStu_mark3() {
        return stu_mark3;
    }

    public void setStu_mark3(int stu_mark3) {
        this.stu_mark3 = stu_mark3;
    }


    public void printTranscript(){
        System.out.println("________________________");
        System.out.println("STUDENT ID::::"+stu_id);
        System.out.println("NAME:::::"+stu_name);
        System.out.println("MARK1:::::"+stu_mark1);
        System.out.println("MARK2::::::"+stu_mark2);
        System.out.println("MARK3:::::"+stu_mark3);
        int total=stu_mark1+stu_mark2+stu_mark3;
        System.out.println("TOTAL MARK:::::"+total);
    }
}
