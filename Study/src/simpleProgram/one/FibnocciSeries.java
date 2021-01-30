package simpleProgram.one;

public class FibnocciSeries{
    public static void main(String[] args){
        int fibnum1=0;
        int fibnum2=1;
        System.out.println(fibnum1);
        System.out.println(fibnum2);
        for(int count=2;count<10;count++){
            int result=fibnum1+fibnum2;
            System.out.println(result);
            fibnum1=fibnum2;
            fibnum2=result;
        }
    }



    }

