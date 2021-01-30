package simpleProgram.one;

public class FactorialNumber {
    public static void main(String[] args){
        int no=5;
        int fact=1;
        for(int i=no;i>=2;i--){
            fact*=i;
        }
        System.out.println("Factorial of a number is:"+fact);
    }
}
