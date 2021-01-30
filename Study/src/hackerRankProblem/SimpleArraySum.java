package hackerRankProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {
    static int sum = 0;
    static int simpleArraySum(int a[]) {

//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
        int sum=Arrays.stream(a).sum();

        return sum;


    }
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Limit");
        int n = sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements Are:::\n");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        int sum=simpleArraySum(a);
        System.out.println("\nSum of Array is::::"+sum);
    }



}