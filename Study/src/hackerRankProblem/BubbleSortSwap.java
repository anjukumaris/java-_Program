package hackerRankProblem;
import java.util.Scanner;
public class BubbleSortSwap {
    public static  void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size::");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Elements:::::");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements:::::");
        for(int array:arr){
            System.out.print(array+"\t");
        }
        int numSwap=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    numSwap++;
                }
            }
        }
        System.out.println("\nSorted array::::");
        for(int a:arr){
            System.out.print(a+"\t");
        }
        System.out.println("\nArray is sorted in\t"+numSwap+"\t swaps.");
        System.out.println("First Element::\t"+arr[0]);
        System.out.println("last Element :::\t"+arr[arr.length-1]);
    }
}
