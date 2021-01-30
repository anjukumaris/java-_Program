package hackerRankProblem;

import java.util.Scanner;

public class BilzzProblem {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=0;i<100;i++) {
            if(num%3==0){
                if(num%5==0){

                }
                else{
                    System.out.println("Buzz");
                }
            }
            else if(num%5==0){
                System.out.println("fizz");
            }



        }
    }
}

