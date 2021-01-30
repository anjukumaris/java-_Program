package method;

public class Power1 {
    public static void main(String[] args){
        int no=2;
        int res=power(no,5);
        System.out.println("result:::"+res);
        res=power(3,6);
        System.out.println("result:::"+res);
        res=power(6,4);
        System.out.println("result:::"+res);
    }
  private static int power(int no,int pow){
        int result=1;
       for(int i=1;i<=pow;i++){
            result*=no;
       }
       return result;
  }
}
