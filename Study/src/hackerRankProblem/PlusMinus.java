package hackerRankProblem;
import java.util.Scanner;
public class PlusMinus {
    static float countZero=0,countPositive=0,countNegative=0;
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size::");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Elements Array are::::");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements::");
        for(int a:arr){
            System.out.println(a+"\t");
        }
        System.out.println("PLUS MINUS");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            else if(arr[i]<0){
                countNegative++;
            }
            else
                countPositive++;
        }
        countZero/=arr.length;
        countPositive/=arr.length;
        countNegative/=arr.length;
        System.out.println(countPositive);
        System.out.println(countNegative);
        System.out.println(countZero);
    }
}
