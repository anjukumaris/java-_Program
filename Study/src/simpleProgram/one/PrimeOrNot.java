package simpleProgram.one;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int flag,i;
        boolean primeno=true;
        System.out.println("Enter a number to check prime or not");
        int num=sc.nextInt();

        for( i=2;i<=num/2;i++) {
            flag = num % i;
            if (flag == 0) {
                primeno = false;
                break;
            }
        }
            if(primeno){
                System.out.println(num+"   is a prime ");
            }
            else{
                System.out.println(num+"   is not prime");
            }


        }

            }






