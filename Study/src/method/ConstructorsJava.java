package method;

public class ConstructorsJava {
    int x;
    int num;String n;
    ConstructorsJava(){
        x=5;
    }
    ConstructorsJava(int i,String name){
         num=i;
          n=name;
    }
    public static void main(String[] ar){
        ConstructorsJava obj=new ConstructorsJava();
        System.out.println("XXXX is:::"+obj.x);
        ConstructorsJava obj1=new ConstructorsJava(100,"aaaaaa");
        System.out.println("yyyyyyyy::::"+obj1.num+" "+obj1.n);

    }

}
