package staticExcerise;

public class StaticTest {
    public static void main(String[] arg){
//        StaticStudy ss1= new StaticStudy();
//        StaticStudy ss2=new StaticStudy();
//        System.out.println(ss1.no);
//        System.out.println(ss2.no);

        StaticStudy. no=10;
        System.out.println(StaticStudy.no);
        System.out.println(StaticStudy.greetings());
    }
}
