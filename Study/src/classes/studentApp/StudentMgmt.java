package classes.studentApp;

public class StudentMgmt {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setStu_id(101);
        s1.setStu_name("AAMI");
        s1.setStu_mark1(78);
        s1.setStu_mark2(55);
        s1.setStu_mark3(98);

        System.out.println(s1.getStu_id());
        System.out.println(s1.getStu_name());
        System.out.println(s1.getStu_mark1());
        System.out.println(s1.getStu_mark2());
        System.out.println(s1.getStu_mark3());
        Student s2=new Student(102,"HARI",98,58,47);
        s2.printTranscript();
        Student s3=new Student(103,"KIRAN");
        s3.setStu_mark1(69);
        s3.setStu_mark2(88);
        s3.setStu_mark3(77);
        s3.printTranscript();

    }
}
