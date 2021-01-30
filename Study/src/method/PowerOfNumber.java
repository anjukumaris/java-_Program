package method;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number::::");
        int num=sc.nextInt();
        int temp=num;
        System.out.println("Enter power:::");
        int power=sc.nextInt();
       // numberPower(num,power);
        int  r=powerNum(num,power);
        System.out.println("The  "+power+"  th power of "+ num+"  is:::"+r);
        sc.close();

    }
    public static void numberPower(int number,int power1){
        System.out.println("The  "+power1+"  th power of "+ number+"  is:::"+(Math.pow(number,power1)));
    }
    public static int powerNum(int num1,int power1) {
        int result=1;
        if(num1==0&&power1>=1){
            result=0;
        }
        else if(num1>=1&&power1==0){
            result=1;
        }
        else {
            for (int i = 1; i <= power1; i++) {
                result = result * num1;
            }
        }
        return result;
    }


    }
