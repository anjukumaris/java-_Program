package arrays;

import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit::");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Array Elements Are:::");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Elements are::");
        for(int i:num) {
            System.out.print(i+" ");
        }
        int a=0;
        for(int i=0;i<n;i++){
            a=a+num[i];
        }
        System.out.println();
        System.out.println("Addition::"+a);
        sc.close();
    }
}
