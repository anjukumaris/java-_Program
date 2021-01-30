package method;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:::");
        int num=sc.nextInt();
         factNum(num);
         sc.close();
    }
    public static void factNum(int num){
        int fact=1,i;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+ " is:::::"+fact);
    }
}
