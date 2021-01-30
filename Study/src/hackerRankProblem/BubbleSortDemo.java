package hackerRankProblem;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSortDemo {
    public static void main(String[] ar){
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
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            numSwap++;
        }

        System.out.println("\nNumSwap::::"+numSwap);
        System.out.println("Sorted Array::::");
        for(int a:arr){
            System.out.print(a+"\t");
        }
        System.out.println("First Element::::"+arr[0]);
        System.out.println("last ele:::"+arr[n-1]);
    }
}
