package method;
import java.util.Scanner;
public class SumOfNumber {
   public static int sum=0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:::");
        int num = sc.nextInt();
        //sumOfNumber obj = new sumOfNumber();
        //obj.number(num);
        int sum=number(num);
        System.out.println("Sum of Digits of  " + num + "  is::" +sum);
        sc.close();

    }
    public static int number(int num){

        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
}
