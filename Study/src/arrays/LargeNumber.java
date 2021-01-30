package arrays;
import java.util.Scanner;
public class LargeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter limit::");
        int n=sc.nextInt();
        //int large[]=new int[n];
        int[] num=new int[n];
        System.out.println("Array Elements Are:::");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Elements in we entered in an array is::");
        for(int i:num) {
            System.out.println(i+" ");
        }
        int max=num[0];
        for(int i=1;i<num.length-1;i++) {

            if (max < num[i]) {
                max = num[i];

            }
        }
            System.out.println("Large Number is:::::"+max);

        }

    }

